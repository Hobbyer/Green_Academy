import React from 'react'
import { Outlet } from 'react-router-dom'
import AdminHeader from './AdminHeader'
import AdminSide from './AdminSide'
import styles from './Admin.module.css'

const Admin = () => {
  return (
    <div className={styles.adminContainer}>
      <div className={styles.adminHeader}>
        <AdminHeader />
      </div>
      <div className={styles.adminBody}>
        <div className={styles.sideDiv}>
          <AdminSide />
        </div>
        <div className={styles.contentDiv}> 
          <Outlet />
        </div>
      </div>
    </div>
  )
}

export default Admin