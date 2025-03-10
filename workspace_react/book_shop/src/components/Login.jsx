import axios from 'axios';
import React, { useState } from 'react'

const Login = () => {
  const [login, setLogin] = useState({});

  const saveData = (e) => {
    setLogin({...login,
      [e.target.name] : e.target.value
    })
  }

  const tryLogin = () => {
    axios.post(`/api/users/login`, login).then(res=>{
      if (res.data) {
        alert("로그인 성공!");
      } else {
        alert ("로그인 실패");
        
      }
    }).catch(error=>{
      console.log(error);
    })
  }

  // < get을 post방식처럼 쓰는 방법 >
  // const tryLogin = () => {
    // axios.get 으로 데이터를 전달할 때는 반드는 {params : {객체}}로 전달한다.
  //   axios.get('api/users/login', {params:{userId : login.userId, userPw : login.userPw}}).then().catch()
  // }
  // => 서버(Spring boot)에서는 @RequestParam 또는 DTO(@RequestBody는 사용하지 않는다)로 데이터를 받을 수 있다.
  // PS. 리액트 2번 PDF Query String으로 전달된 데이터를 받는 방식과 일치(페이지 번호 23번)

  return (
    <div>
      <table>
        <tbody>
          <tr>
            <td>아이디</td>
            <td>
              <input type="text" name='userId' onChange={(e)=>{
                saveData(e);
              }} />
            </td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td>
              <input type="password" name='userPw' onChange={(e)=>{
                saveData(e);
              }} />
            </td>
          </tr>
        </tbody>
      </table>
      <button type='button' onClick={()=>{
        tryLogin();
      }}>
        로그인
      </button>
    </div>
  )
}

export default Login