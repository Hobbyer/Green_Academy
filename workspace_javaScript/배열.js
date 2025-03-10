// 배열 생성 문법
const arr1 = new Array(); // 빈 배열 생성
const arr2 = []; // 빈 배열 생성
const arr3 = [1, 2, 3]; //초기값이 세팅된 배열 생성
const arr4 = [1, 5.5, "java"]; //자료형이 다른 데이터로 세팅할 수 있음
const arr5 = [1, [1, 5.6, "python"]]; // 배열도 자료형 중 하나이기 때문에 배열안에 세팅할 수 있다.

// 배열에 데이터 추가
const arr6 = [];
arr6[0] = 5;
arr6.push(10); // 배열의 마지막 요소에 데이터 추가
arr6.push([7, 7, 7])

console.log(arr6); // 배열 객체에 대한 전체 정보 출력
console.log(arr6[2]); // 배열의 3번째 요소 출력

const arr7 = [5, 1, [1, 4, 7]];
console.log(arr7[2][2]);