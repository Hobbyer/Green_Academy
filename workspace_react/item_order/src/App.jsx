import { Route, Routes } from 'react-router-dom'
import './App.css'
import Head from './components/Head'
import ItemList from './components/ItemList'
import ItemDetail from './components/ItemDetail'
import ItemInsert from './components/ItemInsert'
import Order from './components/Order'
import OrderList from './components/OrderList'
import './components/List.css'
import './components/InsertTable.css'

function App() {

  return (
    <>
      <Head />
      <div className='container'>
        <Routes>
          <Route path='' element={<ItemList />}/>
          <Route path='item/:itemNum' element={<ItemDetail />}/>
          <Route path='/insert' element={<ItemInsert />}/>
          <Route path='/order' element={<Order />}/>
          <Route path='/orderList' element={<OrderList />}/>
        </Routes>
      </div>
    </>
  )
}

export default App
