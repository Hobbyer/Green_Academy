import { useState } from "react";

const StateTest = () => {
  console.log(3);
  //useState는 실행 후 두 개의 데이터를 갖는 배열을 리턴
  //배열의 첫번째 데이터는 소괄호 안에 작성된 데이터를 리턴한다.
  let [hobby, setHobby] = useState('잠자기');

  let [num, setNum] = useState('0')

  const countClick = () => {
    setNum(num+1);
  };

  return (
  <>
    <div style={{backgroudColor:'red'}}>
      {num}
    </div>
    <button type="button" onClick={countClick}>클릭</button>
    <div>
      {hobby}
    </div>
    <button type="button" onClick={() => {
      setHobby('밥먹기');
    }}>취미변경!</button>
  </>
  )
};

export default StateTest