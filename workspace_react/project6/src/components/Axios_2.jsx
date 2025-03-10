import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Axios_2 = () => {
  const [str, setStr] =useState("");

  useEffect(()=>{
    axios.get('api/t1').then((res)=>{
      setStr(res.data);
    }).catch((error)=>{
      console.log("통신 실패")
    });
  });

  return (
    <>
      <div>Axios_2</div>
      <div>{str}</div>
    </>
  )
}

export default Axios_2