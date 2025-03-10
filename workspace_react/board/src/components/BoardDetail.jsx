import axios from "axios";
import dayjs from "dayjs";
import React, { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

const BoardDetail = () => {
  const params = useParams();
  const nav = useNavigate();

  const [board, setBoard] = useState({});
  const [replyList, setReplyList] = useState({});
  const [insertReply, setInsertReply] = useState({});
  const [updateReply, setUpdateReply] = useState({});


  useEffect(() => {
    axios
      .get(`/api/boards/${params.boardNum}`)
      .then((res) => {
        setBoard(res.data);
      })
      .catch((error) => {
        console.log(error);
      });

    axios
      .get(`/api/boards/reply/${params.boardNum}`)
      .then((res) => {
        console.log(res.data);
        setReplyList(res.data);
        setInsertReply(res.data);
      })
      .catch((error) => {
        console.log(error);
      });
  }, []);

  const deleteBtn = () => {
    axios
      .delete(`/api/boards/${params.boardNum}`)
      .then((res) => {})
      .catch((error) => {});
  };

  const replyChange = (e) => {
    setInsertReply({ ...insertReply, [e.target.name]: e.target.value });
  };

  const replyIn = () => {
    axios
      .post(`/api/boards/reply/${params.boardNum}`, insertReply)
      .then((res) => {})
      .catch((error) => {});
  };

  const delReply = (i) => {
    axios
      .delete(`/api/boards/reply/${params.boardNum}/${replyList[i].replyNum}`)
      .then((res) => {})
      .catch((error) => {});
  };

  const updateBtn = (i) => {
    axios
      .put(
        `/api/boards/reply/${params.boardNum}/${replyList[i].replyNum}`,
        updateReply
      )
      .then((res) => {})
      .catch((error) => {
        console.log(error);
      });
  };

  return (
    <div>
      <table>
        <tbody>
          <tr>
            <td>작성일</td>
            <td>{dayjs(board.regDate).format("YYYY-MM-DD HH:mm:ss")}</td>
            <td>작성자</td>
            <td>{board.writer}</td>
            <td>조회수</td>
            <td>{board.readCnt}</td>
          </tr>
          <tr>
            <td>제목</td>
            <td colSpan={5}>{board.title}</td>
          </tr>
          <tr>
            <td>내용</td>
            <td colSpan={5}>{board.content}</td>
          </tr>
        </tbody>
      </table>
      <div className="btn-area">
        <button
          type="button"
          onClick={(e) => {
            nav("/");
            window.location.reload();
          }}
        >
          목록가기
        </button>
        <button
          type="button"
          onClick={() => {
            nav(`/update/${board.boardNum}`);
          }}
        >
          수정
        </button>
        <button
          type="button"
          onClick={() => {
            deleteBtn();
            nav("/");
            window.location.reload;
          }}
        >
          삭제
        </button>
      </div>
      <div>
        <div>
          <table>
            <tbody>
              <tr>
                <td>작성자</td>
                <td>
                  <input
                    type="text"
                    name="writer"
                    onChange={(e) => {
                      replyChange(e);
                    }}
                  />
                </td>
              </tr>
              <tr>
                <td>내용</td>
                <td>
                  <textarea
                    name="content"
                    onChange={(e) => {
                      replyChange(e);
                    }}
                  />
                </td>
              </tr>
            </tbody>
          </table>
          <button
            type="button"
            onClick={(e) => {
              replyIn();
            }}
          >
            작성
          </button>
        </div>
        <div>
          <table>
            <tbody>
              {Object.keys(replyList).map((i) => {
                return (
                  <tr key={i}>
                    <td>{replyList[i].writer}</td>
                    <td id={`${i}-content`}>{replyList[i].content}</td>

                    <td id={`${i}-input`} style={{ display: "none" }}>
                      <input
                        type="text"
                        name="content"
                        defaultValue={replyList[i].content}
                        onChange={(e) => {
                          setUpdateReply({
                            ...updateReply,
                            [e.target.name]: e.target.value,
                          });
                        }}
                      />
                    </td>

                    <td>{replyList[i].regDate}</td>
                    <td>
                      <button
                        id={`${i}-update`}
                        style={{ display: "" }}
                        type="button"
                        onClick={(e) => {
                          document.getElementById(`${i}-content`).style.display = "none";
                          document.getElementById(`${i}-input`).style.display = "";
                          document.getElementById(`${i}-update`).style.display = "none";
                          document.getElementById(`${i}-complete`).style.display = "";
                        }}
                      >
                        수정
                      </button>
                    </td>
                    <td>
                      <button
                        id={`${i}-complete`}
                        style={{ display: "none" }}
                        type="button"
                        onClick={(e) => {
                          updateBtn(i);

                          document.getElementById(
                            `${i}-content`
                          ).style.display = "";
                          document.getElementById(`${i}-input`).style.display =
                            "none";
                          document.getElementById(`${i}-update`).style.display =
                            "";
                          document.getElementById(
                            `${i}-complete`
                          ).style.display = "none";

                          window.location.reload;
                        }}
                      >
                        수정완료
                      </button>
                    </td>
                    <td>
                      <button
                        type="button"
                        onClick={(e) => {
                          delReply(i);
                          window.location.reload();
                        }}
                      >
                        삭제
                      </button>
                    </td>
                  </tr>
                );
              })}
            </tbody>
          </table>
        </div>
      </div>
    </div>
  );
};

export default BoardDetail;
