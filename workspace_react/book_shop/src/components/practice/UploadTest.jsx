import axios from 'axios';
import React, { useState } from 'react'

const UploadTest = () => {
  // 첨부파일 input 태그에서 선택한 파일을 저장할 변수
  const [firstFile, setFirstFile] = useState(null);

  const fileConfig = {headers : {'Content-Type' : 'multipart/form-data'}}; // 파일 전송 시 필수

  const sendFile = () => {
    // FormData 객체 생성
    const formData = new FormData();
    // append 메소드로 key-value 형태로 데이터를 추가한다.
    formData.append('firstFile', firstFile);

    // axios.post('url', data, config)
    // config : { headers : { 'Content-Type' : 'multipart/form-data' }}
    axios.post('/api/test/upload1', formData, fileConfig)
    .then(res=>{
      console.log(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }

  return (
    <div>
      <input type="file" onChange={(e)=>{ 
        setFirstFile(e.target.files[0]) // 선택한 파일을 변수에 저장
      }} multiple />
      <button type='button' onClick={sendFile} >파일 전송1</button>
    </div>
  )
}

export default UploadTest