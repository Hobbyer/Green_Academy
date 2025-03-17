import React from 'react';
import { SafeAreaView, View, Text, StyleSheet } from 'react-native';
import Login from '../components/Login';
import CartList from '../components/CartList';

const MainScreen = () => {
  return (
    <SafeAreaView style={styles.container}>
      {/* <StatusBar barStyle="light-content" backgroundColor={'#555555'} /> */}
      {/* <Login /> */}
      <CartList />
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
});

export default MainScreen;