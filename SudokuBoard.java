import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SudokuBoard {
    private char[][] board;

    public SudokuBoard(String fileName){
        board = new char[9][9];
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int r = 0;

            while (scanner.hasNextLine() && r < 9) {
                String line = scanner.nextLine();
                for (int c = 0; c < 9; c++) {
                    board[r][c] = line.charAt(c);
                }
                r++;
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cannot load: " + fileName);
        } catch (InputMismatchException e) {
            System.out.println(fileName + " does not meet format expectations.");
        }
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[0].length; c++) {
                sb.append(board[r][c]).append(" ");
                if (c == 2 || c == 5) {
                    sb.append(' ');
                    sb.append(' ');
                }
            }
            sb.append("\n");
            if (r == 2 || r == 5) {
                sb.append('\n');
            }
        }
        return sb.toString();
    }
}
