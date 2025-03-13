import React from 'react';
import { SafeAreaView, View, Text, StyleSheet } from 'react-native';
import Login from '../components/Login';

const MainScreen = () => {
  return (
    <SafeAreaView style={styles.container}>
      <Login />
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