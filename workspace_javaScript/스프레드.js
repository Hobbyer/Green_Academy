const arr1 = [1, 2, 3];
const arr2 = [4, 5];

//[1, 2, 3, 4, 5]
arr3 = [1, 2, 3, ...arr2]; // 스프레드 연산자 : [...배열명]
arr4 = [...arr1, ...arr2];
console.log(arr3);
console.log(arr4);

const person = {
  name : 'kim',
  age : 20,
};

const score = {
  korScore : 80,
  mathScore : 100,
};

const student = {
  ...person,
  ...score,
};
console.log(student);