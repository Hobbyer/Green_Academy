import { SafeAreaView, StyleSheet, Text, View } from 'react-native';
import React from 'react';
import { TextInput } from 'react-native-web';

const Style1 = () => {
  return (
    <SafeAreaView style={styles.container}>
      <View style={styles.v1}>
        <Text>Style1</Text>
      </View>  
      <View style={styles.v2}>
        <Text>Style2</Text>
      </View>  
      <View style={styles.v3}>
        <Text>Style3</Text>
      </View>
    </SafeAreaView>
  );
};

export default Style1;

// reactNative 의 컴포넌트들은 모두 flex가 기본값이다.
// flex: 1 은 화면 전체를 차지하게 된다.
// flex: 0 은 자신의 크기만큼만 차지하게 된다.
// flexDirection: 'row' 는 가로로 나열하게 된다.
// flexDirection: 'column' 은 세로로 나열하게 된다.(default)
// justifyContent: 'center' 는 가로로 가운데 정렬하게 된다.
// alignItems: 'center' 는 세로로 가운데 정렬하게 된다.
const styles = StyleSheet.create({
  container : {
    flex: 0,
    flexDirection: 'row',
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: 'black',
  },

  v1: {
    backgroundColor: 'red',
    padding: 10,
    margin: 10,
  },

  v2 : {
    backgroundColor: 'blue',
    padding: 10,
    margin: 10,
  },

  v3: {
    backgroundColor: 'green',
    padding: 10,
    margin: 10,
    alignItems: 'center',
  },
});