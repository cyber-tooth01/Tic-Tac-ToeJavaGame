//Hugo Cordova, Samuel Ralph, Maximiliano Davila this program is made to play tic-tac-toe against local players

/*

Title 

***************************
*      Tic-Tac-Toe        *
***************************

Concept 

This program provide a fun game that is 
created to be enjoyed that is Tic-Tac-Toe,
where you vs a player or a AI can play
and win but also lose or draw.

Menu 

1. Vs a local player
2. Vs a AI machine
0. Quit

Please choose an option:

 */

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe_JavaJawas {

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


    public static void main(String[] args) {
        //Declare the variables
        Scanner in = new Scanner(System.in);
        int optiontoChosePLayer = 0;
        
        initializeBoard();
        currentPlayerMark = X;
        gameEnded = false;

        //Title to the game
        try {
            Thread.sleep(150); 
            println(" _______       ______           ______ ");
            Thread.sleep(150); 
            println("/_  __(_)___  /_  __/__ _____  /_  __/__  ___  ");
            Thread.sleep(150); 
            println(" / / / / __/   / / / _ `/ __/   / / / _ \\/ -_) ");
            Thread.sleep(150); 
            println("/_/ /_/\\__/   /_/  \\_,_/\\__/   /_/  \\___/\\__/  ");
            Thread.sleep(150); 
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
                                                         

        //Explain the program to the user
        println("\nThis program provide a fun game that is");
        println("created to be enjoyed that is Tic-Tac-Toe,");
        println("where you vs a player or a AI can play");
        println("and win but also lose or draw."); 



        while (true) {
            //Menu of selections of gamemodes 
            println("\n-------- Menu -------");
            println("1. Vs a local player");
            println("2. Vs an AI machine");
            println("3. Quit");

            //Let the user decide the option
            println("Please choose an option:");
            optiontoChosePLayer = in.nextInt();

            //Scoreboard
            int winCount1 = 0;
            int winCount2 = 0; 

            //leave a space
            println("\n");

            //Vs a local player
            if (optiontoChosePLayer==1) {

                //Option 1: Local player
                println("\nYou chose to play against a local player");

                //Player 1 name
                println("\nInput Player 1 name: ");
                String Player1 = in.next();

                //Player 2 name
                println("\nInput Player 2 name: ");
                String Player2 = in.next();

                

            
                                                            
                playGame();
            

                

                


                println("SCOREBOARD"); 

            }

            //Vs an ai machine
            if (optiontoChosePLayer==2) {
            
                //Option 2: AI player
                print("\nYou chose to play against the computer");
                //Player 1 name
                println("Input Player 1 name: ");
                String Player1 = in.nextLine();


                println("SCOREBOARD"); 

            }

            if (optiontoChosePLayer==3) {
             
                println("Have a nice day my friend");
                System.exit(0);

            }
                

            //Anything else
            if (optiontoChosePLayer>3||optiontoChosePLayer<1){
                
                println("Error, that is not one of the options please try again");
            }
            
            }

        }

            //This method will show you the scoreboard of the games won and lose of each player
            // public static void Scoreboard(int board) {
            //     int count1 = 0;
            //     int count2 = 0;
            //     if (player1Win){
            //         count1 + 1; 
            //     }
            //     if (player2Win){
            //         count2 + 1;
            //     }
            // }

        //This method will track how the match is going
        public static boolean checkForWin(String player) {
            return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
        }

        //This method is for the AI opponent to go up against
        public static void AI(int machine) {

        }
        
       //Shortcut to use print
       public static void print(String msg) {
        System.out.print(msg);
        }

        //Shortcut to use println
        public static void println(String msg) {
        System.out.println(msg);
        }

        public static boolean checkRowsForWin() {
            //This method check for the Rows to find out if there is a winner that did a full X or O in the rows that wins the match 

            for (int row =0; row < board.length; row++){
                char firstSymbol = board[row][0];
                boolean rowHasWin = true;

                // Check if all symbols in the row math the first symbol
                for (int col = 1; col < board[row].length; col++){
                    if (board[row][col] != firstSymbol){
                        rowHasWin = false; 
                        break; 
                    }
                }

                if (rowHasWin){
                    return true; 
                }
            }

            return false;
        }
    
        public static boolean checkColumnsForWin() {
            //This method checks for the Columns to find out if there is a winner that did afull X or O in the columns that wins the match
            int numRows = board.length;
            int numCols = board[0].length; 

            //Check each column for a win 
            for (int col = 0; col < numCols; col++) {
                char firstCell = board[0][col];
                boolean isWin = true; 

            //Compare the value of each cell in the column with the first cell 
            for (int row =1; row < numRows; row++){
                if (board[row][col] != firstCell){
                    isWin = false;
                    break;
                }
            }

            if (isWin){
                return true; 
            }
          }
            return false;
        }
    
        public static boolean checkDiagonalsForWin() {
            //This method checks the row to find out if there is a winner that did a full X or O diagonally that wins the match

            int size = board.length;

            //Check the first diagonal
            char mainDiagonalCell = board[0][0];
            boolean mainDiagonalWin = true; 
            for (int i = 1; i < size; i++){
                if (board[i][i] != mainDiagonalCell) {
                    mainDiagonalWin = false; 
                    break; 
                }
            }
        
            //Second diagonal 
            char secondaryDiagonalCell = board[0][size - 1];
            boolean secondaryDiagonalWin = true; 
            for (int i = 1; i < size; i++){
                if (board[i][size - 1 - i] != secondaryDiagonalCell) {
                    secondaryDiagonalWin = false;
                    break; 
                }
            }

            //Return true if either diagonal has a win 
            if (mainDiagonalWin || secondaryDiagonalWin){
                return true; 
            }else{
                return false; //If neither diagonals have a win
            }
        }

        public static boolean boardFull() {
            //This method checks for a tie by seeing if all the spots on the board are occupied without a victory

            int numRows = board.length; 
            int numCols = board[0].length; 

            //This checks if any cell is empty
            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    if (board[row][col] == ' '){
                        return false; 
                    }
                }
            }

            return true; 
        }

       
    
        public static void changePlayer() {
    
    
        }


        public static void printBoard() {

        //   println("\n");

        //   println("----- Here is an empty board :( -----");
        //   println("");
        //   println("/    |     |     \\");
        //   println("|____|_____|_____|");
        //   println("|    |     |     |");
        //   println("|____|_____|_____|");
        //   println("|    |     |     |");
        //   println("|    |     |     |");
        //   println("\\----------------/");

            for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
              System.out.print(board[i][j]);
              if(j < SIZE-1) System.out.print("    |"); 
            }
            System.out.println();
            if(i < SIZE-1)
              println("|____|_____|___|");
           }
          


        }

        //This method is used to print out the board
        public static void playGame() {

            //Keyboard reader
            Scanner in = new Scanner(System.in);
    
            //Will run once and loop forever, until user chooses to exit, or some game condition leads to a closing
            do {
                
    
                //Print the current state of the game
                printBoard();
    
                //Request input from current player
                int [] desiredMove = new int[2];

                println("Input first your desired x axis posistion: ");
                desiredMove[0] = in.nextInt(); 
                println("Input your desired y axis posistion");
                desiredMove[1] = in.nextInt(); 

                //Assign player coordiantes to that's player's mark
                board[desiredMove[0]][desiredMove[1]] = currentPlayerMark; 

                //Check game status (winner? draw?)

                //Check for winner
                if (checkForWin("X") || checkForWin("O")) {
                    gameEnded = true; 
                    break; 
                }

                //Check for draw
                if (boardFull()) {
                    gameEnded = true;
                    break;
                }
    
            //Modify the 'gameEnded' var here.
    
    
            } while (!gameEnded);

             //Shutdown the Java keyboard reader.
        in.close();
    }

}






