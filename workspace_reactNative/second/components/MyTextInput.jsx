import React from 'react';
import { StyleSheet, TextInput, View } from 'react-native';

const MyTextInput = ({placeholder='', setText, saveText}) => {
  return (
    <TextInput style={styles.input} onChangeText={(text)=>{setText(
      {...saveText, [placeholder]: text}
    )}}/>
  );
};

const styles = StyleSheet.create({
  input: {
    width: 300,
    height: 40,
    borderColor: 'gray',
    borderWidth: 1, // borderWidth는 테두리의 두께를 지정합니다.
    paddingLeft: 8,
  },
});

export default MyTextInput;