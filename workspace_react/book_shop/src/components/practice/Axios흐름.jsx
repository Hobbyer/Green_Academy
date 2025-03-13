import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axios흐름 = () => {
  
  const [num, setNum] = useState(0);

  useEffect(()=>{
    console.log('통신 전')

    axios.get('/api/test/1').then(res=>{
      console.log(res.data);
    }).catch(error=>{})

    console.log('통신 후')
  }, [])

  useEffect(()=>{
    if(num != 0){
    axios.get(`/api/replies/${num}`).then().catch()
    }
  }, [num])

  return (
    <div>Axios흐름</div>
  )
}

export default Axios흐름