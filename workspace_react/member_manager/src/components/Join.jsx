import axios from 'axios'
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const Join = () => {
  const nav = useNavigate();
  
  const [data, setData] = useState({});

  const dataSave = (e) => {
    setData({...data, [e.target.name] : e.target.value})
  }

  const submit = () => {
    axios.post("/api/members", data).then((res)=>{
      console.log("데이터 전송완료!")
      // console.log(data);
    }).catch((error)=>{
      console.log("통신오류")
      console.log(data);
      console.log(error);
    })
  }

  return (
    <div>
      <div>회원가입</div>
      <div>
        <table>
          <tbody>
            <tr>
              <td>아이디</td>
              <td>
                <input type="text" name='memId' required onChange={(e)=>{dataSave(e)}}/>
              </td>
            </tr>
            <tr>
              <td>이름</td>
              <td>
                <input type="text" name='memName' required onChange={(e)=>{dataSave(e)}}/>
              </td>
            </tr>
            <tr>
              <td>비밀번호</td>
              <td>
                <input type="password" name='memPw' required onChange={(e)=>{dataSave(e)}}/>
              </td>
            </tr>
            <tr>
              <td>연락처</td>
              <td>
                <input type="text" name='memTel' onChange={(e)=>{dataSave(e)}}/>
              </td>
            </tr>
            <tr>
              <td>본인소개</td>
              <td>
                <textarea name='memIntro' onChange={(e)=>{dataSave(e)}}/>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <button type='button' onClick={()=>{
        submit();
        nav('/')
        window.location.reload;
      }}>회원가입</button>
    </div>
  )
}

export default Join