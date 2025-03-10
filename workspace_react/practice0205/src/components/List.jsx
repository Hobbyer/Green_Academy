import React, { useEffect, useState } from 'react'
import Detail from './Detail';

export const List = (props) => {
  const {board, btnC} = props;
  
  return (
      <>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>제목</td>
            <td>작성자</td>
            <td>조회수</td>
          </tr>
        </thead>
        <tbody>
          {
            Object.keys(board).map((i)=>{
              return (
                <tr key={i}>
                  <td>{board.length - i}</td>
                  <td><a className='list-title' onClick={(e)=>{
                    btnC(i);
                  }}>{board[i].title}</a></td>
                  <td>{board[i].writer}</td>
                  <td>{board[i].viewCnt}</td>
                </tr>
              )
            })
          }
        </tbody>
      </table>
      </>
    
  )
}

export default List