import { Route, Routes } from 'react-router-dom'
import './App.css'
import SignUp from './components/SignUp'
import Login from './components/Login'

function App() {

  return (
    <>
      <Routes>
        {/* 회원가입 */}
        <Route path='signup' element={<SignUp />}/>
        {/* 로그인 */}
        <Route path='login' element={<Login />}/>
      </Routes>
    </>
  )
}

export default App
