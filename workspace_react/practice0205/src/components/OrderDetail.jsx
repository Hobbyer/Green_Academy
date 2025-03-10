import React from 'react'

export const OrderDetail = (props) => {
  const {list, tag} = props;
  console.log(tag.keyNum)

  let n = tag.keyNum;

  return (
    <div className={tag.detail} id='order-detail'>
      <div className='title'>
        <p>주문 상세 정보</p>
      </div>
      <table>
        <tbody>
          <tr>
            <td>상품번호</td>
            <td>{list[n].mdNum}</td>
            <td>상품명</td>
            <td>{list[n].mdName}</td>
          </tr>
          <tr>
            <td>가격</td>
            <td>{list[n].price}원</td>
            <td>수량</td>
            <td>{list[n].amount}</td>
          </tr>
          <tr>
            <td>주문자ID</td>
            <td>{list[n].userId}</td>
            <td>구매금액</td>
            <td>{list[n].price * list[n].amount}원</td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}

export default OrderDetail