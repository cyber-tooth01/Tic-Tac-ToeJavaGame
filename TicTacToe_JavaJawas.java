//Hugo Cordova, Samuel Ralph, Maximiliano Davila this program is made to play tic-tac-toe against local players
//Sam asssited in Scoreboard, printBoard, wrote both playGame and playGameAI, in addition to generally making sure all code went together
//Hugo wrote Scoreboard, Replay Functionality, and PlayerNames
//Max wrote win conditions, formats of gameboard, assited in general coding

/*

Title 

***************************
*      Tic-Tac-Toe        *
***************************

Concept 

This program provide a fun game that is 
created to be enjoyed that is Tic-Tac-Toe,
where you vs a player or a AI can play
and win but also lose or draw

 */

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class TicTacToe_JavaJawas {

    //Requirements that help run the program 
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[34m";
    public static final String reset = "\u001B[0m";
    public static int x = 0;
    public static int y = 0; 
    public static final char EMPTY = ' ';
    public static final char X = 'X';
    public static final char O = 'O';
    public static final int SIZE = 3;
    public static char[][] board = new char[SIZE][SIZE];
    public static char currentPlayerMark;
    public static boolean gameEnded;

    public static int scoreX = 0;
    public static int scoreO = 0; 

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
        println("\nDeveloped by Samuel Ralph, Maximiliano Dávila, and Hugo Cordova");
        println("\nAlso known as the JavaJawas"); 
        println("\nThis program provide a fun game that is");
        println("created to be enjoyed that is Tic-Tac-Toe,");
        println("where you vs a player or a AI can play");
        println("and win but also lose or draw.");

        

        while (true) {
            //Reset core game values 
            initializeBoard();
            currentPlayerMark = X;
            gameEnded = false;

            //Menu of selections of gamemodes 
            println("\n-------- Menu -------");
            println("1. Versus a local player");
            println("2. Versus an AI machine");
            println("3. Quit");

            //Let the user decide the option
            println("Please choose an option:");
            optiontoChosePLayer = in.nextInt();


            //Vs a local player
            if (optiontoChosePLayer == 1) {

                //Option 1: Local player
                println("\nYou chose to play against a local player");
                println("\nThe board in this game is on two axises, one x and one y.\nVertically, it goes from 0 to 2, and horizontally it goes 0 to 2.");

                //Clear char array
                initializeBoard();

                //Use non-AI game loop
                playGame();


                println(" "); 

                //Print out scoreboard
                println("Wins for 'O' player: " + scoreO);
                println("Wins for 'X' player: " + scoreX);
                  

            }

            //Vs an ai machine
            if (optiontoChosePLayer == 2) {

                //Option 2: AI player
                print("\nYou chose to play against the computer");
                println("\nThe board in this game is on two axises, one x and one y.\nVertically, it goes from 0 to 2, and horizontally it goes 0 to 2.");
                
                //Clear char array
                initializeBoard();

                //Use AI version of game loop
                playGameAI();


                println(" "); 

                //Print scoreboard
                println("Wins for 'O' player: " + scoreO);
                println("Wins for 'X' player: " + scoreX);
                  

            }

            if (optiontoChosePLayer == 3) {
                println("Have a nice day my friend");
                break;
            }
         }
      } 
      
    
        public static void Scoreboard (char playerMark){
            //Take in given playerMark at game end
            //Add value to array based on user's character (Sam)
            if (playerMark == 'X') {
                scoreX++;
            } else {
                scoreO++; 
            }
        }

        //Check for winner in rows when player completas a stack of them in a row (Maximiliano Davila)
        public static boolean checkRowsForWin () {
            //This method check for the Rows to find out if there is a winner that did a full X or O in the rows that wins the match
            for (int row = 0; row < board.length; row++) {
                char firstSymbol = board[row][0];
                boolean rowHasWin = true; 
        
                for (int col = 1; col < board[row].length; col++) {
                    if (board[row][col] != firstSymbol || board[row][col] == EMPTY) {
                        rowHasWin = false; 
                        break;
                    }
                }
        
                if (rowHasWin) {
                    return true; 
                }
            }
            return false; 
        }

        //Check for wins for columns when a player completes a stack of them in a column (Maximiliano Daliva)
        public static boolean checkColumnsForWin () {
            //This method checks for the Columns to find out if there is a winner that did a full X or O in the columns that wins the match
            for (int col = 0; col < board[0].length; col++) {
                char firstSymbol = board[0][col];
                boolean colHasWin = true; 
        
                //After iterating through the base value of the board, loop through char array, looking to see if the previously identified value line up in a column 
                for (int row = 1; row < board.length; row++) {
                    if (board[row][col] != firstSymbol || board[row][col] == EMPTY) {
                        colHasWin = false; 
                        break;
                    }
                }
        
                if (colHasWin) {
                    return true; 
                }
            }
            return false; 
        }

        //Check for wins in diagonal when a player completes a stack of their symbols (Maximiliano Davila)
        public static boolean checkDiagonalsForWin () {
            // This method checks the row to find out if there is a winner that did a full X or O diagonally that wins the match
            int size = board.length;

            // Check the first diagonal
            char mainDiagonalCell = board[0][0];
            boolean mainDiagonalWin = true;
            for (int i = 1; i < size; i++) {
                if (board[i][i] != mainDiagonalCell || mainDiagonalCell == ' ') {
                    mainDiagonalWin = false;
                    break;
                }
            }

            // Second diagonal
            char secondaryDiagonalCell = board[0][size - 1];
            boolean secondaryDiagonalWin = true;
            if (secondaryDiagonalCell != ' ') { 
                for (int i = 1; i < size; i++) {
                    if (board[i][size - 1 - i] != secondaryDiagonalCell) {
                        secondaryDiagonalWin = false;
                        break;
                    }
                }
            } else {
                secondaryDiagonalWin = false; 
            }

            // Return true if either diagonal has a win
            return mainDiagonalWin || secondaryDiagonalWin;

        }

        public static boolean boardFull () {
            //This method checks for a tie by seeing if all the spots on the board are occupied without a victory
            int numRows = board.length;
            int numCols = board[0].length;

            //This checks if any cell is empty
            for (int row = 0; row < numRows; row++) {
                for (int col = 0; col < numCols; col++) {
                    if (board[row][col] == ' ') {
                        return false;
                    }
                }
            }

            return true;
        }

        //This method will track how the match is going
        public static boolean checkForWin () {
            if (checkRowsForWin()){
                gameEnded = true; 
                return true; 
            } else if (checkColumnsForWin()){
                gameEnded = true; 
                return true; 
            } else if (checkDiagonalsForWin()){
                gameEnded = true; 
                return true;
            } else if (boardFull()) {
                gameEnded = true; 
            }
            return false; 
        }

        public static void printBoard () {
            //This method takes in the initialized array and prints it

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (board[i][j] == 'X') {
                    System.out.print(RED + board[i][j] + reset);
                    }   else if (board[i][j] == 'O') {
                        System.out.print(BLUE + board[i][j] + reset);
                    } else {
                        System.out.print(board[i][j]);
                    }
                    if (j < SIZE - 1) System.out.print("     ");
                }
                System.out.println();
                if (i < SIZE - 1)
                    println("____|_____|____");
                if (i == SIZE - 1){
                    println("    |     |    ");
                }    
            }

            }

            // public static void printBoard () {
            //     //This method takes in the initialized array and prints it
    
            //     for (int i = 0; i < SIZE; i++) {
            //         for (int j = 0; j < SIZE; j++) {
            //             System.out.print(board[i][j]);
            //             if (j < SIZE - 1) System.out.print("    |");
            //         }
            //         System.out.println();
            //         if (i < SIZE - 1)
            //             println("|____|_____|___|");
            //     }
    
            //     }
    

        //Non-AI game loop (Sam)
        public static void playGame (){
            //Keyboard reader
            Scanner in = new Scanner(System.in);

            //Prompt for player names
            //Player 1 name
            println("\nInput Player 1 name: ");
            String Player1 = in.next();

            //Player 2 name
            println("\nInput Player 2 name: ");
            String Player2 = in.next();

            //Will run once and loop forever, until user chooses to exit, or some game condition leads to a closing
            do {
                //Print the current state of the game
                println(" ");
                printBoard();
                println(" ");

                //Confirm player identity 
                if (currentPlayerMark == X){
                    println("It's " + Player1 + "'s turn ");
                }else{
                    println("It's " + Player2 + "'s turn");
                }

                //Request input from current player
                while (true) {
        
                    boolean validMove = false;
        
                    while (!validMove) {
                        try {
                            println("Input your desired y axis position: ");
                            x = in.nextInt();
                            println("Input your desired x axis position: ");
                            y = in.nextInt();
        
                            if (isValidMove(x, y)) {
                                validMove = true;
                            } else {
                                println("Invalid move, try again");
                            }
                        } catch (Exception e) {
                            println("Invalid input, try again");
                            in.nextLine(); // Clear the input buffer
                        }
                    }
        
                    board[x][y] = currentPlayerMark;
                    break;
                    
                }
                //Check for winner (This program is made by Maximiliano Davila)
                //gameEnded is modified here 
                if (checkRowsForWin()){
                    gameEnded = true;
                    printBoard();
                //Confirm player identity 
                if (currentPlayerMark == X){
                    println("Congragulations " + Player1 + "! You won!");
                }else{
                    println("Congragulations " + Player2 + "! You won!");
                }

                Scoreboard(currentPlayerMark); 

                } else if (checkColumnsForWin()){
                    gameEnded = true; 
                    printBoard();
                //Confirm player identity 
                if (currentPlayerMark == X){
                    println("Congragulations " + Player1 + "! You won!");
                }else{
                    println("Congragulations " + Player2 + "! You won!");
                }

                Scoreboard(currentPlayerMark);

                } else if (checkDiagonalsForWin()){
                    gameEnded = true; 
                    printBoard();

                //Confirm player identity 
                if (currentPlayerMark == X){
                    println("Congragulations " + Player1 + "! You won!");
                }else{
                    println("Congragulations " + Player2 + "! You won!");
                }   
                
                Scoreboard(currentPlayerMark);

                } else if (boardFull()) {
                    gameEnded = true; 
                    printBoard();
                    println("Game tied.");
                }
                

                if (currentPlayerMark == X){
                    currentPlayerMark = O;
                }else{
                    currentPlayerMark = X; 
                }

                
            } while (!gameEnded); 
        }

        //AI version of main game loop
        public static void playGameAI (){
            //Keyboard reader
            Scanner in = new Scanner(System.in);

            //Prompt for player names
            //Player 1 name
            println("\nInput Player 1 name: ");
            String Player1 = in.next();

            //Will run once and loop forever, until user chooses to exit, or some game condition leads to a closing
            do {
                //Print the current state of the game
                println(" ");
                printBoard();
                println(" ");
            
                //Request input from current player
                while(true) {

                // Get random coordinate if AI's turn
                boolean aiTurnDone = false; 
                int x, y;

                //Allow for AI logic when not true
                while(!aiTurnDone){
                Random random = new Random();

                if(currentPlayerMark == O) {
                x = random.nextInt(3);
                y = random.nextInt(3);
                

                while(!isValidMove(x,y)) {
                    x = random.nextInt(3);
                    y = random.nextInt(3); 
                    }

                    //Assign values to char array, print out current game state, and end AI turn
                    board[x][y] = currentPlayerMark; 
                    printBoard();
                    aiTurnDone = true; 
                }
            
                else {
                    //Prompt for human input
                    int[] desiredMove = new int[2];
                    
                    try { 
                        println("Input first your desired x axis position: ");
                        desiredMove[0] = in.nextInt();
                        println("Input your desired y axis position");
                        desiredMove[1] = in.nextInt();
                    }catch (ArrayIndexOutOfBoundsException e) {
                        println("Invalid move, try again");
                        println("\nInput first your desired x axis position: ");
                        desiredMove[0] = in.nextInt();
                        println("Input your desired y axis position");
                        desiredMove[1] = in.nextInt();
                    } ;
                    
                    if(isValidMove(desiredMove[0], desiredMove[1])) {

                        board[desiredMove[0]][desiredMove[1]] = currentPlayerMark; 
                        break; 

                    }
                    
                    println("Invalid move, try again");
                  }

                }

                if (checkRowsForWin()){
                    gameEnded = true;
                    printBoard();
                //Confirm player identity 
                if (currentPlayerMark == X){
                    println("Congragulations " + Player1 + "! You won!");
                }

                Scoreboard(currentPlayerMark); 
                break; 

                } else if (checkColumnsForWin()){
                    gameEnded = true; 
                    printBoard();
                //Confirm player identity 
                if (currentPlayerMark == X){
                    println("Congragulations " + Player1 + "! You won!");
                }

                Scoreboard(currentPlayerMark);
                break; 

                } else if (checkDiagonalsForWin()){
                    gameEnded = true; 
                    printBoard();

                //Confirm player identity 
                if (currentPlayerMark == X){
                    println("Congragulations " + Player1 + "! You won!");
                }
                
                Scoreboard(currentPlayerMark);
                break;

                } else if (boardFull()) {
                    gameEnded = true; 
                    printBoard();
                    println("Game tied.");
                    break;
                }
                
                //Change players, X being human and O being computer
                if (currentPlayerMark == X){
                    currentPlayerMark = O;
                }else{
                    currentPlayerMark = X; 
                }

                
            } 
        } while (!gameEnded); 
    }

        //Shortcut to use print
        public static void print (String msg){
            System.out.print(msg);
        }

        //Shortcut to use println
        public static void println (String msg){
            System.out.println(msg);
        }

        
        
        public static boolean isValidMove(int row, int col) {
            // Check if the specified cell is already occupied
            if (board[row][col] != ' ') {
                return false;
            }
            // Check if the row and column values are within the valid range (0 to 2)
            else if (row < 0 || row > 2 || col < 0 || col > 2) {
                return false;
            }
        
            return true;
        }

    }


