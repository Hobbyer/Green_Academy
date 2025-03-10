import React from 'react'

export const OrderList = (props) => {
  const {list, onNoff} = props;
  
  return (
    <div className='order-list'>
      <div className='title'>
        <p>주문목록</p>
      </div>
      <table>
        <thead>
          <tr>
            <th>No</th>
            <th>상품명</th>
            <th>상품가격</th>
            <th>수량</th>
            <th>총구매가격</th>
          </tr>
        </thead>
        <tbody>
          {
            Object.keys(list).map((i)=>{
              return (
                <tr key={i} onClick={(e)=>{
                  onNoff(i);
                }}>
                  <td>{list.length - i}</td>
                  <td>{list[i].itemName}</td>
                  <td>{list[i].itemPrice}원</td>
                  <td>{list[i].itemCnt}</td>
                  <td>{list[i].itemPrice * list[i].itemCnt}원</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
    </div>
  )
}


export default OrderList