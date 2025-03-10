import { Route, Routes, useNavigate } from 'react-router-dom'
import './App.css'
import MemberList from './components/MemberList'
import Join from './components/Join'
import Detail from './components/Detail'

function App() {
  const nav = useNavigate();

  return (
    <>
      <div>
        <h1 onClick={()=>{
          nav('/');
        }} >회원 관리 프로그램</h1>

        <Routes>
          <Route path='' element={<MemberList />}/>
          <Route path='/join' element={<Join />}/>
          <Route path='/detail/:memId' element={<Detail />}/>
        </Routes>
      </div>
    </>
  )
}

export default App
