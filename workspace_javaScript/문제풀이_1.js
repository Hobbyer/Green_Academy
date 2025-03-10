// 1) 정수로 이루어진 배열이 매개변수로 들어오면 해당 배열에서 짝수만 출력하는 함수를 선언하고 호출하세요.

const evenOfArray = (a) => {
  let arr = [];
  for(let i=0; i<a.length; i++){
    if(a[i] % 2 === 0){
      arr.push(a[i]);
    }
  }
  console.log(arr);
};


const testArr = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,20,22,80,81,83,85,86];

evenOfArray(testArr);

// 2) 정수로 이루어진 두 배열이 매개변수로 들어오면 두 배열의 모든 요소들의 평균을 리턴하는 함수를 함수표현식으로 구현하고 호출하세요.

const avgOfArr = function (a, b) {
  let sum = 0;
  for(let i=0; i<a.length; i++){
    sum += a[i];
  }
  for(let k=0; k<b.length; k++){
    sum += b[k];
  }
  return sum;
};

const test2Arr1 = [1, 4, 5];
const test2Arr2 = [3, 7, 10, 20];

console.log(avgOfArr(test2Arr1, test2Arr2));

// 3) 문자열로 이루어진 배열이 매개변수로 전달되면 배열 각 요소의 글자 중 길이가 가장 긴 문자열을 리턴하는 함수를 화살표함수로 구현하고 호출하세요.

const longest = (a) => {
  let temp = [];
  for (let i=0; i<a.length; i++){
    for (let k=0; k<i; k++){
      if (a[i].length >= a[k].length) {
        temp[k] = a[k];
        a[k] = a[i];
        a[i] = temp[k];
      }
    }
  }
  return a[0];
};

const test3Arr = ["java", "python", "C", "react"];

console.log(longest(test3Arr));

// 4) 첫번째 매개변수로 전달된 정수의 배수를 두번째 매개변수의 갯수만큼 갖는 배열을 리턴하는 함수를 선언하고 호출해보세요.
const increse = (a, b) => {
  let test4Arr = [];
  let k = 1;
  for (let i=0; i<b; i++){
    test4Arr[i] = a * k++;
  }
  return test4Arr;
};

console.log(increse(4, 5));