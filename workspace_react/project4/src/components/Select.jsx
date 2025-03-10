import React, { useState } from 'react'

export const Select = () => {
  const [fruit, setFruit] = useState('');

  return (
    <>
      <select value={fruit} onChange={(e)=>{
        setFruit(e.target.value);
      }}>
        <option value="banana">바나나</option>
        <option value="orange">오렌지</option>
        <option value="apple">사과</option>
        <option value="grape">포도</option>
        <option value="peach">복숭아</option>
      </select>

      <div>
        선택된 과일 : {fruit}
      </div>
    </>
  )
}

export default Select