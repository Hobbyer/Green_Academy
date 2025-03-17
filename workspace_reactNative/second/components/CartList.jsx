import React, { useState } from 'react';
import { Image, View, Text, StyleSheet, Pressable, TextInput, Button } from 'react-native';
import icon_edit from '@/assets/icons/edit.png'
import icon_delete from '../assets/icons/delete.png'
import Task from './Task';

const CartList = () => {
  const [data, setData] = useState(
    {id : 1, name : '달걀'},
    {id : 2, name : '우유'},
    {id : 3, name : '빵'}
  )
  const cartList = useState(
    {id : 1, name : '달걀'},
    {id : 2, name : '우유'},
    {id : 3, name : '빵'}
  )

  return (
    <View style={styles.container}>
      <Text>CartList</Text>
      <View style={{flexDirection: 'row', alignItems: 'center', justifyContent: 'space-between', width: 300, height:40, borderColor: 'gray', borderWidth: 1, margin: 5}}>
        <TextInput style={{borderWidth: 1, width: 250}} onChangeText={text=>{
          setData(...data, {id: data.length + 1, name : text})
        }}/>
        <Button title='추가' onPress={()=>{
          setCartLIst(...cartList, data)
        }}/>
      </View>
      {
        cartList.length !== undefined ?
        cartList.map((item, i) => {
          return (
            <Task key={i} item={item} cartList={cartList} setCartList={setCartList} />
          )
        })
        :
        null
      }
      {/* <Image source={icon_edit} />
      <Image source={icon_delete} /> */}
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
});

export default CartList;