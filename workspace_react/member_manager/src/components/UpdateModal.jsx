import React, { useState } from "react";
import './UpdateModal.css'
import axios from "axios";
import { useParams } from "react-router-dom";

const UpdateModal = (props) => {
  const params = useParams();
  const {member} = props;
  console.log(member[0].memPw);

  const [mem, setMem] = useState({...member[0], memPw : ""})

  const updateF = () => {
    if(member[0].memPw !== mem.memPw){
      alert("비밀번호가 틀립니다.")
    } else {
    axios.put(`/api/members/detail/${params.memId}`, mem).then((res)=>{
      window.location.reload();
    }).catch((error)=>{
      console.log(error);
    })
  }
}

  const saveMem = (e) => {
    setMem({...mem,
      [e.target.name] : e.target.value
    })
  }

  return (
    <div className="update-window">
      <div>내용입력</div>
      <div>
        연락처
        <input type="text" name="memTel" value={mem.memTel} onChange={(e)=>{
          saveMem(e);
        }} />
      </div>
      <div>
        소개글
        <textarea name="memIntro" value={mem.memIntro} onChange={(e)=>{
          saveMem(e);
        }} />
      </div>
      <div>
        비밀번호 확인
        <input type="password" name="memPw" onChange={(e)=>{
          saveMem(e);
        }}/>
      </div>
      <div>
        <button type="button" onClick={(e)=>{
          updateF();
        }}>수정하기</button>
      </div>
    </div>
  );
};

export default UpdateModal;
