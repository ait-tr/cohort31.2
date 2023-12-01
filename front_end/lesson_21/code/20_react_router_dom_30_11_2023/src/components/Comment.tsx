import React from "react";
import { IComment } from "./Comments";

const Comment: React.FC<IComment> = ({ body, email }) => {
  return (
    <li>
      <div>{body}</div>
      <p>From: {email}</p>
    </li>
  );
};

export default Comment;
