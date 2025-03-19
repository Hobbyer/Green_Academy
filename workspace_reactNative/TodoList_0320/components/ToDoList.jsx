import { Button, Pressable, StyleSheet, Text, TextInput, View } from 'react-native'
import React, { useState } from 'react'
import Task from './Task'
import { data } from '../assets/todoList'

const ToDoList = () => {

  const [todoList, setTodoList] = useState(data);
  const [inputText, setInputText] = useState('');

  const addTodo = (e) => {
  const result = Math.max(...todoList.map((item) => {
    return item.id
  }))
  setTodoList([...todoList, {id: result + 1, text: e.nativeEvent.text}])
  setInputText('')
  }

  return (
    <View style={styles.totalContainer}>
      <Text style={styles.title}>To Do List</Text>
      {/* 리스트 추가 */}
      <View style={styles.inputContainer}>
        <TextInput style={styles.input} value={inputText} placeholder='+ Add a Task' onChange={(e)=>{
          setInputText(e.nativeEvent.text)
        }} onSubmitEditing={(e)=>{
          inputText !== '' ?
          addTodo(e)
          :
          null
        }} />
      </View>
      {/* 리스트 출력 */}
      <View style={styles.listContainer}>
        {
          todoList.length !== undefined ?
          todoList.map((item, i) => {
            return (
              <Task key={i} item={item} todoList={todoList} setTodoList={setTodoList} />
            )
          })
          :
          null
        }
      </View>
    </View>
  )
}

export default ToDoList

const styles = StyleSheet.create({
  totalContainer: {
    width: '100%',
    flex: 1,
    padding: 20,
    // justifyContent: 'center',
    // alignItems: 'center',
  },
  input: {
    width: '100%',
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    margin: 10,
    padding: 10,
  },

  inputContainer: {
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
  },

  title: {
    fontSize: 40,
    fontWeight: 'bold',
    textAlign: 'left',
  },

  listContainer: {
    width: '100%',
    padding: 10,
    gap: 10,
    alignItems: 'center',
    backgroundColor:'rgb(110, 109, 109)',

  }
})