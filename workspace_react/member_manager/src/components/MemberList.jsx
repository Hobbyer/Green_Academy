import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { Link, useNavigate } from 'react-router-dom';


const MemberList = () => {
  const nav = useNavigate();
  

  // 회원 목록을 테이블 형태로 출력
  const [mem, memSet] = useState({});

  useEffect(()=>{
    axios.get("/api/members").then((res)=>{
      memSet(res.data);
      // console.log(res.data);
    }).catch((error)=>{
      console.log("통신실패")
    })
  }, []);
  

  return (
    <div>
      <table>
        <thead>
          <tr>
            <th>NO</th>
            <th>아이디</th>
            <th>이름</th>
            <th>연락처</th>
            <th>가입일</th>
          </tr>
        </thead>
        <tbody>
          {
            Object.keys(mem).map((i)=>{
              return (              
                <tr key={i}>
                  
                    <td>{mem.length - i}</td>
                    <td>
                      <Link to={`/detail/${mem[i].memId}`}>
                        {mem[i].memId}
                      </Link>
                    </td>
                    <td>{mem[i].memName}</td>
                    <td>{mem[i].memTel}</td>
                    <td>{(mem[i].joinDate).substr(0,10)}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
      <div>
          <button type='button' onClick={(e)=>{
            nav('/join');
          }}>회원가입하기</button>
        </div>
    </div>
  )
}

export default MemberList