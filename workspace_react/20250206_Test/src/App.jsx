import { Route, Routes } from 'react-router-dom'
import './App.css'
import OrderInfo from './components/OrderInfo'
import OrderDetail from './components/OrderDetail'

function App() {

  return (
    <>
      <Routes>
        <Route path='' element={<OrderInfo />} />
        <Route path='/detail/:num' element={<OrderDetail />} />
      </Routes>
    </>
  )
}

export default App
