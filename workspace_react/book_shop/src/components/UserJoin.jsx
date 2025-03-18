import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const UserJoin = () => {
  const regex_id = /^[a-zA-Z]{4,16}$/; //영문자 4~16글자 정규식
  const regex_alpha_num = /^[a-zA-Z0-9]+$/; //영문자 숫자 조합 정규식
  const regex_pw = /^(?=.*[a-zA-Z])(?=.*[0-9]).{6,20}$/ //영문 숫자 조합 6~20자
  const regex_email = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i //이메일 정규식
  const regex_phone = /^0\d{2}-\d{4}-\d{4}$/ //하이픈 포함, 연락처 정규식


  const nav = useNavigate();
  const [joinForm, setJoinForm] = useState({});

  const [errMsg, setErrMsg] = useState({
    id : '',
    pw : '',
    name : '',
    email : '',
    phone : '',
  })

  const saveForm = (e) => {
    setJoinForm({...joinForm,
      [e.target.name] : e.target.value
    })
  }



  const joinBtn = () => {
    var result = true
    if (Object.keys(errMsg).map(i=>{
      errMsg[i] !== '' ? result = false : null
    }))
    if(result){
      axios.post('/api/users', joinForm).then(res=>{
        if (res.data === 0) {
          alert("이미 가입된 회원입니다.")
        } else {
          nav('/');
          alert("회원가입을 축하합니다.")
        }
      }).catch(error=>{
        console.log(error);
      })
    } else {
      alert("잘못된 입력값이 존재합니다.")
    }
  }

  return (
    <div>
      <div>
        <h2>회원가입</h2>
      </div>
      <table>
        <tbody>
          <tr>
            <td>아이디</td>
            <td>
              <input type="text" name='userId' onChange={(e)=>{
                saveForm(e);
              }} onBlur={(e)=>{
                regex_id.test(e.target.value) || regex_alpha_num.text(e.target.value) ? setErrMsg({...errMsg,
                  id : ''
                }) : setErrMsg({...errMsg,
                  id : "영문자 또는 영문자+숫자 조합 4~16글자를 입력해주세요"
                })
              }} required />
            </td>
          </tr>
          {
            errMsg.id && 
          <tr>
            <td></td>
            <td className='error-msg'>
              {errMsg.id}
            </td>
          </tr>
          }
          <tr>
            <td>비밀번호</td>
            <td>
              <input type="password" name='userPw' onChange={(e)=>{
                saveForm(e);
              }} onBlur={(e)=>{
                regex_pw.test(e.target.value) ? setErrMsg({...errMsg,
                  pw : ''
                }) : setErrMsg({...errMsg,
                  pw : "영문, 숫자 조합 6~20글자를 입력해주세요."
                })
              }} required />
            </td>
          </tr>
          {
            errMsg.pw && 
          <tr>
            <td></td>
            <td className='error-msg'>
              {errMsg.pw}
            </td>
          </tr>
          }
          <tr>
            <td>이름</td>
            <td>
              <input type="text" name='userName' onChange={(e)=>{
                saveForm(e);
              }} required />
            </td>
          </tr>
          {
            errMsg.name && 
          <tr>
            <td></td>
            <td className='error-msg'>
              {errMsg.name}
            </td>
          </tr>
          }
          <tr>
            <td>이메일</td>
            <td>
              <input type="email" name='userEmail' onChange={(e)=>{
                saveForm(e);
              }} onBlur={(e)=>{
                regex_email.test(e.target.value) ? setErrMsg({...errMsg,
                  email : ''
                }) : setErrMsg({...errMsg,
                  email : "이메일 형식에 따라 정확히 입력해주세요."
                })
              }} required />
            </td>
          </tr>
          {
            errMsg.email && 
          <tr>
            <td></td>
            <td className='error-msg'>
              {errMsg.email}
            </td>
          </tr>
          }
          <tr>
            <td>연락처</td>
            <td>
              <input type="text" name='userTel' onChange={(e)=>{
                saveForm(e);
              }} onBlur={(e)=>{
                regex_phone.test(e.target.value) ? setErrMsg({...errMsg,
                  phone : ''
                }) : setErrMsg({...errMsg,
                  phone : "하이픈(-)포함, 정확한 휴대폰번호를 입력해주세요."
                })
              }} required />
            </td>
          </tr>
          {
            errMsg.phone && 
          <tr>
            <td></td>
            <td className='error-msg'>
              {errMsg.phone}
            </td>
          </tr>
          }
        </tbody>
      </table>
      <div>
        <button type='button' onClick={(e)=>{
          joinBtn();
          console.log(joinForm);
          
        }} >
          가입하기
        </button>
      </div>
      {/* <form action={"/join"} method='POST'>
        <table>
          <tbody>
            <tr>
              <td>아이디</td>
              <td>
                <input type="text" name='userId' onChange={(e)=>{
                }} onBlur={(e)=>{
                  regex_id.test(e.target.value) || regex_alpha_num.text(e.target.value) ? setErrMsg({...errMsg,
                    id : ''
                  }) : setErrMsg({...errMsg,
                    id : "영문자 또는 영문자+숫자 조합 4~16글자를 입력해주세요"
                  })
                }} required />
              </td>
            </tr>
            {
              errMsg.id && 
            <tr>
              <td></td>
              <td className='error-msg'>
                {errMsg.id}
              </td>
            </tr>
            }
            <tr>
              <td>비밀번호</td>
              <td>
                <input type="password" name='userPw' onChange={(e)=>{
                }} onBlur={(e)=>{
                  regex_pw.test(e.target.value) ? setErrMsg({...errMsg,
                    pw : ''
                  }) : setErrMsg({...errMsg,
                    pw : "영문, 숫자 조합 6~20글자를 입력해주세요."
                  })
                }} required />
              </td>
            </tr>
            {
              errMsg.pw && 
            <tr>
              <td></td>
              <td className='error-msg'>
                {errMsg.pw}
              </td>
            </tr>
            }
            <tr>
              <td>이름</td>
              <td>
                <input type="text" name='userName' onChange={(e)=>{
                }} required />
              </td>
            </tr>
            {
              errMsg.name && 
            <tr>
              <td></td>
              <td className='error-msg'>
                {errMsg.name}
              </td>
            </tr>
            }
            <tr>
              <td>이메일</td>
              <td>
                <input type="email" name='userEmail' onChange={(e)=>{
                }} onBlur={(e)=>{
                  regex_email.test(e.target.value) ? setErrMsg({...errMsg,
                    email : ''
                  }) : setErrMsg({...errMsg,
                    email : "이메일 형식에 따라 정확히 입력해주세요."
                  })
                }} required />
              </td>
            </tr>
            {
              errMsg.email && 
            <tr>
              <td></td>
              <td className='error-msg'>
                {errMsg.email}
              </td>
            </tr>
            }
            <tr>
              <td>연락처</td>
              <td>
                <input type="text" name='userTel' onChange={(e)=>{
                }} onBlur={(e)=>{
                  regex_phone.test(e.target.value) ? setErrMsg({...errMsg,
                    phone : ''
                  }) : setErrMsg({...errMsg,
                    phone : "하이픈(-)포함, 정확한 휴대폰번호를 입력해주세요."
                  })
                }} required />
              </td>
            </tr>
            {
              errMsg.phone && 
            <tr>
              <td></td>
              <td className='error-msg'>
                {errMsg.phone}
              </td>
            </tr>
            }
          </tbody>
        </table>
        <button type='submit'>회원가입</button>
      </form> */}
    </div>
  )
}

export default UserJoin