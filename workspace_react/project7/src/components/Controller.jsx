import React, { useState } from 'react'

export const Controller = (props) => {
  const {num, setNum} = props;

  return (
    <div>
      <button type='button' onClick={(e)=>{
        setNum(num -1);
      }}>-1</button>
      <button type='button' onClick={(e)=>{
        setNum(num -10);
      }}>-10</button>
      <button type='button' onClick={(e)=>{
        setNum(num -100);
      }}>-100</button>
      <button type='button' onClick={(e)=>{
        setNum(num +100);
      }}>+100</button>
      <button type='button' onClick={(e)=>{
        setNum(num +10);
      }}>+10</button>
      <button type='button' onClick={(e)=>{
        setNum(num +1);
      }}>+1</button>
    </div>
  )
}

export default Controller