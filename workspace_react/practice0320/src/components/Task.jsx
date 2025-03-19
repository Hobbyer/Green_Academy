import React, { useEffect, useRef, useState } from 'react'
import styles from './ToDoList.module.css'
import icon_edit from '../assets/icons/edit.png'
import icon_delete from '../assets/icons/delete.png'

const Task = ({item, list, setList}) => {
  
  const [edit, setEdit] = useState(false)
  const [inputText, setInputText] = useState('')
  // useRef() 함수를 사용하여 input 요소에 대한 참조를 만듭니다.
  // input 요소에 대한 참조를 만들면 input 요소에 대한 프로그래밍 방식의 제어를 할 수 있습니다.
  const inputRef = useRef(null)

  useEffect(()=>{
    if (edit && inputRef.current){ // edit 상태가 true이고 inputRef.current가 존재하면
      inputRef.current.focus() // input 요소에 포커스를 줍니다.
      // input 요소에 포커스를 준 후에 input 요소의 값을 변경할 수 있습니다.
      // input 요소의 값을 변경하려면 input 요소의 value 속성을 사용합니다.
    }
  }, [edit])

  return (
    <div className={styles.list}>
      { edit ? (
        <>
        <div>
          <input type='text' className={styles.listInput} defaultValue={item.text} ref={inputRef} onChange={(e)=>{
            setInputText(e.target.value);
          }} />
        </div>
        <div>
          <div className={styles.listBtn}>
            <button type='button' onClick={() => {
              inputText !== '' &&
                  setList(
                    list.map((listItem) => {
                      if (listItem.id === item.id) {
                        listItem.text = inputText
                      }
                      return listItem
                    })
                  )
                  setEdit(false)
                }}
              >수정</button>
            <button type='button' onClick={()=>{
              setEdit(false)
            }}
            >취소</button>
          </div>
        </div>
        </>
      ): (
        <>
          <div>
            {item.text}
          </div>
          <div> 
            <img src={icon_edit} onClick={()=>{
              setEdit(true)
            }}/>
            <img src={icon_delete} onClick={()=>{
              if (confirm('삭제하시겠습니까?')){
              setList(list.filter((listItem)=>{
                return listItem.id !== item.id
              }))}
            }} />
          </div>
        </>
      )}
    </div>
  )
}

export default Task