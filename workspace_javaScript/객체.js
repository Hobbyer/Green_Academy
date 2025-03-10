// 객체 : key와 value 한 쌍의 데이터로 이루어진 데이터 집합.

// 객체 선언
const obj1 = {}; // 빈 객체 생성
const person = {
  name : 'kim',
  age : 20,
  addr : '울산',
  age : 30 
}; // {key : value}, key는 중복안됨. 중복되면 마지막의 데이터만 유효함. 

// person 객체에서 'kim' 문자열 출력
console.log(person.name);
console.log(person);
console.log(person['name']);

// 새로운 데이터 추가, 변경 방법
person.hobby = "공부"; // 객체명.추가할 key = value;
person.addr = "서울";

console.log(person);