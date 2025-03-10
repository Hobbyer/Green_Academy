import React from 'react'

export const Map_forEach = () => {
  function aaa() {
    console.log(3);
  }

  // 자바스크립트의 반복문 : for, for of, forEach(), map()

  const arr = [1, 2, 3];

  //forEach() : () 안의 내용(함수)을 반복 실행!!, 배열에서만 사용.
  arr.forEach((item, i)=>{
    console.log(`item = ${item}, index = ${i}`);
  });

  //map() : () 안의 내용(함수)를 반복 실행!, forEach()와의 차이점은 return으로 데이터를 받아 올 수 있다.
  const result = arr.map((item, i)=>{
    console.log(`item = ${item}, index = ${i}`)
    return item * 2;
  });

  console.log(result);
  console.log(`result : ${result}`)


  return (
    <>
      <div>
        Map_forEach
      </div>
      <div>
        
      </div>
    </>
  )
  
}

export default Map_forEach