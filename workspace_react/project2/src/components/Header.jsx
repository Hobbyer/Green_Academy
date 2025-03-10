import { useState } from "react"

function Header() {
  // 1)
  const [num, numSet] = useState(0);

  const clickCount = () => {
    numSet(num+1);
  };

  // 2)
  const [text, textSet] = useState('ON');
  const [btn1, btnSet1] = useState('OFF');

  const clickChange = () => {
    text === 'ON' ? textSet('OFF') : textSet('ON');
    btn1 === 'ON' ? btnSet1('OFF') : btnSet1('ON');
  }

  // 3)
  const [show, showSet] = useState('yes')
  const [btn2, btnSet2] = useState('광고닫기');
  
  const clickShow = () => {
    show === 'yes' ? showSet("showBox") : showSet('yes');
    btn2 === '광고보기' ? btnSet2('광고닫기') : btnSet2('광고보기')
  };

  // 4)
  const [number, numberSet] = useState([0,0,0]);
  console.log(number[0])
  console.log(number[1])
  console.log(number[2])


  const numCount1 = () => {
    number[0] += 1;
    numberSet([number[0], number[1], number[2]]);
  };
  const numCount2 = () => {
    number[1] += 1;
    numberSet([number[0], number[1], number[2]]);
  };
  const numCount3 = () => {
    number[2] += 1;
    numberSet([number[0], number[1], number[2]]);
  };

  // 5
  const [obj, objSet] = useState({
    name : "김자바",
    age : 20,
    addr : "울산시",
  });


  const objChange = (key, a) => {
    objSet({
      ...obj,
      [key]: a,
    });
  };


  // const aaa = {
  //   name : "김자바",
  //   age : 20,
  //   addr : "울산시",
  // }

  // aaa.name;
  // aaa['name'];

  // const data = 'name';
  // aaa.data;
  // aaa[data]; // 키값을 변수로 접근할때는 대괄호를 사용해야한다!





  // 6)
  const [cnt, cntSet] = useState(0);

  const cntChange = (a) => {
    cntSet(cnt+a);
  };

  const [visi, visiSet] = useState("visibility-on");

  const visiable = () => {
    visi === "visibility-on" ? visiSet("visibility-off") : visiSet("visibility-on");
  }


  return (
    <>
      <div style={{backgroundColor: 'red', color: 'white', width: '50px', height: '60px', alignContent: 'center', textAlign: 'center', fontSize:'30px'}}>
        {num}
      </div>
      <button type="button" onClick={clickCount}>클릭</button>      
      
      <div style={{fontWeight:'bold', fontSize:'30px'}}>
        {text}
      </div>
      <button type="button" onClick={clickChange}>{btn1}</button>
      
      <div style={{backgroundColor: 'red', color: 'white', width: '300px', height: '50px', alignContent: 'center', textAlign: 'center'}} id={show}>
        <p>오늘 구매하시면 30% SALE!!!</p>
      </div>
      <button type='button' onClick={clickShow}>{btn2}</button>
      
      <div className="flex-box">
        <div onClick={numCount1}>{number[0]}</div>
        <div onClick={numCount2}>{number[1]}</div>
        <div onClick={numCount3}>{number[2]}</div>
      </div>

      <div>
        <p>이름 : {obj.name}</p>
        <p>나이 : {obj.age}</p>
        <p>주소 : {obj.addr}</p>
      </div>
      <button type="button" onClick={()=>{
        objChange('name', "홍길동");
        }}>이름을 홍길동으로 변경</button>
      <button type="button" onClick={()=>{
        objChange('age', 30);
        }}>나이를 30으로 변경</button>
      <button type="button" onClick={()=>{
        objChange('addr', "서울시")
        }}>주소를 서울시로 변경</button>
      
      <div id="cnt-line">
        <p>현재 카운트 : </p>
        <p>{cnt}</p>
      </div>
      <div className="button-area">
        <button type="button" onClick={() => {
          cntChange(-1);
        }}>-1</button>
        <button type="button" onClick={() => {
          cntChange(-10);
        }}>-10</button>
        <button type="button" onClick={() => {
          cntChange(-100);
        }}>-100</button>
        <button type="button" onClick={() => {
          cntChange(100);
        }}>+100</button>
        <button type="button" onClick={() => {
          cntChange(10);
        }}>+10</button>
        <button type="button" onClick={() => {
          cntChange(1);
        }}>+1</button>
      </div>

      <div style={{width:'400px', height:'50px',backgroundColor:'pink', alignContent:'center', textAlign:'center'}} onMouseEnter={visiable} onMouseLeave={visiable}>
        <p>마우스를 올리면 숨겨진 글자가 보여요</p>
      </div>
      <div id={visi} style={{width:'400px', height:'50px', backgroundColor:'skyblue', alignContent:'center', textAlign:'center'}}>
        <p>Hello React!</p>
      </div>

      <div>
        <button className="bbb" id="aaa" type="button" onClick={(e)=>{
          console.log(e.target.type);
          console.log(e.target.id);
          console.log(e.target.className);
          console.log("======================절 단 선==============");
        }}></button>
      </div>
    </>
  )
}

export default Header