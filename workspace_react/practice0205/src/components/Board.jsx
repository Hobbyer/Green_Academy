import React, { useEffect, useState } from 'react'
import List from './List'
import axios from 'axios'
import Detail from './Detail';

export const Board = () => {
  const [board, setBoard] = useState({});

  useEffect(()=>{
    axios.get('api/t12').then((res)=>{
      console.log("통신성공");
      setBoard(res.data);
    }).catch((error)=>{
      console.log("통신실패")
    });
  }, []);

  const [s, setS] = useState({
    listOn : 'tag-on',
    detailOn : 'tag-off',
    keyNum : 0
  });

  const btnC = (i) => {
    s.listOn === 'tag-on' ? setS({...s, listOn : 'tag-off', detailOn: 'tag-on', keyNum: i}) : setS({...s, listOn : 'tag-on', detailOn: 'tag-off'});
  };

  return (
    <div>
      <div className={s.listOn}>
        <List board={board} btnC={btnC} />
      </div>
      {
        Object.keys(board).length == 0 
        ?
        null
        :
        <Detail board={board[s.keyNum]} s={s}/>
      }      
      
    </div>
  )
}

export default Board