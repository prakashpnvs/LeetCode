package medium.Design_Tic_Tac_Toe;

class TicTacToe {

    /** Initialize your data structure here. */
    int[] vertical;
    int[] horizontal;
    int[] diagonal;
    int max;

    public TicTacToe(int n) {
        vertical = new int[n];
        horizontal = new int[n];
        diagonal = new int[2];
        max = n;
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        int val = player == 1 ? 1 : -1;
        vertical[row] = vertical[row] + val;
        horizontal[col] = horizontal[col] + val;
        if(row == col) {
            diagonal[0] = diagonal[0] + val;
        }

        if(row == max -1 - col) {
            diagonal[1] = diagonal[1] + val;
        }

        if(vertical[row] == max || horizontal[col] == max || diagonal[0] == max || diagonal[1] == max) {
            return 1;
        } else if (vertical[row] == -max || horizontal[col] == -max || diagonal[0] == -max || diagonal[1] == -max) {
            return 2;
        } else {
            return 0;
        }
    }
}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */
