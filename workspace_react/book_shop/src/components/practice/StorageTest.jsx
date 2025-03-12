import React from 'react'
import { useEffect } from 'react'

const StorageTest = () => {

  //localStoragy에 영구적으로 저장.
  //localStorage.setItem('name', 'mike');

  //sessionStorage에 저장. 브라우저를 닫으면 삭제됨.
  //sessionStorage.setItem('name', 'mike');

  //localStorage에 저장된 값 가져오기
  //localStorage.getItem('name');

  //localStorage에 저장된 값 삭제
  //localStorage.removeItem('name');

  //localStorage에 저장된 모든 값 삭제
  //localStorage.clear();

  //localStorage, sessionStorage에 저장된 데이터는 개발자모드의 Application 탭에서 확인 가능.
  //localStorage, sessionStorage에 저장할 수 있는 데이터는 문자열만 가능하다.
  //객체를 저장하려면 JSON.stringify()로 객체를 문자열로 변환해서 저장하고, JSON.parse()로 다시 객체로 변환해서 사용한다.
  //localStorage.setItem('user', JSON.stringify({name: 'mike', age: 20}));
  //const user = JSON.parse(localStorage.getItem('user'));
  //console.log(user);


  useEffect(() => {
    localStorage.setItem('name', 'mike');
    localStorage.setItem('age', '20');

    sessionStorage.setItem('user', JSON.stringify({name: 'kim', age: 30}));
    const user = JSON.parse(sessionStorage.getItem('user'));

  }, [])

  return (
    <div>
      StorageTest
      <div>
        <button type='button' onClick={e=>{
          localStorage.removeItem('name');
          localStorage.clear();
        }} >로컬저장소 삭제</button>

        <button type='button' onClick={e=>{
          sessionStorage.removeItem('user');
          sessionStorage.clear();
        }} >세션저장소 삭제</button>
      </div>
    </div>
  )
}

export default StorageTest
