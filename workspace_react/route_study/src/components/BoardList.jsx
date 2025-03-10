import React from 'react'
import { Link, useNavigate } from 'react-router-dom'

const BoardList = () => {
  // useNavigate() hook은 페이지 이동 기능을 제공하는 함수를 리턴.
  const nav = useNavigate();

  return (
    <div>
      BoardList
      <div className='black-font'>
        <Link to='/detail'>게시글1</Link>
        <button type='button' onClick={(e)=>{
          nav('/detail');
        }}>클릭</button>
      </div>
    </div>
  )
}

export default BoardList