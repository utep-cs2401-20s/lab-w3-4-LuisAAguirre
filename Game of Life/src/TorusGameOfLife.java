public class TorusGameOfLife extends GameOfLife{
    TorusGameOfLife(){

    }

    TorusGameOfLife(int s){
        board = new int[size][size];
        previous = new int[size][size];
    }

    TorusGameOfLife(int[][] board){
        this.board = new int[board.length][board[0].length];
        previous = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }
    }

    @Override
    public int neighbors(int row, int column){
        int neighbors = 0;
        for(int i = row - 1; i <= row + 1; i++){
            for(int j = column - 1; j <= column + 1; j++){
                neighbors += previous[(i % board.length + board.length) % board.length][(j % board[0].length + board[0].length) % board[0].length];
            }
        }
        neighbors -= previous[row][column];
        return neighbors;
    }
}
