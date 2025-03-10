import React from 'react'

export const LottoControl = (props) => {
  const {number, create} = props;

  return (
    <div className='btn-area'>
      {
        Object.keys(number).map((n, i)=>{
          return (
            <button type='button' key={i} name={n} onClick={(e)=>{
              create(e.target.name);
            }}>생성</button>
          )
        })
      }     
    </div>
  )
}

export default LottoControl