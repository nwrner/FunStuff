package Funlabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DealerTextBased {

    public static void main (String args[]) {
        boolean done = false;
        while (!done) {
            Scanner reader = new Scanner(System.in);
            System.out.println("\n===============================================");
            System.out.println("                Blackjack Dealer               ");
            System.out.println("===============================================");
            System.out.println("Because programs are less annoying than people.");
            System.out.println("-----------------------------------------------");
            System.out.println("1. New Game");
            System.out.println("2. Load highscores");
            System.out.println("3. Exit");
            System.out.println("===============================================");
            System.out.print("What would you like to do?: ");
            try {
                int menuChoice = reader.nextInt();
                if (menuChoice == 1) {
                    System.out.println("Loading new game.");
                }

                else if (menuChoice == 2) {
                    try {
                        String myDriver = "org.gjt.mm.mysql.Driver";
                        String myUrl = "jdbc:mysql://localhost/test";
                        Class.forName(myDriver);
                        Connection conn = DriverManager.getConnection(myUrl, "root", "Bu11$23!");
                    } catch (Exception e)
                    {
                        System.err.println("Got an exception! ");
                        System.err.println(e.getMessage());
                    }
                    done = true;
                }

                else if (menuChoice == 3) {
                    System.out.println("Exiting...");
                    System.exit(0);
                } else {
                    System.out.println("\nInvalid menu choice my dude");
                }
            } catch (InputMismatchException x) {
                System.out.println("\nYou can only enter numbers my man");
            }


        }


    }


}
