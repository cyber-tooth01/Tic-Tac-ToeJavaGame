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

public class src {

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
        println( "\n***************************");
        println("*      Tic-Tac-Toe        *");
        println("***************************");

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

                //Option 1: Loca player
                print("\nYou chose to play against a local player");

                //Declare the variables
                

                //

                


                println("SCOREBOARD"); 

            }

            //Vs an ai machine
            if (optiontoChosePLayer==2) {
            
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
        public static boolean checkForWin() {
            return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
        }


        //This method adds the player's names to know which one is playing
        public static void playerName(int name) {

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

            
    
            return false;
        }
    
        public static boolean checkColumnsForWin() {
            
    
            return false;
        }
    
        public static boolean checkDiagonalsForWin() {
            
            return false;
        }
    
        public static void changePlayer() {
    
    
        }

        //This method is used to print out the board
        public static void playGame() {

            //Keyboard reader
            Scanner scanner = new Scanner(System.in);
            int userInput = 0;
    
            //Will run once and loop forever, until user chooses to exit, or some game condition leads to a closing
            do {
    
                //Print the current state of the game
                //printBoard();
    
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

}






