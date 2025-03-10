import axios from 'axios'
import React, { useEffect, useState } from 'react'

export const Axios_7 = () => {
  const [phone, setPhone] = useState({
    brand : 'samsung',
    price : 1000,
    color : 'red',
  });

  // axios.post('api/t8', phone).then(()=>{}).catch(()=>{});

  const [student, setStudent] = useState({
    name : 'kim',
    korScore : 80,
    engScore : 70,
    mathScore : 90,
  });

  const [sum, setSum] = useState(0);

  useEffect(()=>{
    axios.post('api/t9', student).then((res)=>{
      console.log()
      setSum(res.data)
    }).catch((error)=>{
      console.log(error)
    });
  }, []);

  // 아래 코드의 결과로 전달되는 데이터를 자바에서 받은 후 전달된 국, 영, 수 점수의 총점을 다시 리액트로 가져와서 화면에 총점을 나타내세요.
  

  return (
    <>
      <div>Axios_7</div>
      
          <div>
            <p>이름 : {student.name}</p>
            <p>국어점수 : {student.korScore}</p>
            <p>영어점수 : {student.engScore}</p>
            <p>수학점수 : {student.mathScore}</p>
            <p>총점 : {sum}</p>
          </div>
    </>
  )
}

export default Axios_7