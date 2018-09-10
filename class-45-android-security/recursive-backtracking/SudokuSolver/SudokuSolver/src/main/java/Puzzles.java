public class Puzzles {
    public static final int[][] EASY = {
        {2, 3, 0, 7, 0, 0, 0, 6, 8},
        {0, 6, 0, 0, 0, 0, 0, 7, 4},
        {4, 0, 0, 0, 2, 6, 0, 1, 0},

        {3, 0, 0, 0, 7, 0, 9, 0, 0},
        {0, 8, 0, 0, 3, 0, 0, 2, 0},
        {0, 0, 2, 0, 1, 0, 0, 0, 5},

        {0, 4, 0, 3, 5, 0, 0, 0, 2},
        {9, 5, 0, 0, 0, 0, 0, 8, 0},
        {8, 2, 0, 0, 0, 7, 0, 5, 3},
    };

    // solution
    // 3 1 6 5 7 8 4 9 2
    // 5 2 9 1 3 4 7 6 8
    // 4 8 7 6 2 9 5 3 1
    // 2 6 3 4 1 5 9 8 7
    // 9 7 4 8 6 3 1 2 5
    // 8 5 1 7 9 2 6 4 3
    // 1 3 8 9 4 7 2 5 6
    // 6 9 2 3 5 1 8 7 4
    // 7 4 5 2 8 6 3 1 9
    public static final int[][] EXAMPLE2 = {
        {3,0,6,5,0,8,4,0,0},
        {5,2,0,0,0,0,0,0,0},
        {0,8,7,0,0,0,0,3,1},
        {0,0,3,0,1,0,0,8,0},
        {9,0,0,8,6,3,0,0,5},
        {0,5,0,0,9,0,6,0,0},
        {1,3,0,0,0,0,2,5,0},
        {0,0,0,0,0,0,0,7,4},
        {0,0,5,2,0,6,3,0,0}
    };



    public static SudokuBoard initializeBoard(int[][] initial) {
        SudokuBoard board = new SudokuBoard();
        for (int row = 0; row < SudokuBoard.SIZE; row++) {
            for (int col = 0; col < SudokuBoard.SIZE; col++) {
                int val = initial[row][col];
                board.set(row, col, val);
            }
        }
        return board;
    }
}
