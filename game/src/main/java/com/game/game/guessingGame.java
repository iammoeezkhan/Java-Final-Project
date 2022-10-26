package com.game.game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class guessingGame {

    private int rightGuess;
    private TreeSet<Integer> lifes = new TreeSet<Integer>();
    private int leftGuess;
    private boolean game = false;
    private String name;
    private Integer lose = 0;
    

    

    public guessingGame(String name) {
        this.name = name;
        this.rightGuess = 1 + (int) (100 * Math.random());
        this.leftGuess = 5;
    }

 

            


    

    public String entergame() {
        return "Welcome to the game";
    }

    public String gameStart(int n) {
        String greater = "Your number is higher";
        String smaller = "Your number is lower";
        this.lifes.add(n);
        if (n != this.rightGuess) {
            if (leftGuess != 0) {
                leftGuess -= 1;
            }

            if (leftGuess == 0 & !this.game) {

                this.lose = -1;
                return "You LOST, Good Luck  Next Time";
            }
            if (rightGuess < n & !this.game) {
                this.lose = 0;
                return "Wrong !. You have " + leftGuess + "guesses left\n" + greater;

            }
            if (rightGuess > n & !this.game) {
                this.lose = 0;
                return "Wrong !. You have " + leftGuess + "guesses left\n " + smaller;

            }
            this.lose = -1;

            return "The game ended. to restart again go to GET REQUEST";
        }

        else {
            this.game = true;
            this.lose = 1;
            return "YOU WON!";
            

        }

    }


    

    public String getInfo() {
        String info = this.name;

        if (this.lose == 1) {
            info += " \nYou Won";

        } 
        if (this.lose == 0) {

            return "You havent played the game yet";
        }
        if (this.lose == -1) {
            info += " \nYou Lost " ;
        }
        else {
            
        }
        return info;
    }
}
