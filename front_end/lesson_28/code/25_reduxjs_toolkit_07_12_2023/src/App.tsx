import React from "react";
import "./App.css";
import CounterRTK from "./components/counter/CounterRTK";
import SandwichRTK from "./components/sandwich/SandwichRTK";
import CreateBookRTK from "./components/library/CreateBookRTK";
import BooksPageRTK from "./components/library/BooksPageRTK";

function App() {
  return (
    <>
      <CounterRTK />
      <SandwichRTK />
      <CreateBookRTK />
      <BooksPageRTK />
    </>
  );
}

export default App;
