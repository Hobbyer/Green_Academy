import React, { useState } from 'react'

export const Input_2 = () => {
  const [data1, dataSet1] = useState("");
  const [data2, dataSet2] = useState("");
  const [data3, dataSet3] = useState("");


  // state변수 한개만 사용할때는 초기값을 객체로 준다!
  const [data, setData] = useState({
    name : "",
    age : "", 
    addr : "",
  });

  // 함수를 별로도 생성하여 사용할 수 있다.
  function changeData(e){
    setData({
      ...data,
      [e.target.id] : e.target.value
    })
  }

  return (
    <>
      이름 : <input type="text" id='name' onChange={(e)=>{
        changeData(e);
      }}/> <br />
      나이 : <input type="text" id='age' onChange={(e)=>{
        changeData(e);
      }}/> <br />
      주소 : <input type="text" id='addr' onChange={(e)=>{
        changeData(e);
      }}/> <br />

      <div>
        입력받은 이름 : {data.name}
      </div>
      <div>
        입력받은 나이 : {data.age}
      </div>
      <div>
        입력받은 주소 : {data.addr}
      </div>
    </>
  )
}

export default Input_2