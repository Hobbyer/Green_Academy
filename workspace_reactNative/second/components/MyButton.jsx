import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'
import { COLOR } from '../constants/colors'

const MyButton = ({title='버튼', size='normal', press, saveText}) => {
  return (
    // <Pressable style={[styles.btnContainer, styles[size]]} onPress={()=>{}}>
    <Pressable style={(e)=>{
      return [
        styles.btnContainer,
        styles[size],
        e.pressed && styles.pressed
      ]
    }} onPress={()=>{
      return [
        press==='alert' && alert('안녕하세요'),
        press==='console' && console.log('안녕하세요'),
        press==='save' && console.log(saveText)
      ]
    }}> 
      <Text style={styles.btn}>{title}</Text>
    </Pressable>
  )
}

export default MyButton

const styles = StyleSheet.create({
  btnContainer:{
    width: '100%',
    borderWidth: 1,
    borderRadius: 5,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: COLOR.BTN_BACK_COLOR,
    paddingVertical: 10, // paddingVertical은 위아래 여백을 지정합니다.
    paddingHorizontal: 20, // paddingHorizontal은 좌우 여백을 지정합니다.
  },

  btn:{
    fontSize: 20,
    color: 'white',
  },

  normal: {
    width: '30%'
  },
  
  large: {
    width: '100%'
  },

  pressed : {
    opacity: 0.5
  }
})