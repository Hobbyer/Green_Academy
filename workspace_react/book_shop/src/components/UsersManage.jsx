import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'

const UsersManage = () => {
  const [userList, setUserList] = useState([]);

  useEffect(()=>{
    axios.get('/api/admins/users').then(res=>{
      setUserList(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }, [])


  return (
    <div>
      <table>
        <thead>
          <tr>
            <th>No</th>
            <th>아이디</th>
            <th>이름</th>
            <th>이메일</th>
            <th>연락처</th>
            <th>권한</th>
            <th>상태</th>
            <th>가입일</th>
            <th></th>
            <th></th>
          </tr>
        </thead>
        <tbody>
          {
            userList.map((user, i)=>{
              return(
                <tr key={i}>
                  <td>{userList.length - i}</td>
                  <td>{user.userId}</td>
                  <td>{user.userName}</td>
                  <td>{user.userEmail}</td>
                  <td>{user.userTel}</td>
                  <td>{user.userRoll}</td>
                  <td>{user.isUsing}</td>
                  <td>{dayjs(user.joinDate).format('YYYY-MM-DD')}</td>
                  <td>
                    <button type=''>수정</button>
                  </td>
                  <td>
                    <button type=''>삭제</button>
                  </td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}

export default UsersManage