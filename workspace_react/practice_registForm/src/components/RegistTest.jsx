import React, { useEffect, useState } from 'react'

export const RegistTest = () => {
  const [userInfo, setInfo] = useState({});
  
  const [user, setUser] = useState({
    userFrom : "개인회원",
  
    id : "",
    pw : "",
    pwConfirm : "",
    name : "",
    addrNum : "",
    addr : "",
    callNumber : "",
    phoneNumber : "",
    email : "",
    smsRec : [],
    emaiRec : [],
    alwaysUser : false,
  
    birth : "",
    birthDivision : "",
    gender : "",
    clothSize : [],
    pantsSize : [], 
  });

  useEffect(()=>{
    callNumber();
  }, [userInfo.callHeadNum ,userInfo.callCenterNum, userInfo.callEndNum])

  useEffect(()=>{
    phoneNumber();
  }, [userInfo.phoneHeadNum ,userInfo.phoneCenterNum, userInfo.phoneEndNum])

  useEffect(()=>{
    addr();
  }, [userInfo.addrBasis ,userInfo.addrDetail])

  useEffect(()=>{
    birth();
  }, [userInfo.birthYear ,userInfo.birthMonth, userInfo.birthDay])

  //useEffect 생일


  const submitBtn = (e) => {
    setUser(userInfo);
  };

  const confirmData = () => {
    console.log(userInfo);
    console.log(user);
  };

  const callNumber = () => {
    setUser({...user, callNum : userInfo.callHeadNum + "-" + userInfo.callCenterNum + "-" + userInfo.callEndNum}) 
  };

  const phoneNumber = () => {
    setUser({...user, phoneNumber : userInfo.phoneHeadNum + "-" + userInfo.phoneCenterNum + "-" + userInfo.phoneEndNum}) 
  };

  const addr = () => {
    setUser({...user, addr : userInfo.addrBasis + " " + userInfo.addrDetail}) 
  };

  const birth = () => {
    setUser({...user, birth : userInfo.birthYear + "년 " + userInfo.birthMonth + "월 " + userInfo.birthDay + "일"})
  };



  return (
    <>
      <div className='container'>
        <div className='header'>
          <h4>회원 가입</h4>
          <div className='content-box'>
            <div className='left-box'>
              <p>회원구분<span className='red-star'>*</span></p>
            </div>
            <div className='right-box'>
              <input type="radio" name='what-from' value="개인회원" defaultChecked onChange={(e)=>{e.target.checked ? setInfo({...userInfo, userFrom : e.target.value}) : null}} />  개인회원
              <input type="radio" name='what-from' value="외국인회원" onChange={(e)=>{e.target.checked ? setInfo({...userInfo, userFrom : e.target.value}) : null}} /> 외국인회원(foreigner)
            </div>
          </div>
        </div>
        <div className='mid'>
          <h4>기본정보</h4>
          <div className='content-box'>
            <div className='left-box'>
              <p>아이디<span className='red-star'>*</span></p>
            </div>
            <div className='right-box'>
              <input type="text" className='basic-input' onChange={(e)=>setInfo({...userInfo, id : e.target.value})} /> <span className='support-text'>(영문소문자/숫자, 4~16자)</span>
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>비밀번호<span className='red-star'>*</span></p>
            </div>
            <div className='right-box'>
              <input type="password" className='basic-input' onChange={(e)=>setInfo({...userInfo, pw : e.target.value})} /> <span className='support-text'>(영문 대소문자/숫자/특수문자 중 2가지 이상 조합, 8자~16자)</span>
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>비밀번호 확인<span className='red-star'>*</span></p>
            </div>
            <div className='right-box'>
              <input type="password" className='basic-input' onChange={(e)=>setInfo({...userInfo, pwConfirm : e.target.value})} />
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>이름<span className='red-star'>*</span></p>
            </div>
            <div className='right-box'>
              <input type="text" className='basic-input' onChange={(e)=>setInfo({...userInfo, name : e.target.value})} />
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>주소</p>
            </div>
            <div className='right-box addr-box'>
              <div className='addr-line first-line'>
                <input type="text" onChange={(e)=>setInfo({...userInfo, addrNum : e.target.value})} /> <button type='button'> <span className='support-text'>우편번호</span> <span className='addr-btn'>{">"}</span></button>
              </div>
              <div className='addr-line second-line'>
                <input type="text" onChange={(e)=>setInfo({...userInfo, addrBasis : e.target.value})} /> <span className='support-text'>기본주소</span>
              </div>
              <div className='addr-line third-line'>
                <input type="text" onChange={(e)=>setInfo({...userInfo, addrDetail : e.target.value})} /> <span className='support-text'>나머지주소 (선택입력)</span>
              </div>
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>일반전화</p>
            </div>
            <div className='right-box call-number'>
              <select defaultValue='null' onChange={(e)=>{
                setInfo({...userInfo, callHeadNum : e.target.value});
              }}>
                <option value='null' disabled>----</option>
                <option value="02">02</option>
                <option value="052">052</option>
                <option value="053">053</option>
              </select>
              -
              <input type="text" onChange={(e)=>{setInfo({...userInfo, callCenterNum : e.target.value});
            }} />
              -
              <input type="text" onChange={(e)=>{setInfo({...userInfo, callEndNum : e.target.value});
            }} />
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>휴대전화<span className='red-star'>*</span></p>
            </div>
            <div className='right-box phone-number'>
              <select defaultValue='null' onChange={(e)=>{
                setInfo({...userInfo, phoneHeadNum : e.target.value});
              }}>
                <option value='null' disabled>----</option>
                <option value="010">010</option>
                <option value="011">011</option>
                <option value="018">018</option>
              </select>
              -
              <input type="text" onChange={(e)=>setInfo({...userInfo, phoneCenterNum : e.target.value})} />
              -
              <input type="text" onChange={(e)=>setInfo({...userInfo, phoneEndNum : e.target.value})} />
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>SMS 수신여부<span className='red-star'>*</span></p>
            </div>
            <div className='right-box receive'>
              <p>
                <input type="checkbox" onChange={(e)=>{e.target.checked ? setInfo({...userInfo, smsRec : true}) : setInfo({...userInfo, smsRec : e.target.value != e.target.value})}} /> 동의함
              </p>
              <span className='support-text'>
                쇼핑몰에서 제공하는 유익한 이벤트 소식을 SNS로 받으실 수 있습니다.
              </span>
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>이메일<span className='red-star'>*</span></p>
            </div>
            <div className='right-box'>
              <input type="email" className='basic-input' onChange={(e)=>setInfo({...userInfo, email : e.target.value})} />
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>이메일 수신여부<span className='red-star'>*</span></p>
            </div>
            <div className='right-box receive'>
              <p>
                <input type="checkbox" onChange={(e)=>{e.target.checked ? setInfo({...userInfo, emailRec : true}) : setInfo({...userInfo, emailRec : e.target.value != e.target.value})}} /> 동의함
              </p>
              <span className='support-text'>
                쇼핑몰에서 제공하는 유익한 이벤트 소식을 이메일로 받으실 수 있습니다.
              </span>
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>평생회원</p>
            </div>
            <div className='right-box always-user'>
              <p>
                <input type="radio" name='always' onChange={(e)=>{e.target.checked ? setInfo({...userInfo, alwaysUser : true}) : setInfo({...userInfo, alwaysUser : false})}} /> 동의함
                <input type="radio" name='always' defaultChecked onChange={(e)=>{e.target.checked ? setInfo({...userInfo, alwaysUser : false}) : setInfo({...userInfo, alwaysUser : true})}} /> 동의안함
              </p>
              <p>
                <span className='support-text'>
                  - 평생회원으로 가입하시면 <b>스타일맨</b> 회원 탈퇴시까지는 휴면회원으로 전환되지 않으며, 고객님의 개인정보가 탈퇴시까지 안전하게 보관됩니다.
                </span>
              </p>
              <p>
                <span className='support-text'>
                  - 지금 평생회원으로 가입하시면 <b>쿠폰혜택</b>을 드립니다. (쿠폰혜택을 받으신 경우, 3개월간 평생회원을 유지하셔야 합니다.)
                </span>
              </p>
            </div>
          </div>
        </div>
        <div className='bottom'>
          <h4>추가정보</h4>
          <div className='content-box'>
            <div className='left-box'>
              <p>생년월일<span className='red-star'>*</span></p>
            </div>
            <div className='right-box birth'>
              <div className='birth-date'>
                <input type="text" onChange={(e)=>{
                  setInfo({...userInfo, birthYear : e.target.value})
                }} /> 년 
                <input type="text" onChange={(e)=>{
                  setInfo({...userInfo, birthMonth : e.target.value})
                }} /> 월
                <input type="text" onChange={(e)=>{
                  setInfo({...userInfo, birthDay : e.target.value})
                }} /> 일
              </div>
              <div>
                <input type="radio" name='birth-day' value="양력" defaultChecked onChange={(e)=>{
                  setInfo({...userInfo, birthDivision : e.target.value})
                }} />양력
                <input type="radio" name='birth-day' value="음력" onChange={(e)=>{
                  setInfo({...userInfo, birthDivision : e.target.value})
                }} />음력 
                <span className='support-text'> (14세 미만 회원가입을 제한하고 있습니다.)</span>
              </div>
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>성별</p>
            </div>
            <div className='right-box'>
              <input type="radio" name='gender' value="남자" onChange={(e)=>{e.target.checked ? setInfo({...userInfo, gender : e.target.value}) : setInfo({...userInfo, gender : null})}} />남자
              <input type="radio" name='gender' value="여자" onChange={(e)=>{e.target.checked ? setInfo({...userInfo, gender : e.target.value}) : setInfo({...userInfo, gender : null })}} />여자
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>상의 사이즈</p>
            </div>
            <div className='right-box'>
              <input type="checkbox" />90~95
              <input type="checkbox" />100~105
              <input type="checkbox" />110~115
              <input type="checkbox" />120~125
              <input type="checkbox" />130~
            </div>
          </div>
          <div className='content-box'>
            <div className='left-box'>
              <p>하의 사이즈</p>
            </div>
            <div className='right-box'>
              <input type="checkbox" />~30
              <input type="checkbox" />32
              <input type="checkbox" />33
              <input type="checkbox" />34
              <input type="checkbox" />35
              <input type="checkbox" />36
              <input type="checkbox" />37
              <input type="checkbox" />38
              <input type="checkbox" />39
              <input type="checkbox" />40
              <input type="checkbox" />42~
            </div>
          </div>
        </div>
        <div className='complete-line'>
          <div className='btn-area'>
            <button type='button'>가입완료</button>
            <button type='button'>취소</button>
          </div>
        </div>
      </div>
      
        <button type='button' onClick={(e)=>{
          confirmData();
        }}>버튼</button>
      
    </>
  )
}

export default RegistTest