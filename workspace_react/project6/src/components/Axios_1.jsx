import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Axios_1 = () => {
  // 서버에서 받은 데이터를 저장할 state 변수
  const [num, setNum] = useState(0);

  useEffect(()=>{
    axios.get('/api/t2').then((res)=>{
      console.log("통신성공!!");
      setNum(res.data);
    }).catch((error)=>{
      console.log("통신실패..");
      console.log(error);
    });
  }, []);


  return (
    <>
      <div>axios_1</div>
      <div>{num}</div>
    </>
  )
}

export default Axios_1