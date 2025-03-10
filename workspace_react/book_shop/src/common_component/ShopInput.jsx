import React from 'react'
import styles from './ShopInput.module.css'

const ShopInput = ({type='text', size='', ...props}) => {
  return (
    <>
      <input type={type}
      className={size ? [styles.input, styles.wide].join(' ') : styles.input } {...props}
      />
    </>
  )
}

export default ShopInput