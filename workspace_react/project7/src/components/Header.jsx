import React from 'react'

export const Header = (props) => {
  const {name, age, addr} = props;
  
  return (
    <>
      <div>
       <p>{name}</p> 
       <p>{age}</p>
       <p>{addr}</p>
      </div>
    </>
  )
}

export default Header