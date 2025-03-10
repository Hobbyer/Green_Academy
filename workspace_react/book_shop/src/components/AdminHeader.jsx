import React from 'react'
import { Link } from 'react-router-dom'

const AdminHeader = () => {
  return (
    <>
      <ul>
        <li><Link to={'/admin/cateManage'}>카테고리관리</Link></li>
        <li><Link to={'/admin/regItem'}>상품관리</Link></li>
        <li>주문관리</li>
        <li><Link to={'/admin/memberManage'}>회원관리</Link></li>
      </ul>
    </>
  )
}

export default AdminHeader