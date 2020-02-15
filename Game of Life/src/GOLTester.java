import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GOLTester {

    /*------------------- GameOfLife class test cases -------------------*/

    /*
    * oneStep() method tests
     */
    @Test
    public void oneStepTest1() {

        int[][] A = {{0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}};

        GameOfLife check = new GameOfLife(A);
        check.oneStep();
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void oneStepTest2() {

        int[][] A = {{0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 1, 1, 1, 0,},
                {0, 1, 1, 1, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,}};

        int[][] B = {{0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 1, 0, 0,},
                {0, 1, 0, 0, 1, 0,},
                {0, 1, 0, 0, 1, 0,},
                {0, 0, 1, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,}};

        GameOfLife check = new GameOfLife(B);
        check.oneStep();
        assertArrayEquals(A, check.getBoard());
    }

    @Test
    public void oneStepTest3() {

        int[][] A = {{0, 0, 0, 0, 0, 0,},
                {0, 1, 1, 0, 0, 0,},
                {0, 1, 1, 0, 0, 0,},
                {0, 0, 0, 1, 1, 0,},
                {0, 0, 0, 1, 1, 0,},
                {0, 0, 0, 0, 0, 0,}};

        int[][] B = {{0, 0, 0, 0, 0, 0,},
                {0, 1, 1, 0, 0, 0,},
                {0, 1, 0, 0, 0, 0,},
                {0, 0, 0, 0, 1, 0,},
                {0, 0, 0, 1, 1, 0,},
                {0, 0, 0, 0, 0, 0,}};

        GameOfLife check = new GameOfLife(A);
        check.oneStep();
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void oneStepTest4() {

        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        GameOfLife check = new GameOfLife(A);
        check.oneStep();
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void oneStepTest5() {

        int[][] A = {{1, 1, 0, 0, 0, 0},
                {0, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 0},
                {0, 0, 0, 0, 1, 1}};

        int[][] B = {{1, 1, 1, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1}};

        GameOfLife check = new GameOfLife(A);
        check.oneStep();
        assertArrayEquals(B, check.getBoard());
    }

    /*
     * neighbors() method test
     */

    @Test
    public void neighborsTest1(){

        int[][] A = {{0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 1, 1, 1, 0,},
                {0, 1, 1, 1, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,}};

        GameOfLife check = new GameOfLife(A);
        assertEquals(4, check.neighbors(3,2));
    }

    @Test
    public void neighborsTest2(){
        int[][] A = {{0, 0, 0, 0, 0, 0,},
                {0, 1, 1, 0, 0, 0,},
                {0, 1, 0, 0, 0, 0,},
                {0, 0, 0, 0, 1, 0,},
                {0, 0, 0, 1, 1, 0,},
                {0, 0, 0, 0, 0, 0,}};

        GameOfLife check = new GameOfLife(A);
        assertEquals(2, check.neighbors(1,1));
    }

    @Test
    public void neighborsTest3(){

        int[][] A = {{0, 0, 0, 0, 0, 0,},
                {0, 0, 1, 1, 1, 0,},
                {0, 0, 1, 0, 1, 0,},
                {0, 0, 1, 1, 1, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,}};

        GameOfLife check = new GameOfLife(A);
        assertEquals(8, check.neighbors(2, 3));
    }

    @Test
    public void neighborsTest4(){

        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        GameOfLife check = new GameOfLife(A);
        assertEquals(4, check.neighbors(6,6));

    }

    @Test
    public void neighborsTest5(){

        int[][] A = {{0, 0, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 0, 1, 1, 1,},
                {0, 0, 0, 1, 1, 1,},
                {0, 0, 0, 0, 0, 0,}};

        GameOfLife check = new GameOfLife(A);
        assertEquals(5, check.neighbors(3, 4));
    }

    /*
     * evolution() method test
     */

    @Test
    public void evolutionTest1(){

        int[][] A = {{0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}};

        GameOfLife check = new GameOfLife(A);
        check.evolution(5);
        assertArrayEquals(B, check.getBoard());

    }

    @Test
    public void evolutionTest2(){

        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0,},
                {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0,},
                {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0,},
                {0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0,},
                {0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,}};

        int[][] B = {{0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0,},
                {0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0,},
                {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0,},
                {1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1,},
                {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0,},
                {0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0,},
                {0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0,}};

        GameOfLife check = new GameOfLife(A);
        check.evolution(10);
        assertArrayEquals(B, check.getBoard());

    }

    @Test
    public void evolutionTest3(){

        int[][] A = {{0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0, 0, 0, 0},
                {1, 1, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 0},
                {0, 1, 0, 1, 0, 0, 0, 0},
                {0, 0, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0}};

        GameOfLife check = new GameOfLife(A);
        check.evolution(6);
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void evolutionTest4(){

        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 0, 0, 0, 1, 0},
                {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        GameOfLife check = new GameOfLife(A);
        check.evolution(2);
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void evolutionTest5(){

        int[][] A = {{0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0}};

        GameOfLife check = new GameOfLife(A);
        check.evolution(20);
        assertArrayEquals(B, check.getBoard());
    }

    /*------------------- TorusGameOfLife class test cases -------------------*/

    /*
     * torusOneStep() method tests
     */

    @Test
    public void torusOneStepTest1() {

        int[][] A = {{0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        check.oneStep();
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void torusOneStepTest2() {

        int[][] A = {{1, 1, 1, 0, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 1, 1},
                {0, 0, 0, 1, 1, 1}};

        int[][] B = {{0, 0, 0, 0, 1, 0},
                {1, 0, 1, 0, 0, 0},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 0, 0, 1, 0, 1},
                {0, 1, 0, 0, 0, 0}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        check.oneStep();
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void torusOneStepTest3() {

        int[][] A = {{0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0}};

        int[][] B = {{0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 0, 1, 0}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        check.oneStep();
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void torusOneStepTest4() {

        int[][] A = {{0, 0, 0, 1, 0, 0,},
                {1, 0, 0, 0, 0, 0,},
                {0, 1, 0, 0, 1, 1,},
                {1, 1, 0, 0, 1, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 1, 0, 1,}};

        int[][] B = {{0, 0, 0, 0, 1, 0,},
                {1, 0, 0, 0, 1, 1,},
                {0, 1, 0, 0, 1, 0,},
                {1, 1, 0, 0, 1, 0,},
                {1, 0, 0, 0, 1, 1,},
                {0, 0, 0, 0, 1, 0,}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        check.oneStep();
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void torusOneStepTest5() {

        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        int[][] B = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        check.oneStep();
        assertArrayEquals(B, check.getBoard());
    }

    /*
     * torusNeighbors() method tests
     */

    @Test
    public void torusNeighborsTest1(){

        int[][] A = {{1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        assertEquals(3, check.neighbors(0,0));
    }

    @Test
    public void torusNeighborsTest2(){

        int[][] A = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        assertEquals(4, check.neighbors(3,5));
    }

    @Test
    public void torusNeighborsTest3(){
        int[][] A = {{0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 0, 1, 0, 0},
            {0, 1, 0, 1, 0}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        assertEquals(3, check.neighbors(0, 2));
    }

    @Test
    public void torusNeighborsTest4(){

        int[][] A = {{0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1},
                {1, 0, 1, 0, 1},
                {0, 1, 0, 1, 0}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        assertEquals(4, check.neighbors(3, 0));
    }

    @Test
    public void torusNeighborsTest5(){

        int[][] A = {{0, 0, 1, 1, 0, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 1, 0, 0, 1, 0},
                {0, 0, 1, 1, 0, 0}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        assertEquals(1, check.neighbors(3, 5));
    }

    /*
     * torusEvolution() method tests
     */

    @Test
    public void torusEvolutionTest1(){

        int[][] A = {{0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 1, 1, 1, 0,},
                {0, 1, 1, 1, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,}};

        int[][] B = {{0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 1, 0, 0,},
                {0, 1, 0, 0, 1, 0,},
                {0, 1, 0, 0, 1, 0,},
                {0, 0, 1, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        check.evolution(5);
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void torusEvolutionTest2(){

        int[][] A = {{1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1}};

        int[][] B = {{1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        check.evolution(3);
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void torusEvolutionTest3(){
        int[][] A = {{1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0}};

        int[][] B = {{1, 1, 0, 1, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 0, 1, 1},
                {1, 1, 0, 1, 1}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        check.evolution(3);
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void torusEvolutionTest4(){

        int[][] A = {{0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0}};

        int[][] B = {{0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0}};

        TorusGameOfLife check = new TorusGameOfLife(A);
        check.evolution(7);
        assertArrayEquals(B, check.getBoard());
    }

    @Test
    public void torusEvolutionTest5(){

        int[][] A = {{0, 0, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 0, 1, 1, 1,},
                {0, 0, 0, 1, 1, 1,},
                {0, 0, 0, 0, 0, 0,}};

        int[][] B = {{0, 0, 0, 0, 0, 0,},
                {1, 1, 1, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 1, 1, 1,},
                {0, 0, 0, 0, 0, 0,}};


        TorusGameOfLife check = new TorusGameOfLife(A);
        check.evolution(11);
        assertArrayEquals(B, check.getBoard());
    }
}
