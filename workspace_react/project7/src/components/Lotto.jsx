import React, { useState } from 'react'
import LottoTitle from './LottoTitle'
import LottoDisplay from './LottoDisplay'
import LottoControl from './LottoControl'
import axios from 'axios'

export const Lotto = () => {
  // 생성 버튼 클릭시 자바에서 1~45까지의 랜덤한 수를 받아온 후 해당 자리에 나타내기.
  const [number, setNumber] = useState({
    num1 : 0,
    num2 : 0,
    num3 : 0,
    num4 : 0,
    num5 : 0,
    num6 : 0,
  })

  const create = (name) => {
    axios.get('api/t11').then((res)=>{
      setNumber({...number, [name] : res.data});
    }).catch((error)=>{
      console.log("통신실패");
    })
  };

  return (
    <div>
      <LottoTitle />
      <div>
        <LottoDisplay number={number} />
        <LottoControl number={number} create={create}/>
      </div>
    </div>
  )
}
export default Lotto