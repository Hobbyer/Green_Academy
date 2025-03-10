import axios from 'axios'
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams, useSearchParams } from 'react-router-dom';

const EmpSearch = () => {
  const nav = useNavigate();
  const [params, setParams] = useSearchParams();

  const [empList, setEmpList] = useState({});
  const [deptList, setDeptList] = useState({});

  const [searchText,setSearchText] = useState({result : false})
    

  useEffect(()=>{
    axios.get(`/api/emps?id=${params.get('id')}&content=${params.get('content')}&gender=${params.get('gender')}&startDate=${params.get('startDate')}&lastDate=${params.get('lastDate')}`)
    // axios.get(`/api/emps`)
    .then((res)=>{
      setEmpList(res.data);
    }).catch((error)=>{
      console.log(error);
    })

    axios.get("/api/depts").then((res)=>{
      setDeptList(res.data);
    }).catch((error)=>{
      console.log(error);
    })
  }, [])

  const searchData = (e) => {
    setSearchText({...searchText,
      [e.target.name] : e.target.value,
      result : true
    })
  }

 
  const searchBtn = () => {
    if (searchText.result){
    axios.get(`/api/emps?id=${searchText.deptNo}&content=${searchText.empName}&gender=${searchText.gender}&startDate=${searchText.startDate}&lastDate=${searchText.lastDate}`).then((res)=>{
      setEmpList(res.data);
    }).catch((error)=>{
      console.log(error);
    })
    nav(`/search?id=${searchText.deptNo}&content=${searchText.empName}&gender=${searchText.gender}&startDate=${searchText.startDate}&lastDate=${searchText.lastDate}`)
  }
  }


  return (
    <div className='search'>
      <div className='searchBar'>
        <table>
          <tbody>
            <tr>
              <td>사원명</td>
              <td colSpan={6}>
                <input type="text" name='empName' onChange={(e)=>{
                  searchData(e);
                }} />
              </td>
              <td>
                <button type='button' onClick={(e)=>{
                  searchBtn();
                }}
                 >검색</button>
              </td>
            </tr>
            <tr>
              <td>부서</td>
              <td>
                <select name="deptNo" onChange={(e)=>{
                  searchData(e);
                }} >
                  <option value="undefined">전체</option>
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
              <td>성별</td>
              <td colSpan={2}>
                <input type="radio" name='gender' value="남" onChange={(e)=>{
                  if (e.target.value){
                    searchData(e);
                  }
                }} />남
                <input type="radio" name='gender' value="여" onChange={(e)=>{
                  if (e.target.value){
                    searchData(e);
                  }
                }} />여
              </td>
              <td>입사일</td>
              <td>
                <input type="text" name='startDate' onChange={(e)=>{
                  searchData(e);
                }} />
              </td>
              <td>
              <input type="text" name='lastDate' onChange={(e)=>{
                  searchData(e);
                }} />
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className='list_table'>
        <table>
          <thead>
            <tr>
              <th>No</th>
              <th>부서명</th>
              <th>직급</th>
              <th>사원명</th>
              <th>성별</th>
              <th>입사일</th>
            </tr>
          </thead>
          <tbody>
            {
              Object.keys(empList).map((i)=>{
                return (
                  <tr key={i}>
                    <td>{empList.length - i}</td>
                    <td>{empList[i].deptName}</td>
                    <td>{empList[i].jobName}</td>
                    <td>{empList[i].empName}</td>
                    <td>{empList[i].gender}</td>
                    <td>{dayjs(empList[i].hireDate).format("YYYY-MM-DD")}</td>
                  </tr>
                )
              })
            }
          </tbody>
        </table>
      </div>
    </div>
  )
}

export default EmpSearch