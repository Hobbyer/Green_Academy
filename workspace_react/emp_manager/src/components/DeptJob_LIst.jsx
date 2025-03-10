import axios from 'axios'
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';

const DeptJob_LIst = () => {
  const nav = useNavigate();

  const [deptList, setDeptList] = useState({});
  const [jobList, setJobList] = useState({});

  const [insertDept, setInsertDept] = useState({});
  const [insertJob, setinsertJob] = useState({});

  useEffect(()=>{
    axios.get("/api/depts").then((res)=>{
      setDeptList(res.data);
    }).catch((error)=>{
      console.log(error);
    })
    
    axios.get("/api/jobs").then((res)=>{
      setJobList(res.data);
      console.log(res.data);
    }).catch((error)=>{
      console.log(error);
    })
  }, [])


  let dept_result = true
  const insertDeptBtn = () => {
    Object.keys(deptList).forEach(function(key){
      if (deptList[key].deptName == insertDept.deptName) {
        alert("이미 존재하는 부서입니다.")
        dept_result = false
      }
    })
    if (dept_result) {
      axios.post("/api/depts", insertDept).then((res)=>{
      }).catch((error)=>{
        console.log(error);
      })
    }
  }

  let job_result = true;
  const insertJobBtn = () => {
    Object.keys(jobList).forEach(function(key){
      if (jobList[key].jobName == insertJob.jobName) {
        alert("이미 존재하는 직급입니다.")
        job_result = false
      }
    })
    if (job_result) {
      axios.post("/api/jobs", insertJob).then((res)=>{
        console.log(res.data);
      }).catch((error)=>{
        console.log(error);
      })
    }
  }

  const deleteDeptBtn = (i) => {
    axios.delete(`/api/depts/${deptList[i].deptNo}`).then((res)=>{}).catch((error)=>{
      console.log(error);
    })
  }
  const deleteJobBtn = (i) => {
    axios.delete(`/api/jobs/${jobList[i].jobNo}`).then((res)=>{}).catch((error)=>{
      console.log(error);
    })
  }

  return (
    <div className='dept_job_list'>
      <div className='insert_area'>
        <div>
          <span>부서 등록</span>
          <table>
            <tbody>
              <tr>
                <td><input type="text" name='deptName' placeholder='등록할 부서명을 입력하세요' onChange={(e)=>{
                  setInsertDept({...insertDept,
                    [e.target.name] : e.target.value}
                  )
                }} /></td>
                <td>
                  <button type='button' onClick={(e)=>{
                    insertDeptBtn();
                    nav('/');
                    window.location.reload();
                  }} >등 록</button>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        <div className='list_table'>
          <span>부서 목록</span>
          <table>
            <thead>
              <tr>
                <th>No</th>
                <th>부서코드</th>
                <th>부서명</th>
                <th>삭제</th>
              </tr>
            </thead>
            <tbody>
              {
                Object.keys(deptList).map((i)=>{
                  return (
                    <tr key={i}>
                      <td>{deptList.length - i}</td>
                      <td>{deptList[i].deptNo}</td>
                      <td>{deptList[i].deptName}</td>
                      <td>
                        <button type='button' onClick={(e)=>{
                          deleteDeptBtn(i);
                          nav('/');
                          window.location.reload();
                        }}>삭제</button>
                      </td>
                    </tr>
                  )
                })
              }
            </tbody>
          </table>
        </div>
      </div>
      {/* ----------------------------------------------------- */}
      <div className='insert_area'>
        <div>
          <span>직급 등록</span>
          <table>
            <tbody>
              <tr>
                <td><input type="text" name='jobName' placeholder='등록할 직급을 입력하세요' onChange={(e)=>{
                  setinsertJob({[e.target.name] : e.target.value})
                }} /></td>
                <td>
                  <button type='button' onClick={(e)=>{
                    insertJobBtn();
                    nav('/');
                    window.location.reload();
                  }} >등 록</button>
                </td>
              </tr>
            </tbody>
          </table>
        </div>
        <div className='list_table'>
          <span>직급 목록</span>
          <table>
            <thead>
              <tr>
                <th>No</th>
                <th>직급코드</th>
                <th>직급</th>
                <th>삭제</th>
              </tr>
            </thead>
            <tbody>
              {
                Object.keys(jobList).map((i)=>{
                  return (
                    <tr key={i}>
                      <td>{jobList.length - i}</td>
                      <td>{jobList[i].jobNo}</td>
                      <td>{jobList[i].jobName}</td>
                      <td>
                        <button type='button' name='jobName' onClick={(e)=>{
                          deleteJobBtn(i);
                          nav('/');
                          window.location.reload();
                        }}>삭제</button>
                      </td>
                    </tr>
                  )
                })
              }
            </tbody>
          </table>
        </div>
      </div>
    </div>
  )
}

export default DeptJob_LIst