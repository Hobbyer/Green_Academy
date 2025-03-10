import React from 'react'
import './Header.css'
import { Link, NavLink } from 'react-router-dom'

const Header = () => {
  return (
    <div className='header'>
      <NavLink to={''} className={((data)=>{
        return(
        data.isActive ? "active" : null
      )
      })} >부서&직급 관리</NavLink>
      <span><NavLink to={'/manage'} className={((data)=>{
        return(
        data.isActive ? "active" : null
      )
      })} >사원관리</NavLink></span>
      <span><NavLink to={'/search'} className={((data)=>{
        return(
        data.isActive ? "active" : null
      )
      })} >사원조회</NavLink></span>
    </div>
  )
}

export default Header