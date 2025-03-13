import React from 'react';
import { StyleSheet, Text, View } from 'react-native';
import MyTextInput from './MyTextInput';
import MyButton from './MyButton';

const Login = () => {
  return (
    <View style={styles.container}>
      <Text>User name</Text>
      <MyTextInput />
      <Text>Password</Text>
      <MyTextInput
        secureTextEntry={true} returnKeyType='next' autoCaptialize='none' spellCheck={false} autoCorrect={false} // secureTextEntry는 입력한 텍스트를 숨깁니다.
        // returnKeyType는 키보드의 완료 버튼의 타입을 지정합니다.
        // autoCapitalize는 자동 대문자 변환을 설정합니다.
        // spellCheck는 스펠링 체크를 설정합니다.
        // autoCorrect는 자동 수정을 설정합니다.
      />
      <MyButton press='alert'/>
      <MyButton size='large' press='console'/>
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

export default Login;