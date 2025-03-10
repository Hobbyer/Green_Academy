// 배열의 데이터를 다른 변수에 저장하는 일반적인 방법
const arr1 = [1,2,3];
let a = arr1[0];
let b = arr1[1];
let c = arr1[2];

// 구조분해할당으로 저장하는 방법
let [aa, bb, cc] = arr1; 
let [dd, ff] = arr1;

console.log(aa, bb, cc, dd, ff);

let [a1, b1, c1, d1, e1, f1] = arr1;
console.log(a1, b1, c1, d1, e1, f1);

const person = {
  name : 'kim',
  age : 20,
  hobby : '공부'
};

const {name, age, hobby} = person;
console.log(name, age, hobby);
const {name1, age1, hobby1} = person; // 객체의 변수명과 일치하지 않으면 할당 되지 않음
console.log(name1, age1, hobby1);
const {name : name2, age : age2, hobby : hobby2} = person; // 변수명 변경 후 데이터 할당
console.log(name2, age2, hobby2);


const student = {
  name : 'kim',
  age : 30,
  korScore : 80,
  engScore : 70
};

// 매개변수도 student객체가 전달되면 해당 학생의 총점을 리턴하는 함수 만들기
function getSum(s){
  let korScore = s.korScore;
  let engScore = s.engScore;
  
  return korScore + engScore;
}

// 구조분해할당으로 만들기
function getSum1({korScore, engScore}){
  return korScore + engScore;
}

console.log(getSum(student));
console.log(getSum1(student));

const phone = {
  modelName : 's5',
  price : 10000
};

// 매개변수로 phone을 전달하면 폰 객체의 모델명과 가격을 출력하는 함수
function p1(p) {
  console.log(p.modelName, p.price);
}

// 구조분해할당으로 만들기
function p2({modelName, price}){
  console.log(modelName, price);
};

p1(phone);
p2(phone);