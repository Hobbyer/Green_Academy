import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import styles from './ItemInsert.module.css'
import dayjs from 'dayjs';
import { getCategoryList, getItemList, insertItem } from '../apis/bookApi';
import ShopInput from '../common_component/ShopInput';
import ShopButton from '../common_component/ShopButton';

const ItemInsert = () => {
  const nav = useNavigate();

  const [cateList, setCateList] = useState([]);
  const [itemList, setItemList] = useState([]);
  const [insertForm, setInsertForm] = useState({});

  const [updateData, setUpdateData] = useState({});

  useEffect(()=>{
    getCategoryList().then(res=>{
      setCateList(res.data);
    }).catch(error=>{
      console.log(error);
    })

    getItemList().then(res=>{
      setItemList(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }, [])

  const saveF = (e) => {
    setInsertForm({...insertForm,
      [e.target.name] : e.target.value
    })
  }

  const saveUpdate = (e, item) => {
    setUpdateData({...item,
      [e.target.name] : e.target.value
  })
  }

  const submitBtn = () => {
    insertItem(insertForm).then(res=>{
    }).catch(error=>{
      console.log(error);
    })
  }

  const updateBtn = (item) => {
    updateData !== undefined ?
      axios.put(`/api/admins/item/${item.bookCode}`, updateData).then(res=>{}).catch(error=>{
        console.log(error);
      })
      : null
  }

  const deleteBtn = (item) => {
    axios.delete(`/api/admins/item/${item.bookCode}`).then(res=>{}).catch(error=>{
      console.log(error);
    })
  }


  return (
    <div>
      <table>
        <tbody>
          <tr>
            <td>카테고리</td>
            <td>
              <select name="cateCode" id="" defaultValue={"undefined"} onChange={(e)=>{
                saveF(e);
              }}>
                <option value="undefined" disabled>선택</option>
                {
                  cateList.map((category, i)=>{
                    return(
                      <option key={i} value={category.cateCode}>
                        {category.cateName}
                      </option>
                    )
                  })
                }
              </select>
            </td>
          </tr>
          <tr>
            <td>책 제목</td>
            <td>
              <ShopInput name='bookName' onChange={(e)=>{
                saveF(e);
              }} />
            </td>
          </tr>
          <tr>
            <td>가격</td>
            <td>
              <ShopInput name='bookPrice' onChange={(e)=>{
                saveF(e);
              }} />
            </td>
          </tr>
          <tr>
            <td>출판사</td>
            <td>
              <ShopInput name='publisher' onChange={(e)=>{
                saveF(e);
              }} />
            </td>
          </tr>
          <tr>
            <td>설명</td>
            <td>
              <textarea name="bookInfo"cols="30" rows="10" onChange={(e)=>{
                saveF(e);
              }} />
            </td>
          </tr>
        </tbody>
      </table>
      <div>
        <ShopButton title='등록' click={(e)=>{
          console.log(insertForm);
          submitBtn();
          nav('/admin')
        }}/>
      </div>
      <div className={styles.itemList}>
        <table>
          <thead>
            <tr>
              <th>상품코드</th>
              <th>책 제목</th>
              <th>가격</th>
              <th>출판사</th>
              <th>출판일</th>
              <th>재고수량</th>
              <th>카테고리코드</th>
              <th></th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            {
              itemList.map((item, i)=>{
                return(
                  <tr key={i}>
                    <td>
                      <input type="text" name='bookCode' defaultValue={item.bookCode} readOnly />
                    </td>
                    <td>
                      <input type="text" name='bookName' defaultValue={item.bookName} readOnly />
                    </td>
                    <td>
                      <input type="text" name='bookPrice' defaultValue={item.bookPrice} onChange={(e)=>{
                        saveUpdate(e, i);
                      }} />
                    </td>
                      <td>
                      <input type="text" name='publisher' defaultValue={item.publisher} readOnly />
                    </td>
                    <td>
                      <input type="text" name='regDate' defaultValue={dayjs(item.regDate).format('YYYY-MM-DD')} readOnly />
                    </td>
                    <td>
                      <input type="number" name='bookStock' defaultValue={item.bookStock} onChange={(e)=>{
                        saveUpdate(e, item);
                      }} />
                    </td>
                      <td>
                    <input type="text" name='cateCode' defaultValue={item.cateCode} readOnly />
                    </td>
                    <td>
                      <button type='button' onClick={(e)=>{
                        updateBtn(item);
                      }} >수정</button>
                    </td>
                    <td>
                      <button type='button' onClick={(e)=>{
                        deleteBtn(item);
                      }} >삭제</button>
                    </td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default ItemInsert