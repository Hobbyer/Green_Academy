import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import UpdateModal from './updateModal';

const Detail = () => {
  const [openModal, setOpenModal] = useState(false);

  const params = useParams();
  const nav = useNavigate();

  const [member, setMember] = useState({});
  
  useEffect(()=>{
    axios.get(`/api/members/detail/${params.memId}`).then((res)=>{
      setMember(res.data);
    }).catch((error)=>{
      console.log(error);
    })  
  }, []);

  const deleteF = () => {
    if (confirm("정말 삭제하실건가요?")){
    axios.delete(`/api/members/${params.memId}`).then((res)=>{
      console.log("삭제성공!");
      nav('/');
    }).catch((error)=>{
      console.log("삭제실패");
      console.log(error);
    });
  } else {
    window.location.reload;
  }
  }
  

  return (
    <div>
      <div>
      회원 상세페이지
      </div>
      <div>
        <table>
          <thead>
            <tr>
              <th>아이디</th>
              <th>이름</th>
              <th>연락처</th>
              <th>소개글</th>
            </tr>            
          </thead>
          <tbody>
            {
              Object.keys(member).map((i)=>{
                return (
                  <tr key={i}>
                    <td>{member[i].memId}</td>
                    <td>{member[i].memName}</td>
                    <td>{member[i].memTel}</td>
                    <td>{member[i].memIntro}</td>
                  </tr>
                )
              }
            )}
          </tbody>
        </table>
      </div>
      <div>
        <button type='button' onClick={()=>{
          openModal ? setOpenModal(false) :
          setOpenModal(true);
        }}>수정</button>
        {openModal ? <UpdateModal member={member} openModal={openModal} setOpenModal={setOpenModal} /> : null} 
        <button type='button' onClick={(e)=>{
          deleteF();
        }}>삭제</button>
      </div>     
    </div>
  )
}

export default Detail