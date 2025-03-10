import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';

const EmpManage = () => {
  const nav = useNavigate();

  const [deptList, setDeptList] = useState({});
  const [jobList, setJobList] = useState({});

  const [saveText, setSaveText] = useState({});

  useEffect(()=>{
    axios.get("/api/depts").then((res)=>{
      setDeptList(res.data)
    }).catch((error)=>{
      console.log(error);
    })

    axios.get("/api/jobs").then((res)=>{
      setJobList(res.data);
    }).catch((error)=>{
      console.log(error);
    })
  }, [])

  const saveF = (e) => {
    setSaveText({...saveText,
      [e.target.name] : e.target.value
    })
  }

  const submitBtn = () => {
    axios.post("/api/emps", saveText).then((res)=>{}).catch((error)=>{
      console.log(error);
    })
  }
  
  return (
    <div className='emp_manage'>
      <div>
        <span>사원 등록</span>
        <table>
          <tbody>
            <tr>
              <td>소속부서</td>
              <td>
                <select name="deptNo" id="" defaultValue={"default"} onChange={(e)=>{
                  saveF(e);
                }} >
                  <option value="default" disabled>선택</option>
                  {
                    Object.keys(deptList).map((i)=>{
                      return (
                        <option key={i} value={deptList[i].deptNo}>
                          {deptList[i].deptName}
                        </option>
                      )
                    })
                  }
                </select>
              </td>
            </tr>
            <tr>
              <td>직급</td>
              <td>
                <select name="jobNo" id="" defaultValue={"default"} onChange={(e)=>{
                  saveF(e);
                }} >
                  <option value="default" disabled>선택</option>
                  {
                    Object.keys(jobList).map((i)=>{
                      return (
                        <option key={i} value={jobList[i].jobNo}>
                          {jobList[i].jobName}
                        </option>
                      )
                    })
                  }
                </select>
              </td>
            </tr>
            <tr>
              <td>사원명</td>
              <td>
                <input type="text" name='empName' onChange={(e)=>{
                  saveF(e);
                }} />
              </td>
            </tr>
            <tr>
              <td>성별</td>
              <td>
                <input type="radio" name='gender' value="남" onChange={(e)=>{
                  if (e.target.value) {
                    saveF(e);
                  }
                }} />남
                <input type="radio" name='gender' value="여" onChange={(e)=>{
                  if (e.target.value) {
                    saveF(e);
                  }
                }} />여
              </td>
            </tr>
            <tr>
              <td>입사일</td>
              <td>
                <input type="text" name='hireDate' onChange={(e)=>{
                  saveF(e);
                }} />
              </td>
            </tr>
          </tbody>
        </table>
        <div className='btn-area'>
          <button type='button' onClick={(e)=>{
            submitBtn();
            // nav('/');
            // window.location.reload();
          }} >등록</button>
        </div>
      </div>
    </div>
  )
}

export default EmpManage