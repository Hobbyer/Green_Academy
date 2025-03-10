import React, { useState } from 'react'
import Display from './Display'
import Controller from './Controller'

export const Counter = () => {
  const [num, setNum] = useState(0);
  
  return (
    <>
      <div>
        <p>Simple Counter</p>
      </div>
      <Display num={num} />
      <Controller num={num} setNum={setNum} />
    </>
  )
}

export default Counter