import React from 'react'
import { Link } from 'react-router-dom'
import './Head.css'

const Head = () => {
  return (
    <div className='head'>
      <div>
        <span><Link to={'/'}>상품정보</Link></span>
        <span><Link to={'/insert'}>상품등록</Link></span>
        <span><Link to={'/order'}>주문하기</Link></span>
        <span><Link to={'/orderList'}>주문목록</Link></span>
      </div>
    </div>
  )
}

export default Head