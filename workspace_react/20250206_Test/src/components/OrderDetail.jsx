import axios from 'axios';
import React from 'react'
import { useParams } from 'react-router-dom';

export const OrderDetail = (props) => {
  const {list, tag} = props;
  const {num} = useParams();

  // axios.get("/orders/{num}").then((res)=>{}).catch((error)=>{});

  // let n = tag.keyNum;

  return (
    <div className={tag.detail} id='order-detail'>
      <div className='title'>
        <p>주문 상세 정보</p>
      </div>
      <table>
        <tbody>
          <tr>
            <td>상품번호</td>
            <td>{list[num].itemCode}</td>
            <td>상품명</td>
            <td>{list[num].itemName}</td>
          </tr>
          <tr>
            <td>가격</td>
            <td>{list[num].itemPrice}원</td>
            <td>수량</td>
            <td>{list[num].itemCnt}</td>
          </tr>
          <tr>
            <td>주문자ID</td>
            <td>{list[num].orderUserId}</td>
            <td>구매금액</td>
            <td>{list[num].itemPrice * list[num].itemCnt}원</td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}

export default OrderDetail