import React from 'react'

export const Detail = (props) => {
  const {board, s} = props;
  console.log(board);

  return (
    <div className={s.detailOn}>
      <table>
        <tbody>
          <tr>
            <td>글번호</td>            
            <td>{board.textNum}</td>
            <td>작성자</td>
            <td>{board.writer}</td>
          </tr>
          <tr>
            <td>글 제목</td>
            <td>{board.title}</td>
            <td>조회수</td>
            <td>{board.viewCnt}</td>
          </tr>
          <tr>
            <td>글내용</td>
            <td colSpan={3}>{board.content}</td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}

export default Detail