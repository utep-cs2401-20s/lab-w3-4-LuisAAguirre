public class GameOfLife {
    /*
    Sources:
    https://bitstorm.org/gameoflife/ - used to understand how the game of life works and to create test cases

    https://www.java-forums.org/advanced-java/86142-creating-array-works-like-torus.html - used to understand how torus woul
     */

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
        //Nested for loops change board based on the contents of previous
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j < previous[i].length; j++){
                int liveNeighbors = neighbors(i,j);
                if(previous[i][j] == 1 && liveNeighbors < 2){               //Checks if cell dies from underpopulation
                    board[i][j] = 0;
                } else if(previous[i][j] == 1 && liveNeighbors > 3){        //Checks if cell dies from overpopulation
                    board[i][j] = 0;
                } else if(previous[i][j] == 0 && liveNeighbors == 3){       //Checks if cell revives by reproduction
                    board[i][j] = 1;
                } else{
                    board[i][j] = previous[i][j];                           //If no other rule applies, cell remains as it was
                }
            }
        }

        //For loop copies values from board to previous so board can be further updated
        for(int i = 0; i < previous.length; i++){
            for(int j = 0; j < previous[i].length; j++){
                previous[i][j] = board[i][j];
            }
        }
        System.out.println();
    }

    public int neighbors(int row, int column){
        int neighbors = 0;
        for(int i = row - 1; i <= row + 1; i++){
            for(int j = column - 1; j <= column + 1; j++){
                //If statement prevents out of bounds error by omitting negative indexes and indexes greater than board's length
                if((i < 0) || (i > previous.length - 1) || (j < 0) || (j > previous[i].length - 1)){
                    continue;
                }
                neighbors += previous[i][j];
            }
        }
        neighbors -= previous[row][column];     //subtract own
        return neighbors;
    }

    public void evolution(int n){
        while(n > 0){
            oneStep();
            --n;
        }
    }
}
