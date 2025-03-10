import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'

const OrderList = () => {
  const [orderList, setOrderList] = useState([]);

  const [totalPrice, setTotalPrice] = useState([]);

  const [checkedList, setCheckedList] = useState([]);
  const numChecked = checkedList.length;


  const handler = (orderNum) => {
    const isChecked = checkedList.includes(orderNum);

    if (isChecked) {
      setCheckedList(checkedList.filter((el)=>el != orderNum));
    } else {
      setCheckedList([...checkedList, orderNum]);
    }
  };

  const AllChecked = (e) => {
    if (e.target.checked) {
      setCheckedList(orderList.map((order)=>
        order.orderNum
      ));
      setTotalPrice(orderList.map((order)=>
        order.buyPrice
      ));
    } else {
      setCheckedList([]);
      setTotalPrice([]);
    }
  }

  var sum = 0;
  totalPrice.forEach((price)=>{
    sum += price
  })

  useEffect(()=>{
    axios.get('/api/orders').then((res)=>{
      setOrderList(res.data);
  }).catch((error)=>{
      console.log(error);
    })
  }, [])

  const delBtn = () => {

  }

  return (
    <div className='list'>
      <span>
        총 {orderList.length}건의 주문정보가 검색되었습니다.
      </span>
      <div>
        <table>
          <thead>
            <tr>
              <th><input type="checkbox" onChange={(e)=>{
                AllChecked(e);
              }} checked={numChecked === orderList.length} /></th>
              <th>No</th>
              <th>상품명</th>
              <th>상품단가</th>
              <th>구매수량</th>
              <th>구매가격</th>
              <th>주문자</th>
              <th>주문일</th>
            </tr>
          </thead>
          <tbody>
            {
              orderList?.map(({orderNum, itemDTO, buyCnt, buyPrice, buyer, buyDate}, i)=>{  
                return (
                  <tr key={orderNum}>
                    <td>
                      <input type='checkbox' onChange={(e)=>{
                        
                        handler(orderNum);

                        e.target.checked ? setTotalPrice([...totalPrice, buyPrice]): setTotalPrice(totalPrice.filter((price)=> price !== buyPrice))
                      
                       }} checked={checkedList.includes(orderNum)} />
                    </td>

                    <td>{orderList.length-i}</td>
                    <td>{itemDTO.itemName}</td>
                    <td>\{itemDTO.itemPrice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")}</td>
                    <td>{buyCnt}</td>
                    <td>\{buyPrice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")}</td>
                    <td>{buyer}</td>
                    <td>{dayjs(buyDate).format('YYYY-MM-DD')}</td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>
      <div className='total-price'>
        <table>
          <tbody>
            <tr>
              <td>총 구매가격</td>
              <td>\{
                sum.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")
              }</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default OrderList