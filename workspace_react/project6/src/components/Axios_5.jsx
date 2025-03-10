import axios from 'axios';
import React, { useState } from 'react'

export const Axios_5 = () => {
  // 버튼1 클릭 시 사람목록을 표로 보여주기
  // 버튼2 클릭 시 학생목록을 표로 보여주기 (이름, 국어, 영어, 수학, 총점)

  const [person, setPerson] = useState([]);
  const [student, setStudent] = useState([]);

  const [onNoff, setOnOff] = useState({
    btn1 : 'visiOff',
    btn2 : 'visiOff'
  });

  const perBtn = (e) => {
    axios.get('api/t5').then((res)=>{
      setPerson(res.data);
    }).catch((error)=>{
      console.log("api/t5 통신실패")
    });
  };
  
  const stuBtn = () => {
    axios.get('api/t6').then((res)=>{
      setStudent(res.data)
    }).catch((error)=>{
      console.log("api/t6 통신실패")
      console.log(error)
    });
  };


  return (
    <>
      <div>Axios_5</div>
      <div className='container'>
        <div className='left-box'>
          <button type='button' onClick={(e)=>{
            onNoff.btn1 == "visiOff" ? setOnOff({
              ...onNoff, 
              btn1 : "visiOn"
            }) : setOnOff({
              ...onNoff,
              btn1 : "visiOff"
            });
            perBtn();
            }} >
            버튼1
          </button>
          <div className={onNoff.btn1}>
            <table>
              <tbody>
                <tr>
                  <td>이름</td>
                  <td>나이</td>
                  <td>주소</td>
                </tr>
                {person.map((p, i)=>{
                  return (
                    <tr key={i}>
                      <td>{p.name}</td>
                      <td>{p.age}</td>
                      <td>{p.addr}</td>
                    </tr>
                  )
                })}
              </tbody>
            </table>
          </div>
        </div>
        <div className='right-box' >
          <button type='button' onClick={(e)=>{
            onNoff.btn2 == "visiOff" ? setOnOff({
              ...onNoff, 
              btn2 : "visiOn"
            }) : setOnOff({
              ...onNoff,
              btn2 : "visiOff"
            });
            stuBtn();
            }} >
            버튼2
          </button>
          <div className={onNoff.btn2}>
            <table>
              <tbody>
                <tr>
                  <td>이름</td>
                  <td>국어점수</td>
                  <td>영어점수</td>
                  <td>수학</td>
                  <td>총점</td>
                </tr>
                {student.map((s, i)=>{
                  return (
                    <tr key={i}>
                      <td>{s.name}</td>
                      <td>{s.korScore}</td>
                      <td>{s.engScore}</td>
                      <td>{s.mathScore}</td>
                      <td>{s.korScore + s.engScore + s.mathScore}</td>
                    </tr>
                  )
                })}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </>
  )
}

export default Axios_5