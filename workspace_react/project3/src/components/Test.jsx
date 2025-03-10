function Test() {
  let arr = [1, 2, 3];

  return(
    <>
      <ul>
        {
          arr.map((item, index)=>{
            return(
              <li key={index}>{item}</li>
            )
          })
        }
      </ul>
    </>
  )
}

export default Test