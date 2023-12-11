import { createSlice } from "@reduxjs/toolkit";

interface IGameState {
    squares: Array<'O' | 'X' | null>;
    xIsNext: boolean;
}

const initialState: IGameState = {
    squares: Array(9).fill(null),
    xIsNext: true
}

const gameSlice = createSlice({
    name: 'game',
    initialState,
    reducers: {
        handleClick: (state, action) => {

        }
    }
});

export function calculateWinner(squares: Array<'O' | 'X' | null>): string | null {
    const lines = [
        [0, 1, 2],
        [3, 4, 5],
        [6, 7, 8],
        [0, 3, 6],
        [1, 4, 7],
        [2, 5, 8],
        [0, 4, 8],
        [2, 4, 6]
    ]
    return null;
}

export default gameSlice.reducer;