import React, { useState } from 'react'
import { data } from '../assets/todoList'
import styles from './ToDoList.module.css'

import Task from './Task'

const ToDoList = () => {
  const [list, setList] = useState(data)
  const [change, setChange] = useState('')
  
  const valueData = (e) => {
    const result = Math.max(...data.map((item, i)=>{
      return item.id  
    }))
    
    setList([...list, {
      id : result + 1,
      text : change
    }]);

    setChange('');
  }

  return (
    <div className={styles.container}>
      <div>
        <div className={styles.title}>
          <span>ToDoList</span>
        </div>
        <div className={styles.inputLine}>
          <input type="text" placeholder='+ Add a Task' onChange={e=>{
            setChange(e.target.value) }} onBlur={(e)=>{
              e.target.value = ''
            }}/>
          <button type='button' className={styles.btn} onClick={e=>{
            change !== '' ?
            valueData()
            :
            null
            }} >등록</button>
        </div>
        <div className={styles.listBg}>
          { list.length !== undefined ?
            list.map((item, i)=>{
              return(
                <Task key={i} item={item} list={list} setList={setList}/>
              )
            })
            :
            null
          }
        </div>
      </div>
    </div>
  )
}

export default ToDoList