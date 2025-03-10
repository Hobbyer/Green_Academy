import { Route, Routes } from 'react-router-dom'
import './App.css'
import DeptJob_LIst from './components/DeptJob_LIst'
import Header from './components/Header'
import EmpManage from './components/EmpManage'
import EmpSearch from './components/EmpSearch'

function App() {

  return (
    <>
      <Header />

      <Routes>
        <Route path='' element={<DeptJob_LIst />}/>
        <Route path='/manage' element={<EmpManage />}/>
        <Route path='/search/?' element={<EmpSearch />}/>
      </Routes>
    </>
  )
}

export default App
