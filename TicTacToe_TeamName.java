/*  CSI TIC-TAC-TOE 2024
* Below you will find a template for creating your Tic-Tac-Toe game.
*
* TO-DO comments:
* Notice the "TO-DO" (without the '-') code comments, so that you may keep track of the code that is left to
* be written. To see the list of TO-DO comments, go to View -> Tool Windows -> TO-DO.
* Make sure to remove the TO-DO (without the '-') word when the code implementation in
* that section of code has been completed
*
* The Debugger is a powerful tool for troubleshooting your code, especially for logical errors. Use it while you can!
*
* Make sure to personalize this Tic-Tac-Toe game app.
*
* Happy coding!!!
*
* Template provided by prof. Reynaldo Belfort, S.J.
* */


//TODO << YOUR TEAM NAME HERE >>
    //TODO << YOUR TEAM MEMBERS HERE >>

import java.util.Scanner;

public class TicTacToe_TeamName {

    /*
        Programmer's note: <> The following are "Global" variables. That is, these are the variables accessible
                               to all method within this class. You may add global variables of your own.

                            <> 'final' keyword means that the variable is a constant.
                                That is, once the variable is declared, the value cannot change
                                during runtime.
                            <>  You may modify or discard some of the variables, if you don't need them.


   * */
    public static final char EMPTY = ' ';
    public static final char X = 'X';
    public static final char O = 'O';
    public static final int SIZE = 3;
    public static char[][] board = new char[SIZE][SIZE];
    public static char currentPlayerMark;
    public static boolean gameEnded;

    public static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    public static void printBoard() {

        //TODO: YOUR CODE HERE

        println("\n");

        println("----- Here is an empty board :( -----");
        println("");
        println("/    |     |     \\");
        println("|____|_____|_____|");
        println("|    |     |     |");
        println("|____|_____|_____|");
        println("|    |     |     |");
        println("|    |     |     |");
        println("\\----------------/");
    }

    public static boolean isBoardFull() {

        //TODO: YOUR CODE HERE
        return false;

    }

    public static boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    //Function: returns ' true'  if << TODO: YOUR DECISION HERE >>
    public static boolean checkRowsForWin() {

        //TODO: YOUR CODE HERE

        return false;
    }

    public static boolean checkColumnsForWin() {
        //TODO: YOUR CODE HERE

        return false;
    }

    public static boolean checkDiagonalsForWin() {
        //TODO: YOUR CODE HERE
        return false;
    }

    public static void changePlayer() {

        //TODO: YOUR CODE HERE

    }

    public static boolean placeMarkOnBoard(int row, int col) {
        //TODO YOUR CODE HERE
        //Note: This code could read from the global variable 'currentPlayerMark',
        //or value of 'currentPlayerMark' could be passed as a method parameter/argument.
        //It is the programmer's choice.

        return false;
    }


    public static void playGame() {

        //Keyboard reader
        Scanner scanner = new Scanner(System.in);
        int userInput = 0;

        //Will run once and loop forever, until user chooses to exit, or some game condition leads to a closing
        do {

            //Print the current state of the game
            printBoard();

            //Request input from current player

            //TODO YOUR CODE HERE
            print("\nInput: ");
            userInput = scanner.nextInt();

            //Check game status (winner? draw?)

                //TODO YOUR CODE HERE. Modify the 'gameEnded' var here.


        } while (!gameEnded);

        //Shutdown the Java keyboard reader.
        scanner.close();
    }

    public static void print(String msg){
        System.out.print(msg);
    }

    public static void println(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        //Initial set up
        initializeBoard();
        currentPlayerMark = X;
        gameEnded = false;

        //TODO any code work before game begins. You may want to print some sort of welcome message

        println("");
        println("   >> Let's Play Tic-Tac-Toe! <<");

        //Start game
        playGame();
    }
}