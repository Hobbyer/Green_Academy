import React, { useEffect, useState } from 'react'

const State변경함수흐름2 = () => {
  const [num, setNum] = useState(0);

  useEffect(()=>{
    setNum(num + 1);
    setNum(num + 1);
    setNum(num + 1);
    // 비동기 방식 로직으로 일괄적으로 작동한다. 즉 num = 1이 된다

    setNum(state => {
      return state + 1 // 함수의 리턴 값을 useState의 변수의 값으로 업데이트
    }); // 매개변수 : useState의 변수의 값. 이 값은 항상 최신의 값을 유지
    setNum(state => {
      return state + 1 // 함수의 리턴 값을 useState의 변수의 값으로 업데이트
    }); // 매개변수 : useState의 변수의 값. 이 값은 항상 최신의 값을 유지
    setNum(state => {
      return state + 1 // 함수의 리턴 값을 useState의 변수의 값으로 업데이트
    }); // 매개변수 : useState의 변수의 값. 이 값은 항상 최신의 값을 유지
    
    // 여전히 비동기 방식으로 작동하지만 num의 값을 최신의 값으로 업데이트해서 최종적으로 num = 3이 된다. (useState의 setNum함수가 마지막에 일괄처리되지만 useState의 set함수는 순서대로 작동하는것처럼(?) 된다.)

  }, [])

  


  return (
    <div>State변경함수흐름2</div>
  )
}

export default State변경함수흐름2