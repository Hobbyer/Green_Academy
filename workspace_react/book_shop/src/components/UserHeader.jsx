import React, { useEffect, useState } from 'react'
import styles from './UserHeader.module.css'
import axios from 'axios'
import { Link, useNavigate } from 'react-router-dom'
import { getCategoryList } from '../apis/bookApi'

const UserHeader = (props) => {
  const nav = useNavigate();
  const {setSwitch1, setSwitch2, setGetList} = props

  const [cateList, setCateList] = useState([]) 

  useEffect(()=>{
    getCategoryList().then(res=>{
      setCateList(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }, [])

  const allCategory = () => {
    axios.get('/api/items').then(res=>{
      setGetList(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }

  const cateSelect = (category) => {
    axios.get(`/api/items/${category.cateCode}`).then((res)=>{
      setGetList(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }

  return (
    <div className='header-container'>
      <div className={styles.loginLine}>
        {
          JSON.parse(sessionStorage.getItem('user')) ?
          <>
            <span>{JSON.parse(sessionStorage.getItem('user')).userId}님</span>
            <span><Link to={'/cart'}>Cart</Link></span>
            <span><Link to={'/order'}>Order</Link></span>
            <span onClick={(e)=>{
              sessionStorage.removeItem('user');
              nav('/');
            }}>Logout</span>
          </>
          : 
          <>
            <span><Link to={'/login'}>Login</Link></span>
            <span><Link to={'/join'}>Join</Link></span>
          </>
        }
      </div>
      <div className={styles.banner}>
        <img src="/bookbanner.png" alt="" />
        <p onClick={(e)=>{
          nav('/');
        }}>BOOkKING</p>
      </div>
      <div className={styles.categoryList}>
        <ul>
          <li onClick={(e)=>{
            setSwitch1("");
            setSwitch2("none");
            allCategory();
            nav('/');
          }}>
            전체
          </li>
          {
            cateList.map((category, i)=>{
              return(
                <li key={i} onClick={(e)=>{
                  // setCateNum(category.cateCode);
                  setSwitch1("none");
                  setSwitch2("");
                  cateSelect(category);
                  nav('/');
                }}>
                 {category.cateName}
                </li>
              )
            })
          }
        </ul>
      </div>
    </div>
  )
}

export default UserHeader