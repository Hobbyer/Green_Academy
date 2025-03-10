import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom'

const ItemInsert = () => {
  const nav = useNavigate();

  const [item, setItem] = useState({});

  const insertBtn = () => {
    axios.post('/api/items', item).then((res)=>{}).catch((error)=>{
      console.log(error);
    })
  }

  const saveText = (e) => {
    setItem({...item, 
      [e.target.name] : e.target.value
    })
  }

  return (
    <div className='insertTable'>
      <div>상품 상세 정보</div>
      <div>
        <table>
          <tbody>
            <tr>
              <td>상품명</td>
              <td>
                <input name="itemName" type="text" onChange={(e)=>{
                  saveText(e);
                }} />
              </td>
            </tr>
            <tr>
              <td>상품가격</td>
              <td>
                <input name="itemPrice" type="text" onChange={(e)=>{
                  saveText(e);
                }} />
              </td>
            </tr>
            <tr>
              <td>판매자</td>
              <td>
                <input name="seller" type="text" onChange={(e)=>{
                  saveText(e);
                }} />
              </td>
            </tr>
            <tr>
              <td>상품 설명</td>
              <td>
                <textarea name="itemIntro" cols="30" rows="10" onChange={(e)=>{
                  saveText(e);
                }} />
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='btn-area'>
        <button type='button' onClick={(e)=>{
          insertBtn();
          nav('/');
          window.location.reload();
        }}>
          등록
        </button>
      </div>
    </div>
  )
}

export default ItemInsert