import { useState } from "react";

function ObjectTest () {
  const [monitor, setMonitor] = useState({
    brand : 'Samsung',
    price : 10000,
    color : 'black',

});

  return(
    <>
      <div>
        ObjectTest
        <p>브랜드 : {monitor.brand}</p>
        <p>가격 : {monitor.price}</p>
        <p>색상 : {monitor.color}</p>

        <button type="button" onClick={()=>{
          // const newMonitor = {...monitor}; // 배열, 객체의 경우 새로운 변수 선언 후 스프레드 연산으로 변수초기화를 먼저해준다!!(핵심)
          // newMonitor.brand = "LG";
          // setMonitor(newMonitor);

          setMonitor({...monitor, brand: 'LG'});
        }}>버튼</button>
      </div>
    </>
  )
}

export default ObjectTest