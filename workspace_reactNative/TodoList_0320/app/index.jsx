import React from 'react';
import { TouchableWithoutFeedback, SafeAreaView, StyleSheet, Keyboard } from 'react-native';
import ToDoList from '../components/ToDoList';

const Index = () => {
  return (
    <TouchableWithoutFeedback onPress={Keyboard.dismiss}>
      <SafeAreaView style={styles.mainContainer}>
        <ToDoList />
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

export default Index;