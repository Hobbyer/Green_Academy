import React from 'react'

export const OrderList = (props) => {
  const {list, tag, onNoff} = props;
  console.log(tag.detail);

  

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
                  <td>{list[i].mdName}</td>
                  <td>{list[i].price}원</td>
                  <td>{list[i].amount}</td>
                  <td>{list[i].price * list[i].amount}원</td>
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