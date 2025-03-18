import React, { useState } from 'react';
import { View, Text, TextInput,  StyleSheet, Pressable, Image } from 'react-native';
import icon_edit from '@/assets/icons/edit.png';
import icon_delete from '@/assets/icons/delete.png';

const Task = ({item, todoList, setTodoList}) => {

  const [editing, setEditing] = useState(false)

  const deleteTask = (id) => {
    setTodoList(todoList.filter((item) => {
      return item.id !== id
    }))
  }

  return (
    <View style={styles.container}>
      {
        editing ?
        <TextInput style={styles.input} defaultValue={item.text} autoFocus={true} onBlur={()=>{
          setEditing(false)
        }} onEndEditing={(e)=>{
          setTodoList(todoList.map((todo) => {
            if(todo.id === item.id){
              todo.text = e.nativeEvent.text
            }
            return todo
          }))
          setEditing(false)
        }} /> :
        <>
          <Text>{item.text}</Text>
          <View style={styles.buttonContainer}>
            <Pressable onPress={()=>{
              setEditing(true)
            }}>
              <Image source={icon_edit} style={styles.icon} />
            </Pressable>
            <Pressable onPress={()=>{
              deleteTask(item.id)
            }}>
              <Image source={icon_delete} style={styles.icon} />
            </Pressable>
          </View>
        </>
      }
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    width: '100%',
    justifyContent: 'space-between',
    alignItems: 'center',
    flexDirection: 'row',
    padding: 10,
    backgroundColor: '#f0f0f0',
  },

  input: {
    width: 250,
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
  },

  buttonContainer: {
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
  },

  icon: {
    width: 25,
    height: 20,
    margin: 8,
    cursor: 'pointer',
  },
});

export default Task;