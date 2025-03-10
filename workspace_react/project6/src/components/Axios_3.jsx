import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Axios_3 = () => {
  const [person, setPerson] = useState({
    name: "",
    age : "",
    adrr : ""
  });

  const [btn, btn1Set] = useState("on");

  useEffect(()=>{
    axios.get('api/t4').then((res)=>{
      setPerson({
        name : res.data.name,
        age : res.data.age,
        addr : res.data.addr,
      });
    }).catch((error)=>{
      console.log("통신실패");
    });
  }, [btn]);

  return (
    <>
      {/* <div>Axios_3</div> */}
      <div className={btn}>
        <div>{person.name}</div>
        <div>{person.age}</div>
        <div>{person.addr}</div>
      </div>

      <div>
        <button type='button' onClick={(e)=>{
          btn == "on" ? btn1Set("off") : btn1Set("on");
        }}>
          버튼
        </button>
      </div>
    </>
  )
}

export default Axios_3