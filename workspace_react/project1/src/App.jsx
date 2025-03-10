import "./App.css";
import Footer from "./components/Footer";
import SideMenu from "./components/SideMenu";
import StateTest from "./components/StateTest";

function Header() {
  return (
    <>
      <div>header</div>
    </>
  );
}

function App() {
  let title = "오늘의 제목";
  let arr = [1, 2, 3];
  let person = {
    name: "kim",
    age: 20,
  };

  //num의 값이 3이상이면 div 보이게!
  let num = 5;

  return (
    <>
      <StateTest/>
      <br />
      {num >= 3 ? <div>3 이상입니다.</div> : ""}
      <Header />
      <div className="title" style={{ backgroundColor: "red" }}>
        <p>{title}</p>
        <p>
          {10 + 20} + {20}
        </p>
        <p>{arr[0]}</p>
        <p>{person.name}</p>
        <p>{person.age}</p>
        <p>
          객체를 통째로 넣는건 안되지만, 객체의 요소를 넣는건 오류없이 출력된다.
        </p>
      </div>
      <SideMenu />
      <Footer />
    </>
  );
}

export default App;
