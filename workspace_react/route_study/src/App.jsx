import { Route, Routes } from 'react-router-dom'
import './App.css'
import Header from './components/Header'
import Login from './components/Login'
import BoardList from './components/BoardList'
import BoardDeatil from './components/BoardDeatil'

function App() {

  return (
    <>
      <Header />

      <Routes>
        <Route path='' element={<BoardList />} />
        <Route path='/login' element={ <Login /> } />
        <Route path='/join' element={ <div>회원가입 페이지</div> } />
        
        <Route path='/detail/:num' element={<BoardDeatil />} />

        <Route path='/my-page' element={<div>마이페이지입니다.</div>}>
        </Route>

        <Route path='*' element={ <div>잘못된 페이지 입니다.</div> } />
      </Routes>
    </>
  )
}

export default App
