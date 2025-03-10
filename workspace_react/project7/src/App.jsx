import { useState } from 'react';
import './App.css'
import Button from './components/Button'
import Controller from './components/Controller';
import Counter from './components/Counter';
import Display from './components/Display';
import Footer from './components/Footer'
import Header from './components/Header'
import Lotto from './components/Lotto';

function App() {
  // 구조분해할당 (배열, 객체에서 사용가능)
  const person = {
    name : 'kim',
    age : 20,
    addr : '울산'
  };
  
  return (
    <>
      <div className='container'>
        {/* <Counter /> */}
        <Lotto />
      </div>
    </>
  )
}

export default App
