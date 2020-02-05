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
        this.board = board;
        previous = board;
    }

    public int[][] getBoard() {
        return board;
    }

    public void oneStep(){
        //TODO: Finish method
    }

    public int neighbors(int row, int column){
        //TODO: Finish method
    }

    public void evolution(int n){
        //TODO: Finish method
    }


}
