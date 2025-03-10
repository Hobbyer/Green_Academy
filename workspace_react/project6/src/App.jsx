import axios from 'axios'
import './App.css'
import { useEffect, useState } from 'react';
import Axios_1 from './components/axios_1';
import Axios_2 from './components/Axios_2';
import Axios_3 from './components/Axios_3';
import Axios_4 from './components/Axios_4';
import Axios_5 from './components/Axios_5';
import Axios_6 from './components/Axios_6';
import Axios_7 from './components/Axios_7';
import Axios_8 from './components/Axios_8';

function App() {
  // const [a, setA] = useState();
  
  // useEffect(()=>{
  //   axios.get('/api/t3') // get(url, [설정내용]) [] = 적어도되고 안적어도됨
  // .then((res)=>{ // then(통신 성공 후 실행할 내용(화살표함수))
  //   // res : 통신에 대한 모든 정보가 담긴 객체 (response 줄임표현)
  //   console.log("통신성공!!");
  //   console.log(res);
    
  //   setA(res.data);
  // })
  // .catch((error)=>{ // catch(통신 실패 시 실행할 내용(화살표함수))
  //   // error : 오류가 발생한 모든 정보를 갖는 객체
  //   console.log("통신실패..");
  //   console.log(error);
  // }); 
  // }, []);

  return (
    <>
      {/* <Axios_1 /> */}
      {/* <Axios_2 /> */}
      {/* <Axios_3 /> */}
      {/* <Axios_4 /> */}
      {/* <Axios_5 /> */}
      {/* <Axios_6 /> */}
      {/* <Axios_7 /> */}
      <Axios_8 />
    </>
  )
}

export default App
