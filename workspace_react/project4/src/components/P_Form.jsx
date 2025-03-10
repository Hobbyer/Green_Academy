import React, { useState } from 'react'

export const P_Form = () => {
  const [userData, setUser] = useState(
    {
      name : "",
      id : "",
      password : "",
      confirmPassword : "",

      preNumber : "",
      frontNumber : "",
      backNumber : "",

      frontEmail : "",
      backEmail : "",

      emailReceive : "",

      hobby : [],
      gender : "",
      path : "",
      
      textBox : ""
    }
  );


  const hobbySelect = (x) => {
    const arrS = [...userData.hobby, x];
    setUser({
      ...userData,
      hobby : arrS
    })
  };

  const hobbyDrop = (x) => {
    let arrS = [...userData.hobby];
    arrS = arrS.filter((element) => element !== x)
    setUser({
      ...userData,
      hobby : arrS
    })
  }
  
  const userIdenSet = (e) => {
    setUser({
      ...userData,
      [e.target.id] : e.target.value,
    });
  }



  return (
    <>
      <div className='container'>
        <div>
          <h2>Sign Up</h2>
          <p>Become a member of Andrew{"'"}s Company. and enjoy a variety of benefits.</p>
        </div>
        <div>
          <div>
            <span>Name</span>
            <input type="text" id='name' onChange={(e)=>{
              userIdenSet(e);
            }} />
          </div>
          <div>
            <span>ID</span>
            <input type="text" id='id' onChange={(e)=>{
              userIdenSet(e);
            }} />
          </div>
          <div>
            <span>Password</span>
            <input type="password" id='password' onChange={(e)=>{
              userIdenSet(e);
            }} />
          </div>
          <div>
            <span>Confirm Password</span>
            <input type="password" id='confirmPassword' onChange={(e)=>{
              userIdenSet(e);
            }} />
          </div>
          <div>
            <span>Mobile</span>
            <select id='preNumber' onChange={(e)=>{
              userIdenSet(e);
            }}>
              <option selected disabled>----</option>
              <option value="010">010</option>
              <option value="011">011</option>
              <option value="012">012</option>
            </select>
            -
            <input type="text" id='frontNumber' onChange={(e)=>{
              userIdenSet(e);
            }} />
            -
            <input type="text" id='backNumber' onChange={(e)=>{
              userIdenSet(e);
            }} />
          </div>
          <div>
            <span>E-mail</span>
            <input type="text" id='frontEmail' onChange={(e)=>{
              userIdenSet(e);
            }} />
            @
            <input type="text" value={userData.backEmail} disabled onChange={(e)=>{
              userIdenSet(e);
            }} />
            <select id='backEmail' onChange={(e)=>{
              userIdenSet(e);
            }}>
              <option selected disabled>----</option>
              <option value="gmail.com" >Gmail</option>
              <option value="naver.com">Naver</option>
              <option value="daum.net">Kakao</option>
            </select>
          </div>
          <div>
            <span>Whether to receive email</span>
            <input type="checkbox" value="YES" name='emailReceive' onChange={(e)=>{
              e.target.checked == true ? setUser({...userData, emailReceive : "YES"}) : setUser({...userData, emailReceive : "NO"});
            }}/> Acceptance
          </div>
          <div>
            <span>Interest</span>
            <input type="checkbox" value="movie" onChange={(e)=>{
              e.target.checked == true ? hobbySelect(e.target.value) : hobbyDrop(e.target.value);   
            }} /> Movie
            <input type="checkbox" value="theater" onChange={(e)=>{
              e.target.checked == true ? hobbySelect(e.target.value) : hobbyDrop(e.target.value);   
            }}/> Theater
            <input type="checkbox" value="travel" onChange={(e)=>{
              e.target.checked == true ? hobbySelect(e.target.value) : hobbyDrop(e.target.value);   
            }} /> Travel
            <input type="checkbox" value="mountain climbing" onChange={(e)=>{
              e.target.checked == true ? hobbySelect(e.target.value) : hobbyDrop(e.target.value);   
            }} /> Mountain climbing
            <input type="checkbox" value="visiting a restaurant" onChange={(e)=>{
              e.target.checked == true ? hobbySelect(e.target.value) : hobbyDrop(e.target.value);   
            }} /> Visiting a restaurant
            <input type="checkbox" value="volunteer" onChange={(e)=>{
              e.target.checked == true ? hobbySelect(e.target.value) : hobbyDrop(e.target.value);   
            }} /> Volunteer
            <input type="checkbox" value="etc" onChange={(e)=>{
              e.target.checked == true ? hobbySelect(e.target.value) : hobbyDrop(e.target.value);
            }} /> Etc
          </div>
          <div>
            <span>Gender</span>
            <input type="radio" id='gender' name='aaa' value="Male" defaultChecked onChange={(e)=>{
              e.target.checked == true ? userIdenSet(e) : null;         
            }} /> Male
            <input type="radio" id='gender' name='aaa' value="Female" onChange={(e)=>{
              e.target.checked == true ? userIdenSet(e) : null;         
            }} /> Female
          </div>
          <div>
            <span>Path learned</span>
            <select id='path' onChange={(e)=>{
              userIdenSet(e);
            }}>
              <option selected disabled>Choose</option>
              <option value="Relative">relative</option>
              <option value="Newpaper">newspaper</option>
              <option value="Search">search</option>
            </select>
          </div>
          <div>  
            <textarea id="textBox"cols="30" rows="10" onChange={(e)=>{
              userIdenSet(e);
            }}></textarea>
          </div>
        </div>
      </div>

      <div className='result-window'>
        <p>이름 : {userData.name}</p>
        <p>아이디 : {userData.id}</p>
        <p>비밀번호 : {userData.password}</p>
        <p>비밀번호 확인 : {userData.confirmPassword}</p>
        <p>연락처 : {userData.preNumber}-{userData.frontNumber}-{userData.backNumber}</p>
        <p>이메일 : {userData.frontEmail} @ {userData.backEmail}</p>
        <p>이메일 수신여부 : {userData.emailReceive}</p>
        <p>취미 : {userData.hobby.join(', ')}</p>
        <p>성별 : {userData.gender}</p>
        <p>가입 경로 : {userData.path}</p>
        <p>텍스트박스 : {userData.textBox}</p>
      </div>
    </>
  )
}

export default P_Form