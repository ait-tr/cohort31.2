import React from 'react';

interface ISquareProps {
    value: 'X' | 'O' | null;
    handleClick: () => void
}

const Square: React.FC<ISquareProps> = ({ value, handleClick }) => {
  return (
    <button className='square' onClick={handleClick}> {value} </button>
  )
}

export default Square