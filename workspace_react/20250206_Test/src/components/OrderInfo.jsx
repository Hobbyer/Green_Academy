import React, { useEffect, useState } from 'react'
import OrderList from './OrderList'
import OrderDetail from './OrderDetail'
import axios from 'axios';

export const OrderInfo = () => {
  const [list, setList] = useState({});

  const [tag, setTag] = useState({detail: 'tag-off',
    list: 'tag-on',
    keyNum: 0
  });

  const onNoff = (i) => {
    tag.detail === 'tag-on' && tag.keyNum === i ? setTag({...tag, detail: 'tag-off', keyNum: i}) 
    : tag.keyNum !== i ? setTag({...tag, detail: 'tag-on', keyNum: i}) 
    : tag.detail !== 'tag-off' ? setTag({...tag, detail: 'tag-on', keyNum: i}) 
    : setTag({...tag, detail: 'tag-on', keyNum: i})
  };

  useEffect(()=>{
    axios.get('api/orders').then((res)=>{
      console.log("통신성공")
      setList(res.data)
    }).catch((error)=>{
      console.log("통신실패")
      console.log(error);
    })
  }, []);

  return (
    <div className='container'>   
      <OrderList list={list} onNoff={onNoff} />
      {
        Object.keys(list).length === 0 ? null : <OrderDetail list={list} tag={tag}/>
      }
      
    </div>
  )
}

export default OrderInfo