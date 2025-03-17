import React, { useState } from 'react';
import { View, Text, StyleSheet, TextInput, Button } from 'react-native';
import Task from './Task';

const CartList = () => {
  const [cartList,setCartList] = useState([
    {id : 1, name : '달걀'},
    {id : 2, name : '우유'},
    {id : 3, name : '빵'}
  ])

  return (
    <View style={styles.container}>
      {/* 리스트 추가 */}
      <TextInput style={styles.input} onEndEditing={(e)=>{
        setCartList([...cartList, {id : cartList.length+1, name : e.nativeEvent.text}])
      }}/>
      {/* 각각의 리스트를 컴포넌트로 반복 */}
      {
        cartList.map((item, i) => {
          return (
          <Task item={item} key={i} cartList={cartList} setCartList={setCartList}/>
        )
        })
      }
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },

  input: {
    width: 250,
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    borderRadius: 5,
    marginBottom: 20,
    paddingLeft: 8,
  },
});

export default CartList;