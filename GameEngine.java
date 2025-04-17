public class GameEngine {
    public static void main(String[] args) {
        SudokuBoard sudoku = new SudokuBoard("data1.sdk");
        System.out.println(sudoku);
    }
}
/*

2 . .   1 . 5   . . 3
. 5 4   . . .   7 1 .
. 1 .   2 . 3   . 8 .

6 . 2   8 . 7   3 . 4
. . .   . . .   . . .
1 . 5   3 . 9   8 . 6

. 2 .   7 . 1   . 6 .
. 8 1   . . .   2 4 .
7 . .   4 . 2   . . 1

https://github.com/miku3223/Sudoku1
*/