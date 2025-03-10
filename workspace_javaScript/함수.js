function printHello(){
  console.log("hello~");
}

// printHello();

// 매개변수로 두 정수를 받아 두 정수의 합을 출력
function printSum(a, b){
  console.log(a+b);
}

// printSum(10, 15);

// 매개변수로 두 수를 전달받아, 두 수의 곱을 리턴하는 함수 생성
function getMulti(a, b){
  return a * b
}

// console.log(getMulti(10, 100));


// 자바스크립트는 함수가 변수에 저장이 가능하다!

// 화살표 함수 : 함수를 간략히 선언하는 방법.
const printData = () => {
  console.log("hello")
};

printData();

// 함수 표현식
const printData2 = function (){
  console.log("Hi")
};
printData2();

// 함수표현식 과 화살표 함수로 변경해보세요.
function f1(a,b){
  console.log(a+b);
}

//함수표현식
const data1 = function (a,b){
  console.log(a+b);
};
//화살표함수
const data2 = (a,b) => {
  console.log(a+b);
};

f1(1,2);
data1(2,3);
data2(3,4);