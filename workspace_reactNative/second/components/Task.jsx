import { Pressable ,StyleSheet, Text, View, Image, TextInput } from 'react-native'
import React, { useState } from 'react'
import icon_edit from '@/assets/icons/edit.png'
import icon_delete from '@/assets/icons/delete.png'

const Task = ({item, cartList, setCartList}) => {
  const [isEditing, setIsEditing] = useState(false);
  const [newText, setNewText] = useState('');

  return (
    <View style={styles.container}>
      {
        isEditing ?
        <>
          {/* 수정 기능 실행 시 input태그 활성화 및 비활성화 */}
          <TextInput style={styles.input} defaultValue={item.name} autoFocus={true} onBlur={()=>{
            setIsEditing(false);
            setNewText('');
          }} 
          /* 텍스트 수정 완료 시 cartList에 반영(수정) */
          onEndEditing={(e)=>{
            setCartList(cartList.map((cartItem)=>{
              if(cartItem.id === item.id){
                return {...cartItem, name : e.nativeEvent.text}
              }else{
                return cartItem
              }
            }));
            setIsEditing(false);
          }} />
        </>
        :
        <>
          <Text>{item.name}</Text>
          <Text>
            {/* 리스트 수정 */}
            <Pressable onPress={()=>{setIsEditing(true)}}>
              <Image source={icon_edit} style={styles.icon}/>
            </Pressable>

            {/* 리스트 삭제 */}
            <Pressable onPress={()=>{
              setCartList(cartList.filter((cartItem)=>{
                return cartItem.id !== item.id
              }))
            }}>
              <Image source={icon_delete} style={styles.icon}/>
            </Pressable>
          </Text>
        </>
      }
    </View>
  )
}

export default Task

const styles = StyleSheet.create({
  container: {
    width: 250,
    flexDirection: 'row',
    justifyContent: 'space-between',
    alignItems: 'center',
    margin: 10,
    padding: 10,
    borderWidth: 1,
    borderColor: '#eeeeee',
    borderRadius: 5,
    backgroundColor: 'aquamarine'
  },
  input: {
    width: 200,
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    paddingLeft: 8,
  },
  icon: {
    width: 30,
    height: 30,
  }
})