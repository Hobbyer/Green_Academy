import React, { useState } from 'react'
import { Outlet } from 'react-router-dom'
import UserHeader from './UserHeader'
import styles from './UserLayout.module.css'

const UserLayout = () => {
  const [switch1, setSwitch1] = useState("")
  const [switch2, setSwitch2] = useState("none")
  const [getList, setGetList] = useState([]);
  const [cateNum, setCateNum] = useState(0);

  return (
    <div className={styles.userContainer}>
      <div>
        <UserHeader cateNum={cateNum} setCateNum={setCateNum} setGetList={setGetList} setSwitch1={setSwitch1} setSwitch2={setSwitch2}/>
      </div>
      <div>
        <Outlet context={{getList, switch1, switch2}} />
      </div>
    </div>
  )
}

export default UserLayout