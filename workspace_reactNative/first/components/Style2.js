import React from 'react';
import { Button, Pressable, SafeAreaView, StyleSheet, Text, View } from 'react-native';
import { TextInput } from 'react-native';

const Style2 = () => {
  const [text, setText] = React.useState({
    username: '',
    password: '',
  });

  return (
    <SafeAreaView style={styles.inputContainer}>
      <View>
        <Text>user name</Text>
        <TextInput
          style={styles.input}
          placeholder="User name" onChange={e=>{
            setText({...text, username: e.nativeEvent.text})
          }}
        />
      </View>
      <View>
        <Text>password</Text>
        <TextInput
          style={styles.input}
          placeholder="Password" onChange={e => {
            setText({...text, password: e.nativeEvent.text})
          }}
        />
      </View>
      <View>
        <Pressable style={styles.button} onPress={() => 
          console.log(`username
          : ${text.username}, password: ${text.password}`)
        }>
          <Text>Login</Text>
        </Pressable>
      </View>
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  inputContainer: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    padding: 10,
    margin: 10,
  },

  input: {
    width: 200,
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    borderRadius: 5,
    padding: 10,
    marginTop: 5,
    marginBottom: 5,
  },

  button: {
    backgroundColor: 'lightblue',
    width: 200,
    height: 40,
    justifyContent: 'center',
    alignItems: 'center',
    borderRadius: 5,
    padding: 10,
    marginTop: 5,
    marginBottom: 5,
  }
});

export default Style2;