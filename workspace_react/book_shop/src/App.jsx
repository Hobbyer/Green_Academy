import { Route, Routes } from 'react-router-dom'
import './App.css'
import Admin from './components/Admin'
import UserLayout from './components/UserLayout'
import ItemList from './components/ItemList'
import ItemInsert from './components/ItemInsert'
import ItemDetail from './components/ItemDetail'
import CategoryInsert from './components/CategoryInsert'
import ItemBasket from './components/ItemBasket'
import UsersManage from './components/UsersManage'
import UserJoin from './components/UserJoin'
import Login from './components/Login'
import ShopInput from './common_component/ShopInput'
import State변경함수흐름3 from './components/practice/State변경함수흐름3'
import StorageTest from './components/practice/StorageTest'

function App() {

  return (
    <div className='container'>
      <StorageTest />
      <Routes>
        <Route path='' element={<UserLayout />}>
        {/* 상품목록 페이지 */}
          <Route path='' element={<ItemList />}/>

        {/* 상품 상세 페이지 */}
          <Route path='detail/:cateCode/:bookCode' element={<ItemDetail />}/>

        {/* 장바구니 페이지 */}
          <Route path='/basket' element={<ItemBasket />}/>

        {/* 주문 페이지 */}
          <Route path='/order' element={""}/>

        {/* 로그인 페이지 */}
          <Route path='/login' element={<Login />}/>

        {/* 회원가입 페이지 */}
          <Route path='/join' element={<UserJoin />}/>
        </Route>


        <Route path='/admin' element={<Admin />}>
        {/* 카테고리 관리 */}
          <Route path='cateManage' element={<CategoryInsert />}/>

        {/* 상품관리 */}
          <Route path='regItem' element={<ItemInsert />}/>

        {/* 주문관리 */}
          <Route path='orderList' element={<div>상품등록</div>}/>

        {/* 회원관리 */}
          <Route path='memberManage' element={<UsersManage />}/>
        </Route>
      </Routes>
    </div>
  )
}

export default App
