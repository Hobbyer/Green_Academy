import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const ItemDetail = () => {
  const params = useParams();
  const nav = useNavigate();

  const [itemInfo, setItemInfo] = useState([]);
  console.log(params);

  useEffect(()=>{
    axios.get(`/api/items/${params.cateCode}/${params.bookCode}`).then(res=>{
      setItemInfo(res.data);
      console.log(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }, [])

  return (
    <div>
      <table>
        <thead>
          <tr>
            <td colSpan={2}>
              {itemInfo.bookName}
            </td>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td colSpan={2}>
              <img src="" alt="이미지자리" />
            </td>
          </tr>
          <tr>
            <td>출판일</td>
            <td>
              {dayjs(itemInfo.regDate).format('YYYY-MM-DD')}
            </td>
          </tr>
          <tr>
            <td>출판사</td>
            <td>
              {itemInfo.publisher}
            </td>
          </tr>
          <tr>
            <td>책 설명</td>
            <td>
              {itemInfo.bookInfo}
            </td>
          </tr>
          <tr>
            <td>가격</td>
            <td>
              \ {itemInfo.bookPrice} 원
            </td>
          </tr>
        </tbody>
      </table>
      <div>
        <button type='button'>
          바로구매
        </button>
        <button type='button' onClick={(e)=>{
          
          confirm('장바구니로 이동하시겠습니까?') ? nav('/basket') : null
        }} >
          장바구니 담기
        </button>
      </div>
    </div>
  )
}

export default ItemDetail