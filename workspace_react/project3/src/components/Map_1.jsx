import React from 'react'

export const Map_1 = () => {
  const arr1 = [1, 2, 3, 4, 5];

  return (
    <>
      <div>
        Map_1
      </div>
      {
        arr1.map((item, i)=>{
          return <p key={i}>{item}</p>
        })
      }
    </>
  )
}

export default Map_1