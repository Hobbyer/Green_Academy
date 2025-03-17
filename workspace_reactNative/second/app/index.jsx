import React from 'react';
import { SafeAreaView, View, Text, StyleSheet, TouchableWithoutFeedback, Keyboard } from 'react-native';
import Login from '../components/Login';
import CartList from '../components/CartList';

const MainScreen = () => {
  return (
    <TouchableWithoutFeedback onPress={() => Keyboard.dismiss()}>
      <SafeAreaView style={styles.mainContainer}>
        {/* <StatusBar barStyle="light-content" backgroundColor={'#555555'} /> */}
        {/* <Login /> */}
        <CartList />
      </SafeAreaView>
    </TouchableWithoutFeedback>
  );
};

const styles = StyleSheet.create({
  mainContainer: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
  },
});

export default MainScreen;