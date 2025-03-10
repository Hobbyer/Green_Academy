import React, { useEffect, useState } from 'react'

export const Effect_1 = () => {
  const [cnt1, setCnt1] = useState(0);
  const [cnt2, setCnt2] = useState(0);

  useEffect(()=>{
    console.log(5);
  }, []); // useEffect(함수, 의존성배열);
  // 의존성 배열을 어떻게 작성하냐에 따라 useEffect의 리렌더링 시점의 실행여부를 결정.
  // 의존성 배열을 빈배열로 선언하면 useEffect의 함수는 mount 될때만 실행된다!

  // useEffect 여러개 사용가능.
  // 의존성배열 안에 변수를 작성하면, mount 될때 와 해당 변수의 데이터가 변경돼서 리렌더링 될때 실행한다.
  useEffect(()=>{
    console.log(cnt2);
  }, [cnt2]);

  // 의존성배열 안에 변수가 여러개일 경우, mount 될때와 변수들 중 하나라도 데이터가 변경돼서 리렌더링 되면 실행한다.
  useEffect(()=>{
    console.log(cnt2);
  }, [cnt1, cnt2]);

  return (
    <>
      <div>Effect_1</div>
      <button type='button' onClick={()=>{
        setCnt1(cnt1 + 1);
      }}>cnt1</button>
      <button type='button' onClick={()=>{
        setCnt2(cnt2 + 2);
      }}>cnt2</button>
      <button type='button'>cnt1+cnt2</button>
    </>
  )
}

export default Effect_1