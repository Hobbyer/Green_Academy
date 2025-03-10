import axios from 'axios';
import React, { useState } from 'react'

export const Axios_8 = () => {
  const [data, setData] = useState({add : []});

  const dataConfirm = () => {
    console.log(data);
  };




  return (
    <>
      <div className='container8'>
        <div>
          <div className='content-box'>
            <div>
              음식 선택
            </div>
            <div>
              <select defaultValue="선택" className='basic-input' onChange={(e)=>{
                setData({...data, food : e.target.value});
              }} >
                <option value="선택" disabled>선택</option>
                <option value="치킨">치킨</option>
                <option value="피자">피자</option>
                <option value="족발">족발</option>
              </select>
            </div>
          </div>
          <div className='content-box'>
            <div>
              수량
            </div>
            <div>
              <input type="number" className='basic-input' onChange={(e)=>{
                setData({...data, amount : e.target.value});
              }} />
            </div>
          </div>
          <div className='content-box'>
            <div>
              추가선택
            </div>
            <div>
              <input type="checkbox" value="토핑" onClick={(e)=>{
                e.target.checked ? 
                setData({...data, add : [...data.add, e.target.value]})
                : setData({...data, }) 
              }} />토핑추가
              <input type="checkbox" />음료추가
              <input type="checkbox" />공기밥추가
            </div>

              a ={}

            {/* <div>
              <input type="radio" name="addS" value="토핑추가" defaultChecked onChange={(e)=>{
                e.target.checked ? setData({...data, add : e.target.value}) : null;
              }} />토핑추가
              <input type="radio" name="addS" value="음료추가" onChange={(e)=>{
                e.target.checked ? setData({...data, add : e.target.value}) : null;
              }} />음료추가
              <input type="radio" name="addS" value="공기밥추가" onChange={(e)=>{
                e.target.checked ? setData({...data, add : e.target.value}) : null;
              }} />공기밥추가
            </div> */}
          </div>
          <div className='content-box'>
            <div>
              요청사항
            </div>
            <div>
              <textarea cols="30" rows="10" onChange={(e)=>{
                setData({...data, pleaseText : e.target.value});
              }} />
            </div>
          </div>
          <div className='content-box'>
            <div>
              주문일시
            </div>
            <div>
              <input type="date" className='basic-input' onChange={(e)=>{
                setData({...data, orderDate : e.target.value})
              }} />
            </div>
          </div>
        </div>
        <div className='btn-line'>
          <button type='button' onClick={()=>{
            axios.post('api/t10', data).then(()=>{
              console.log('전달성공')
            }).catch(()=>{
              console.log('전달실패')
            });
          }}>전송</button>
        </div>
        <div>
          <button type='button' onClick={dataConfirm}>데이터확인</button>
        </div>
      </div>
    </>
  )
}

export default Axios_8