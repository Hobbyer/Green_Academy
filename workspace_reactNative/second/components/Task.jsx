import { Pressable, StyleSheet, Text, View } from 'react-native'
import React from 'react'

const Task = () => {
  return (
    <View key={i} style={styles.container}>
      <Pressable onPress={() => {}}>
        <Image source={icon.ICON_EDIT} style={styles.image} />
      </Pressable>
      <Text style={styles.title}>{e.item}</Text>
      <Image source={icon.ICON_DELETE} style={styles.img} />
    </View>
  )
}

export default Task

const styles = StyleSheet.create({})