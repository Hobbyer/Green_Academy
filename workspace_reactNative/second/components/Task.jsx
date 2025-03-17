import { StyleSheet, Text, View } from 'react-native'
import React from 'react'

const Task = ({e}) => {
  return (
    <View key={i} style={{flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', width: 300, height:40, borderColor: 'gray', borderWidth: 1, margin: 5}}>
      <Text>{item.name}</Text>
      <Text>
        <Pressable onPress={()=>{console.log(cartList.length)}}>
        <Image source={icon_edit} />
        </Pressable>
        <Pressable>
        <Image source={icon_delete} />
        </Pressable>
      </Text>
    </View>
  )
}

export default Task

const styles = StyleSheet.create({})