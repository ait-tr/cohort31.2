// rafce - react arrow function component export

import React from "react";

const Header = () => {
  return (
    <header>
      <nav>
        <ul>
          <li className="commonButton">Home</li>
          <li className="commonButton">About Me</li>
          <li className="commonButton">Star Wars</li>
          <li className="commonButton">Contact</li>
        </ul>
      </nav>
      <h1>Luke Skywalker</h1>
    </header>
  );
};

export default Header;
