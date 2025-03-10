import { useEffect, useState } from 'react'
import './App.css'
import Effect_1 from './components/Effect_1';

function App() {
  // useEffect : 컴포넌트의 생애주기에 맞춰 특정 기능을 실행하기 위해 사용!
  // useEffect는 매개변수로 2개의 데이터를 가짐
  // 첫번째 매개변수 : 실행할 내용(함수)을 작성, 함수는 화살표함수로 표현
  // 두번째 매개변수 : 의존성 배열, 두번째 매개변수는 필요할 때만 사용!

  // useEffect의 두번째 매개변수를 사용하지 않으면, 컴포넌트가 mount 될 때 + update 될 때 사용하는 코드!

  const [cnt, setCnt] = useState(0);

  // useEffect는 제일 마지막에 실행 된다. 아래 코드 출력 예시 : 1 -> 2 -> 111
  // console.log(1);

  // useEffect(()=>{
  //   console.log(111);
  // });

  // console.log(2);

  return (
    <>
      <button type='button' onClick={(e)=>{
        setCnt(cnt + 1);
        console.log(cnt);
      }}>클릭</button>
      <hr />
      <Effect_1 />
    </>
  )
}

export default App
