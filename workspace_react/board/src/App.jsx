import { Route, Routes } from 'react-router-dom'
import './App.css'
import BoardList from './components/BoardList'
import BoardWrite from './components/BoardWrite'
import BoardDetail from './components/BoardDetail'
import BoardUpdate from './components/BoardUpdate'
import BoardSearchList from './components/BoardSearchList'

function App() {

  return (
    <>
      <Routes>
        <Route path='' element={<BoardList />}/>
        <Route path='/write' element={<BoardWrite />}/>
        <Route path='/detail/:boardNum' element={<BoardDetail />} />
        <Route path='/update/:boardNum' element={<BoardUpdate />} />
        <Route path='/title' element={<BoardSearchList />} />
        <Route path='/writer' element={<BoardSearchList />} />
      </Routes>

    </>
  )
}

export default App
