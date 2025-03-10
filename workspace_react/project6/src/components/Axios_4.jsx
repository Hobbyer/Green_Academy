import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Axios_4 = () => {
  // 데이터 변경 및 리렌더링을 위한 state변수 생성.
  const [p, setPerson] = useState([]);

  useEffect(()=>{
    // 서버에 있는 데이터 가져오기
    axios.get('api/t5').then((res)=>{
      setPerson(res.data); // 서버에서 가져온 데이터를 state변수의 데이터 변경 및 리렌더링.
    }).catch((error)=>{
      console.log("통신실패")
    });
  }, []);
  

  const click = (e) => {
    axios.get('api/t5').then((res)=>{
      console.log("통신성공");
    
      setPerson(res.data);
      
      console.log(p);
    }).catch((error)=>{
      console.log("통신실패");
    });
  };

  return (
    <>
      <div>Axios_4</div>
      <button type='button' onClick={(e)=>{
        click();
      }}>클릭</button>
      <div>
        <table>
          <tbody>
            <tr>
              <td>이름</td>
              <td>나이</td>
              <td>주소</td>
            </tr>
          {
            p.map((info, index)=>{
              return(
                <tr key={index}>
                  <td>{info.name}</td>
                  <td>{info.age}</td>
                  <td>{info.addr}</td>
                </tr>
              )
            })
          }
          </tbody>
        </table>
      </div>
    </>
  )
}

export default Axios_4