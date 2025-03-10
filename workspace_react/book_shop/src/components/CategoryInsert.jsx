import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import { deleteCategory, getCategoryList, insertCategory, updateCategory } from '../apis/bookApi';

const CategoryInsert = () => {
  const nav = useNavigate();

  const [cateList, setCateList] = useState([]);
  const [insertCate, setInsertCate] = useState({});
  const [updateData, setUpdateData] = useState({});

  useEffect(()=>{
    getCategoryList().then(res=>{
      setCateList(res.data);
    }).catch(error=>{
      console.log(error);
    })

  }, [])

  const saveF = (e) => {
    setInsertCate({...insertCate,
      [e.target.name] : e.target.value
    })
  }

  const updateBtn = (category) => {
    updateCategory(category.cateCode, updateData).then(res=>{}).catch(error=>{
      console.log(error);
    })
  }

  const deleteBtn = (category) => {
    deleteCategory(category.cateCode).then(res=>{}).catch(error=>{
      console.log(error);
    })
  }

  const submitBtn = (e) => {
    var result = true;
    cateList.map((cate, i)=>{
      if(cate.cateName === insertCate.cateName){
        result = false;
      }      
    })
    if(result){
    insertCategory(insertCate).then().catch(error=>{
      console.log(error);
    })
    alert("등록 성공")
    } else {
      alert("이미 존재하는 카테고리입니다.")
    }
  }


  return (
    <div>
      <div>
        <h3>카테고리 등록</h3>
        <table>
          <tbody>
            <tr>
              <td>카테고리명</td>
              <td>
                <input type="text" name='cateName' onChange={(e)=>{
                  saveF(e);
                }} />
              </td>
              <td>
                <button type='button' onClick={()=>{
                  submitBtn();
                  nav('/admin/cateManage');
                  window.location.reload();
                }}>등록</button>
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div>
        <table>
          <thead>
            <tr>
              <th>No</th>
              <th>코드</th>
              <th>카테고리명</th>
              <th></th>
              <th></th>
            </tr>
          </thead>
          <tbody>
            {
              cateList.map((category, i)=>{
                return(
                  <tr key={i}>
                    <td>{cateList.length - i}</td>
                    <td>{category.cateCode}</td>
                    <td>
                      <input type="text" defaultValue={category.cateName} onChange={(e)=>{
                        setUpdateData({...updateData,
                          cateCode : category.cateCode,
                          cateName : e.target.value
                      })
                      }}/>
                    </td>
                    <td>
                      <button type='button' onClick={(e)=>{
                        updateBtn(category);
                        window.location.reload();
                      }}>
                        수정
                      </button>
                    </td>
                    <td>
                      <button type='button' onClick={(e)=>{
                        deleteBtn(category);
                        window.location.reload();
                      }}>
                        삭제
                      </button>
                    </td>
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

export default CategoryInsert