import React from 'react'

export const LottoDisplay = (props) => {
  const {number} = props;

  return (
    <div className='num-board'>
      {
        Object.values(number).map((v, i)=>{
          return (
            <div key={i}>{v}</div>
          )
        })
      }
    </div>
  )
}

export default LottoDisplay