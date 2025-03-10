import React, { useState } from 'react'

export const Input_1 = () => {
  // input 태그에 입력된 내용(값)을 저장할 변수 생성(state 변수)
  const [data, setData] = useState("");


  return (
    <>
      <h2>input태그에 데이터 입력받기</h2>
      <input type="text" onChange={(e)=>{
        console.log(e.target.value)
        setData(e.target.value);
      }}/>
      <div>
        input 태그에 입력한 내용 : {data}
      </div>
    </>
  )
}

export default Input_1