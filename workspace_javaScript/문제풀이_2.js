// 1) 이름, 부서, 직급, 급여의 네 개의 데이터를 갖는 객체 emp를 생성해보세요. 각 데이터의 값은 임의의 값으로 설정하면 됩니다.
const emp1 = {name : "kim", dept : "devel", level : "lead", payroll : 3500};
const emp2 = {name : "lee", dept : "개발부", level : "lead", payroll : 5000000};

// 2) 위에서 만든 emp 객체 하나를 매개변수로 받아, 전달받은 객체의 부서가 '개발부'라면 해당 객체의 급여를 출력하고, '개발부'가 아니라면 '부서가 잘못되었습니다'를 출력하는 함수를 화살표함수로 구현하고 호출하세요.

const confirm = (a) => {
  if (a.dept === "개발부"){
    console.log(a.payroll);
  } else {
    console.log("부서가 잘못되었습니다.")
  }
};

confirm(emp1);
console.log();
confirm(emp2);

// 3) 위에서 만든 emp객체 두 개를 매개변수로 받아, 매개변수로 전달된 두 객체 중 급여가 높은 객체의 이름을 리턴하는 함수를 함수표현식으로 구현하고 호출해보세요.

const compare = function (a, b) {
  if(a.payroll >= b.payroll){
    return console.log(a.name);
  } else {
    return console.log(b.name);
  }
};

compare(emp1, emp2);

//========================================================//

const foodList = [
  {
    name : '김치찌개',
    price : 12000,
    type : '한식',
    material : ['김치','두부', '돼지고기']
  }, 
  {
    name : '짜장면',
    price : 8000,
    type : '중식',
    material : ['춘장','밀가루', '양파', '오이']
  }, 
  {
    name : '불고기',
    price : 15000,
    type : '한식',
    material : ['소고기','양파', '대파']
  }, 
  {
    name : '탕수육',
    price : 25000,
    type : '중식',
    material : ['돼지고기','밀가루']
  }
];

// 4) 매개변수로 foodList가 전달되면 모든 음식의 이름을 출력하는 함수를 화살표함수로 구현하고 호출하세요.

const printAll = (a) => {
  if(a === foodList){
    for (let i=0; i<foodList.length; i++){
      console.log(foodList[i].name);
    }
  }
};

printAll(foodList);

// 5) 매개변수로 foodList가 전달되면 한식 음식의 가격의 합을 출력하는 함수를 함수표현식으로 구현하고 호출하세요.
const kfoodSum = function (a) {
  let sum = 0;
  for (let i = 0; i<foodList.length; i++){
    // if (a === foodList && foodList[i].type === '한식') {
    //   sum += foodList[i].price;
    // }
    (a === foodList && foodList[i].type === "한식") ? sum += foodList[i].price : sum += 0;
  }
  console.log(sum);
};

kfoodSum(foodList);

// 6) 매개변수로 foodList가 전달되면 음식재료가 4개 이상인 음식정보만 새로운 배열에 담아 리턴하는 함수를 구현하고 호출하세요.
const newArr = (a) => {
  let foodTest = [];
  let k = 0;
  if(a === foodList){
    for (let i=0; i<a.length; i++){
      if (foodList[i].material.length >= 4) {
        foodTest[k++] = foodList[i]; 
      }
    }
  }
  return foodTest;
};

console.log(newArr(foodList));

// 7) 첫번째 매개변수로 foodList, 두번째 매개변수로 음식명이 전달되면 전달된 음식명의 모든 요리재료를 출력하는 함수를 화살표함수로 구현하고 호출하세요. 만약, 두번째 매개변수로 전달된 음식명이 없다면 '정보없음'을 출력하세요.

const selectFood = (a, b) => {
  if(a===foodList){
    for (let i=0; i<a.length; i++){
      if(foodList[i].name === b){
        console.log(`${b} : ${foodList[i].material}`)
        return; // return하게 되면 이후 코드 실행없이 결과값을 가지고 종료한다.
      }
    }
    console.log("정보없음")
  }
};

selectFood(foodList, "짜장면");
selectFood(foodList, "우동");