// 외부파일에서 선언한 변수 및 함수를 사용하기 위해서는 export와 import를 적절히 사용해야 함.

import axios from "axios"

// <첫번째 방식> (export default) : 파일당 하나만 사용 가능, 다른 파일에서 import해서 받을 때 데이터명을 마음대로 변경할 수 있음
// let data1 = 10;
// export default data1

// <두번째 방식> (export) : 여러번 사용 가능, 다른 파일에서 import해서 받을 때 반드시 데이터명을 일치시켜야한다.
// import { 데이터명(or함수명) } from 경로
// export let data2 = 20;
// export let data3 = 30;

// export const test1=()=>{
  //   console.log(1);
  // }
  
  // -------------------------------
  
// 해당 파일에 카테고리와 도서 관련 axios 기능을 모아 놓음

/**
 * 카테고리 목록조회
*/
export const getCategoryList = () => {
  const response = axios.get('/api/categories');
  return response;
}

/**
 * 카테고리 등록
param : 신규 등록되는 카테고리명(문자열)
*/
export const insertCategory = (data) => {
  const response = axios.post('/api/admins/category', data);
  return response;
}

/**
 * 카테고리 삭제
 * params : 삭제할 카테고리코드
 */
export const deleteCategory = (cateCode) => {
  const response = axios.delete(`/api/admins/category/${cateCode}`);
  return response;
}

/**
 * 카테고리 수정
 */
export const updateCategory = (cateCode, data) => {
  const response = axios.put(`/api/admins/category/${cateCode}`, data);
  return response;
}

  
/**
 * 도서 목록조회
 */
export const getItemList = () => {
  const response = axios.get('/api/items');
  return response;
}

/**
 * 도서 등록
 * param : 신규 등록되는 도서(객체)
 * cateCode : 1,
 * bookName : '',
 * bookPrice : 0,
 * publisher : '',
 * bookInfo : ''
 */
export const insertItem = (data) => {
  const response = axios.post('/api/admins/item', data);
  return response
}
