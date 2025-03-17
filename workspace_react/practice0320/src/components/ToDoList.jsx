import React, { useEffect, useState } from 'react'
import { data } from '../assets/todoList'
import styles from './ToDoList.module.css'

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
        <div className={styles.title}>ToDoList</div>
        <div className={styles.inputLine}>
          <input type="text" placeholder='+ Add a Taks' onChange={e=>{
            setChange(e.target.value);
          }}/>
          <button type='button' className={styles.btn} onClick={e=>{
            change !== '' ?
            valueData()
            :
            null
            }}>등록</button>
        </div>
        <div className={styles.listBg}>
          { list.length !== undefined ?
            list.map((item, i)=>{
              return(
                <div key={i} className={styles.list}>
                  {item.text}
                  <div>
                    <span>연필</span>
                    <span onClick={()=>{
                     list.find((item)=>{
                      //TODO : 수정기능
                     })
                    }}>
                      쓰레기통
                    </span>
                  </div>
                </div>
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