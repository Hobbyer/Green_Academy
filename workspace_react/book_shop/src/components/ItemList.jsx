import axios from 'axios';
import React, { useEffect, useState } from 'react'
import styles from './ItemList.module.css'
import { Link, useOutletContext } from 'react-router-dom';
import { getItemList } from '../apis/bookApi';

const ItemList = (props) => {
  const [totalList, setTotalList] = useState([]);

  const {getList, switch1, switch2} = useOutletContext();
  
  useEffect(()=>{
    getItemList().then(res=>{
      setTotalList(res.data)
    }).catch(error=>{
      console.log(error);
    })
  }, [])

  return (
    <div className={styles.itemList}>
      <table>
        <thead>
          <tr>
            <th>No</th>
            <th>제목</th>
            <th>가격</th>
            <th>출판사</th>
            <th>잔여수량</th>
          </tr>
        </thead>
        <tbody>
          {
            totalList.map((item, i)=>{
              return(
              <tr key={i} id="total" style={{display:`${switch1}`}}>
                <td>{totalList.length - i}</td>
                <td><Link to={`/detail/${item.cateCode}/${item.bookCode}`}>{item.bookName}</Link></td>
                <td>\ {item.bookPrice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")}원</td>
                <td>{item.publisher}</td>
                <td>{item.bookStock}</td>
              </tr>)
            })
          }
          { getList !== undefined ?
            getList.map((item, j)=>{
              return(
              <tr key={j} id="total" style={{display:`${switch2}`}}>
                <td>{getList.length - j}</td>
                <td><Link to={`/detail/${item.cateCode}/${item.bookCode}`}>{item.bookName}</Link></td>
                <td>\ {item.bookPrice.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",")}원</td>
                <td>{item.publisher}</td>
                <td>{item.bookStock}</td>
              </tr>)
            }) : null
          }
        </tbody>
      </table>
    </div>
  )
}

export default ItemList