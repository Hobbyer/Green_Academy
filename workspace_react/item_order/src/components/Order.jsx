import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const Order = () => {
  const nav = useNavigate();
  const params = useParams();

  const [itemList, setItemLIst] = useState({});
  const [insertOrder, setInsertOrder] = useState({});

  useEffect(()=>{
    axios.get('/api/items').then((res)=>{
      setItemLIst(res.data);
    }).catch((error)=>{
      console.log(error);
    })
  }, [])

  const saveValue = (e) => {
    setInsertOrder({...insertOrder,
      [e.target.name] : e.target.value
  })
  }

  const orderBtn = () => {
    axios.post('/api/orders', insertOrder).then((res)=>{}).catch((error)=>{
      console.log(error);
    })
  }


  return (
    <div className='insertTable'>
      <div>상품 주문</div>
      <div>
        <table>
          <tbody>
            <tr>
              <td>주문상품</td>
              <td>
                <select name="itemName" defaultValue={"---"} onChange={(e)=>{
                  saveValue(e);

                  Object.keys(itemList).forEach(function(key)
                  {if (itemList[key].itemName === e.target.value){
                    setInsertOrder({...insertOrder,
                      itemNum : itemList[key].itemNum,
                      itemPrice : itemList[key].itemPrice
                    })
                  }}
                )
                }}>                
                <option value={"---"} disabled>- - - -</option>
                  {
                    Object.keys(itemList).map((i)=>{
                      return (
                        <option value={itemList[i].itemNamm} key={i}>
                          {itemList[i].itemName}
                        </option>
                      )
                    })
                  }
                </select>
              </td>
            </tr>
            <tr>
              <td>상품단가</td>
              <td>
                <input type="text" name='itemPrice' defaultValue={insertOrder.itemPrice} readOnly  />
              </td>
            </tr>
            <tr>
              <td>주문자</td>
              <td>
                <input type="text" name='buyer' onChange={(e)=>{
                  saveValue(e);
                }} />
              </td>
            </tr>
            <tr>
              <td>주문 수량</td>
              <td>
                <input type="text" name='buyCnt' onChange={(e)=>{
                  setInsertOrder({...insertOrder,
                    [e.target.name] : e.target.value,
                    buyPrice : e.target.value * insertOrder.itemPrice
                })
                }} />
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='btn-area'>
        <button type='button' onClick={(e)=>{
          orderBtn();
          nav('/orderList');
          window.location.reload();
        }} >
          주문하기
        </button>
      </div>
    </div>
  )
}

export default Order