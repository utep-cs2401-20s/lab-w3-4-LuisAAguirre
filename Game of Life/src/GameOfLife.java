public class GameOfLife {
    int size;
    int[][] board;
    int[][] previous;

    GameOfLife(){

    }

    GameOfLife(int size){
        board = new int[size][size];
        previous = new int[size][size];
    }

    GameOfLife(int[][] board){
        this.board = new int[board.length][board[0].length];
        previous = new int[board.length][board[0].length];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }
    }

    public int[][] getBoard() {
        return board;
    }

    public void oneStep(){
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j < previous[i].length; j++){
                int liveNeighbors = neighbors(i,j);
                if(previous[i][j] == 1 && liveNeighbors < 2){
                    board[i][j] = 0;
                } else if(previous[i][j] == 1 && liveNeighbors > 3){
                    board[i][j] = 0;
                } else if(previous[i][j] == 0 && liveNeighbors == 3){
                    board[i][j] = 1;
                } else{
                    board[i][j] = previous[i][j];
                }
            }
        }

        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j < previous[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }
        System.out.println();

        printBoard();
    }

    public int neighbors(int row, int column){
        int neighbors = 0;
        for(int i = row - 1; i <= row + 1; i++){
            for(int j = column - 1; j <= column + 1; j++){
                if((i < 0) || (i > previous.length - 1) || (j < 0) || (j > previous[i].length - 1)){
                    continue;
                }
                neighbors += previous[i][j];
            }
        }
        neighbors -= previous[row][column];
        return neighbors;
    }

    public void evolution(int n){
        while(n > 0){
            oneStep();
            --n;
        }
    }

    public void printBoard(){
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j < previous[i].length; j++){
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
