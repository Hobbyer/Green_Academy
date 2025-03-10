import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams, useSearchParams } from 'react-router-dom';

const BoardSearchList = () => {
  const nav = useNavigate();
  const [params, setParams] = useSearchParams();

  const [boardList, setBoardList] = useState({});
  const [search, setSearch] = useState({});

  useEffect(()=>{
    axios.get(`/api/boards?id=${params.get('id')}&search=${params.get('search')}`).then((res)=>{
      setBoardList(res.data);
    }).catch((error)=>{
      console.log(error);
    })
  }, [])

  return (
    <div>
      <div>
        <h1>자유 게시판</h1>
      </div>
      <div>
        <select id='searchId' defaultValue={"title"}>
          <option value="title">제목</option>
          <option value="writer">작성자</option>
        </select>
        <input type="text" onChange={(e)=>{
          setSearch({
            [document.getElementById('searchId').value] : e.target.value
          });
        }}/>
        <button type='button' onClick={()=>{
          document.getElementById('searchId').value == "title" ?
          nav(`/title?id=title&search=${search.title}`) :
          nav(`/writer?id=writer&search=${search.writer}`)
          window.location.reload();
        }}>검색</button>
      </div>
      <table>
        <thead>
          <tr>
            <th>No</th>
            <th>제목</th>
            <th>작성자</th>
            <th>작성일</th>
            <th>조회수</th>
          </tr>
        </thead>
        <tbody>
          {
            Object.keys(boardList).map((i)=>{
              return (
                <tr key={i}>
                  <td>{boardList.length - i}</td>
                  <td><Link to={`/detail/${boardList[i].boardNum}`}>{boardList[i].title}</Link></td>
                  <td>{boardList[i].writer}</td>
                  <td>{(boardList[i].regDate).substr(0, 10)}</td>
                  <td>{boardList[i].readCnt}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
      <div className='btn-area'>
        <button type='button' onClick={(e)=>{
          nav('/write');
        }}>글쓰기</button>
      </div>
    </div>
  )
}

export default BoardSearchList