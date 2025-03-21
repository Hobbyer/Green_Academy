import axios from 'axios';
import React, { useState } from 'react'

const UploadTest = () => {
  // 첨부파일 input 태그에서 선택한 파일을 저장할 변수
  const [firstFile, setFirstFile] = useState(null);

  // 첨부파일 다중파일을 저장할 변수
  const [secondFile, setSecondFile] = useState(null);


  // 파일 전송 시 필요한 설정
  const fileConfig = {headers : {'Content-Type' : 'multipart/form-data'}};

  const sendFile = () => {
    // FormData 객체 생성
    const formData = new FormData();
    // append 메소드로 key-value 형태로 데이터를 추가한다.
    formData.append('secondFiles', secondFile);

    axios.post('/api/test/upload1', formData, fileConfig)
    .then(res=>{
      console.log(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }

  // 다중 파일 전송
  const sendFiles = () => {
    const formData = new FormData();

    if (secondFile !== null) {

    for(let i=0; i<secondFile.length; i++){
      formData.append('secondFiles', secondFile[i]);
    }

  }

    axios.post('/api/test/upload2', formData, fileConfig)
    .then(res=>{
      console.log(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }

  return (
    <div>
      {/* 단일파일 업로드 */}
      <input type="file" onChange={(e)=>{ 
        setFirstFile(e.target.files[0]) // 선택한 파일을 변수에 저장
      }} multiple /> {/* multiple 속성을 추가하면 여러 파일을 선택할 수 있다.  */}
      <button type='button' onClick={sendFile} >파일 전송1</button>

      {/* 다중파일 업로드 */}
      <input type="file" onChange={(e)=>{
        setSecondFile(e.target.files) // 선택한 파일들을 변수에 저장
      }} multiple />
      <button type='button' onClick={sendFiles} >다중 파일 전송</button>
    </div>
  )
}

export default UploadTest