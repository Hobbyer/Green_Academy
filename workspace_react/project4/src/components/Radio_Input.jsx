import React, { useState } from 'react'

export const Radio_Input = () => {
  const [radioInfo, setRadio] = useState({
    value : ""
  });

  function checkFirm(e){
    console.log(e.target.value);
    setRadio(
      {
        ...radioInfo,
        value : e.target.value,
      }
    )
  }

  return (
    <>
      <h2>Radio Input</h2>

      <input type="radio" name="a" value="bad" defaultChecked onChange={(e)=>{
        checkFirm(e);
      }}/> 나쁨 
      <input type="radio" name="a" value="soso" onChange={(e)=>{
        checkFirm(e);
      }}/> 보통
      <input type="radio" name="a" value="good" onChange={(e)=>{
        checkFirm(e);
      }}/> 좋음

      <div>
        결과 : {radioInfo.value}
      </div>
    </>
  )
}

Radio_Input