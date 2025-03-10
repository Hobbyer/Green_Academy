import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const BoardUpdate = () => {
  const params = useParams();
  const nav = useNavigate();

  const [getData, setGetData] = useState({});

  useEffect(()=>{
    axios.get(`/api/boards/${params.boardNum}`).then((res)=>{
      setGetData(res.data);
    }).catch((error)=>{
      console.log(error);
    })
  }, [])

  const updateBtn = () => {
    axios.put(`/api/boards/${params.boardNum}`, getData).then((res)=>{}).catch((error)=>{})}

  

  const updateSave = (e) => {
    setGetData({...getData, 
      [e.target.name] : e.target.value
    });
  }

  return (
    <div>
      <table>
        <tbody>
          <tr>
            <td>작성일</td>
            <td>{getData.regDate}</td>
            <td>작성자</td>
            <td>{getData.writer}</td>
          </tr>
          <tr>
            <td>제목</td>
            <td>
              <input type="text" name='title' value={getData.title} onChange={(e)=>{
                updateSave(e);
              }}/>
            </td>
          </tr>
          <tr>
            <td>내용</td>
            <td>
              <textarea name="content" value={getData.content} onChange={(e)=>{
                updateSave(e);
              }}/>
            </td>
          </tr>
        </tbody>
      </table>
      <div className='btn-area'>
          <button type='button' onClick={(e)=>{
            nav(-1)
          }}>뒤로가기</button>
          <button type='button' onClick={(e)=>{
            updateBtn();
            nav('/');
            window.location.reload;
          }}>수정</button>
      </div>
    </div>
  )
}

export default BoardUpdate