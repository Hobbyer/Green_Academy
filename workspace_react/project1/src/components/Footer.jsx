function Footer() {
  return (
    <>
      <div>footer</div>
      <button type="button" onClick={() => {
        console.log("버튼클릭");
      }}>버튼1</button>

      <input type="text" onChange={() => {
        // alert('111');
      }} />
    </>
  )
}

export default Footer