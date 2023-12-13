import React from "react";
import './BooksPage.css';
import { useDispatch, useSelector } from "react-redux";
import { RootState } from "../../redux/storeRTK";
import { deleteBook } from "../../redux/book/bookSlice";
import EditFormRTK from "./EditFormRTK";

const BooksPageRTK: React.FC = (): JSX.Element => {
  const books = useSelector((state: RootState) => state.library.books);

    const dispatch = useDispatch();

  return (
    <div className="box">
      <h1 className="title">Books in our library:</h1>
      <ul className="list">
        {books.map(({ author, isbn, title, year }) => (
          <li className="listItem" key={isbn}>
            <p className="bookInfo">{isbn}. "{title}" - author: {author}, {year}</p>
            <button className="delete-button" onClick={() => dispatch(deleteBook(isbn))}>Delete Book</button>
            <EditFormRTK isbn={isbn} />
          </li>
        ))}
      </ul>
    </div>
  );
};

export default BooksPageRTK;
