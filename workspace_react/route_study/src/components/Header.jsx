import React from 'react'
import {Link, useNavigate} from 'react-router-dom'
import './Header.css'

const Header = () => {
  const nav = useNavigate();

  return (
    <div className='header'>
      <div>
        <Link to="">게시판</Link>
      </div>
      <div>
        <Link to="/login">LOGIN</Link>
      </div>
      <div>
        <Link to="/join">JOIN</Link>
      </div>
      <div>
        <span onClick={(e)=>{
          nav('/my-page');
        }}>페이지이동</span>
      </div>
    </div>
  )
}

export default Header