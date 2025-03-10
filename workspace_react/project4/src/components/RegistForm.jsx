import React, { useState } from 'react'

export const RegistForm = () => {
  const [data, setData] = useState({
    name : "",
    contact : "",
    email : "",
    subject : "",
  });

  function dataChange(e){
    setData({
      ...data,
      [e.target.name] : e.target.value,
    })
  }

  return (
    <>
      <div>회원가입</div>
      <div>
        <div>
          이름
          <input type="text" name="name" value={data.name} onChange={(e)=>{
            dataChange(e);
          }}/>
        </div>
        <div>
          연락처
          <input type="text" name="contact" value={data.contact} onChange={(e)=>{
            dataChange(e);
          }} />
        </div>
        <div>
          이메일
          <input type="text" name="email" value={data.email} onChange={(e)=>{
            dataChange(e);
          }} />
        </div>
        <div>
          희망과목
          <select name="subject" onChange={(e)=>{
            dataChange(e);
          }}>
            <option disabled selected>----</option>
            <option value="Korean">국어</option>
            <option value="English">영어</option>
            <option value="Math">수학</option>
          </select>
        </div>
      </div>
      <div>
        <div>작성내용</div>
        <div>
          <p>이름 - {data.name}</p>
          <p>연락처 - {data.contact}</p>
          <p>이메일 - {data.email}</p>
          <p>희망과목 - {data.subject}</p>
        </div>
      </div>
    </>
  )
}

export default RegistForm