import axios from 'axios';
import React, { useEffect, useState } from 'react'

export const Test = () => {
  const [data, setData] = useState({
    itemName : "",
    itemPrice : 0,
    itemIntro : "",
  });

  const changeOn = (e) => {
    setData({...data,
       [e.target.name] : e.target.value
      })
  }

  const btnOn = () => {
    axios.post("api/items", data).then((res)=>{
      console.log(res.data);
      console.log(data);
    }).catch((error)=>{
  
    });
  }

  const selectBtn = () => {
    axios.get("api/items").then((res)=>{
      console.log("조회완료");
    }).catch((error)=>{
      console.log("조회실패");
    })
  }

  return (
    <div>
      <table>
        <tbody>
          <tr>
            <td>제품명</td>
            <td>
              <input type="text" name='itemName' onChange={(e)=>{
              changeOn(e);
            }}/>
            </td>
          </tr>
          <tr>
            <td>제품가격</td>
            <td>
              <input type="text" name='itemPrice' onChange={(e)=>{
              changeOn(e);
            }} />
            </td>
          </tr>
          <tr>
            <td>제품설명</td>
            <td>
              <textarea name="itemIntro" onChange={(e)=>{
              changeOn(e);
            }} />
            </td>
          </tr>
        </tbody>
      </table>
      <button type='button' onClick={(e)=>{
        btnOn();
      }}>등록</button>
      <div>
        <button type='button' onClick={(e)=>{
          selectBtn();
        }}>상품 리스트 조회</button>
      </div>
    </div>
  )
}

export default Test