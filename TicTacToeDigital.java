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

public class TicTacToeDigital {
    public static void main(String[] args) {
        //Declare the variables
        Scanner in = new Scanner(System.in);
        int optiontoChosePLayer = 0;

        //Title to the game
        println( "\n***************************");
        println("*      Tic-Tac-Toe        *");
        println("***************************");

        //Explain the program to the user
        println("\nThis program provide a fun game that is"); 
        println("created to be enjoyed that is Tic-Tac-Toe,");
        println("where you vs a player or a AI can play");
        println("and win but also lose or draw.");

        //Menu of selections of gamemodes 
        println("\n-------- Menu -------");
        println("1. Vs a local player");
        println("2. Vs an AI machine");
        println("0. Quit");

        //Let the user decide the option
        println("Please choose an option:");
        optiontoChosePLayer = in.nextInt();

        //leave a space
        println("\n");


        switch (optiontoChosePLayer) {

                //Vs a local player
                case 1:

                //Add break
                 break; 

                //Vs an ai machine
                case 2:

                 //Add break
                break;

                case 0:

                println("Have a nice day my friend");
                break;

                //Anything else
                default:
                println("Error, that is not one of the options please try again");

        }

    }

        //This method will show you the scoreboard of the games won and lose of each player
        public static void Scoreboard(int board) {
            //Hugo will be responsible for the scoreboard, implemented through some variable exposistion system that updates with every game 

        }

        //This method will track how the match is going
        public static void Tracking(int track) {
            //Hugo will create this feature that will track the players' records and feeds them into the various other game components that require them, such as the Scoreboard method 

        }

        //This method shows replay of the entire round
         public static void replay(int rep) {
            //By recording the history of the players' movements, Hugo will create a system that reinacts the posistion data per the user's request.

        }

        //This method adds the player's names to know which one is playing
        public static void playerName(int name) {
            //Hugo will make a simple playerName method that allows user's to input their desired screename and compete with it throughout the game  

        }

        //This method is for the AI opponent to go up against
        public static void AI(int machine) {
            //Sam is responsible for this component, and will most likely be implemented through some random move generator of the sorts or similar system

        }
 
        //This method is used to print out the board
         public static void boardTicTacToe(int board) {
            //Co-operation between Max and Sam which establishes the bulk of the games logic. This method is realistically a representative for the main game logic loop, in which a board is printed with posistion updates according to coordinates supplied through arrays. 
        }
        
       //Shortcut to use print
        public static void print(String msg) {
        System.out.print(msg);
        }

        //Shortcut to use println
        public static void println(String msg) {
        System.out.println(msg);
        }

}






