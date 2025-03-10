import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const BoardWrite = () => {
  const [write, setWrite] = useState({});
  const nav = useNavigate();

  const saveText = (e) => {
    setWrite({...write, 
      [e.target.name] : e.target.value
    })
  }

  const submitBtn = () => {
    axios.post("/api/boards", write).then((res)=>{
      
    }).catch((error)=>{

    })
  }

  return (
    <div>
      <table>
        <tbody>
          <tr>
            <td>제목</td>
            <td>
              <input type="text" name='title' onChange={(e)=>{
                saveText(e);
              }}/>
            </td>
          </tr>
          <tr>
            <td>작성자</td>
            <td>
              <input type="text" name='writer' onChange={(e)=>{
                saveText(e);
              }} />
            </td>
          </tr>
          <tr>
            <td>내용</td>
            <td>
              <textarea name="content" onChange={(e)=>{
                saveText(e);
              }} />
            </td>
          </tr>
        </tbody>
      </table>
      <div className='btn-area'>
        <button type='button' onClick={(e)=>{
          submitBtn();
          nav('/');
          window.location.reload();
        }} >글등록</button>
      </div>
    </div>
  )
}

export default BoardWrite