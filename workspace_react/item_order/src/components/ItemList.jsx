import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useNavigate } from 'react-router-dom'

const ItemList = () => {
  const nav = useNavigate();

  const [itemList, setItemList] = useState({});

  useEffect(()=>{
    axios.get('/api/items').then((res)=>{
      setItemList(res.data)
    }).catch((error)=>{
      console.log(error);
    })
  }, [])

  return (
    <div className='list'>
      <div>상품 목록</div>
      <div>
        <table>
          <thead>
            <tr>
              <th>No</th>
              <th>상품명</th>
              <th>상품가격</th>
              <th>판매자</th>
            </tr>
          </thead>
          <tbody>
            {
              Object.keys(itemList).map((i)=>{
                return (
                  <tr key={i}>
                    <td>{itemList.length - i}</td>
                    <td>
                      <Link to={`/item/${itemList[i].itemNum}`}>
                      {itemList[i].itemName}
                      </Link>
                    </td>
                    <td>\{(itemList[i].itemPrice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ","))}</td>
                    <td>{itemList[i].seller}</td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
        <span>
          총 {itemList.length}개의 상품이 등록되었습니다.
        </span>
      </div>
    </div>
  )
}

export default ItemList