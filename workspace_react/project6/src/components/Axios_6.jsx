import axios from 'axios'
import React from 'react'

export const Axios_6 = () => {
  
    axios.post('api/t7', {name : 'kim', age : 20, addr : '그린아카데미'}).then((res)=>{
      console.log("전달 성공!")
    }).catch((error)=>{
      console.log("전달 실패")
    })

    return (
    <>
      <div>axios를 사용하여 서버에 데이터 전달하기</div>
    </>
  )
}

export default Axios_6