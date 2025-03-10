import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const ItemDetail = () => {
  const nav = useNavigate();
  const params = useParams();

  const [itemDetail, setItemDetail] = useState({});
  const [updateItem, setUpdateItem] = useState({});

  useEffect(()=>{
    axios.get(`/api/items/${params.itemNum}`).then((res)=>{
      setItemDetail(res.data);
      setUpdateItem(res.data);
    }).catch((error)=>{
      console.log(error);
    })
  }, [])

  const updateText = (e) => {
    setUpdateItem({...updateItem,
      [e.target.name] : e.target.value
    })
  }

  const updateBtn = () => {
    axios.put(`/api/items/${params.itemNum}`, updateItem).then((res)=>{}).catch((error)=>{
      console.log(error);
    })
  }

  return (
    <div className='insertTable'>
      <div>상품 상세 정보</div>
      <div>
        <table>
          <tbody>
            <tr>
              <td>상품번호</td>
              <td>
                <input name='itemNum' type="text" defaultValue={itemDetail.itemNum} readOnly />
              </td>
            </tr>
            <tr>
              <td>상품명</td>
              <td>
                <input name="itemName" type="text" defaultValue={itemDetail.itemName} onChange={(e)=>{
                  updateText(e);
                }} />
              </td>
            </tr>
            <tr>
              <td>상품가격</td>
              <td>
                <input name="itemPrice" type="text" defaultValue={itemDetail.itemPrice} onChange={(e)=>{
                  updateText(e);
                }} />
              </td>
            </tr>
            <tr>
              <td>판매자</td>
              <td>
                <input name="seller" type="text" defaultValue={itemDetail.seller} readOnly />
              </td>
            </tr>
            <tr>
              <td>상품등록일</td>
              <td>
                <input name='regDate' type="text" defaultValue={dayjs(itemDetail.regDate).format('YYYY-MM-DD')} readOnly />
              </td>
            </tr>
            <tr>
              <td>상품 설명</td>
              <td>
                <textarea name="itemIntro" cols="30" rows="10" defaultValue={itemDetail.itemIntro} onChange={(e)=>{
                  updateText(e);
                }} />
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='btn-area'>
        <button type='button' onClick={(e)=>{
          updateBtn();
          nav('/');
          window.location.reload();
        }} >
          수정
        </button>
      </div>
    </div>
  )
}

export default ItemDetail