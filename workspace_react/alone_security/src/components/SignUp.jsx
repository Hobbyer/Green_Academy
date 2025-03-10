import axios from "axios"
import { useState } from "react"

const SignUp = () => {
  
  const [data, setData] = useState({})

  const saveData = (e) => {
    setData({...data,
      [e.target.name] : e.target.value
    })
  }

  const submitBtn = () => {
    axios.post('/api/auth/signup', data).then(res=>{
      console.log(res.data);
    }).catch(error=>{
      console.log(error);
    })
  }

  return (
    <div>SignUp
      <table>
        <tbody>
          <tr>
            <td>Email</td>
            <td>
              <input type="email" name='email' onChange={(e)=>{
                saveData(e);
              }} />
            </td>
          </tr>
          <tr>
            <td>비밀번호</td>
            <td>
              <input type="password" name='pw' onChange={(e)=>{
                saveData(e);
              }} />
            </td>
          </tr>
          <tr>
            <td>연락처</td>
            <td>
              <input type="text" name='tel' onChange={(e)=>{
                saveData(e);
              }} />
            </td>
          </tr>
        </tbody>
      </table>
      <div>
        <button type="button" onClick={()=>{
          submitBtn();
        }}>회원가입</button>
      </div>
    </div>
  )
}

export default SignUp