import React from 'react'


// localList를 사용하여 selectbox를 그리세요.
export const Map_3 = () => {
  const localList = ["경기도", "강원도", "경상도", "전라도"];

  return (
    <>
      <select name="" id="">
        {
          localList.map((local, i)=>{
            return <option value="" key={i}>{local}</option>
          })
        }
      </select>
    </>
  )
}

export default Map_3