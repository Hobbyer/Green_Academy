import React from 'react'

export const Button = (props) => {
  const {title, color, backgroundColor} = props;

  return (
    <div>
      <button style={{color: color, backgroundColor: backgroundColor}}>{title}</button>
    </div>
  )
}

Button.defaultProps = {
  color : 'black'
}

export default Button