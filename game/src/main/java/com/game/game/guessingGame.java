package com.game.game;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class guessingGame {


    private int rightGuess;
    private TreeSet<Integer> lifes= new TreeSet<Integer>();
    private int leftGuess;
    private boolean game=false;
    private String name;

    public guessingGame(String name){
        this.name = name;
        this.rightGuess = 1 + (int)(100 * Math.random());
        this.leftGuess = 5;
    }




    public String entergame(){
        return "Welcome to the game";
    }

    public  String gameStart(int n)
    {
        this.lifes.add(n);
            if (n!=this.rightGuess){
                if(leftGuess!=0){
                    leftGuess -=1;
                }
               
                return "Wrong !. You have "+ leftGuess + "guesses left";
            }

                
                else{
                    this.game=true;
                    return "YOU WON!";
                    

                }

            }
        

            public String getHelp(){
                String guesshelp="";
                if (this.lifes.size()==0){
                    return "enter a number";
                }
                if(Collections.max(this.lifes)>this.rightGuess){
                    guesshelp +="your number is higher";
                    for (Integer num:lifes) {
                    if (num>this.rightGuess){
                        guesshelp = Integer.toString(num);
                    }
            }
            guesshelp+="\n";

        }
        if(Collections.min(this.lifes)<this.rightGuess){
            guesshelp+="Lower than target:";
            for (Integer num:lifes){
                if (num<this.rightGuess){
                    guesshelp+="\n"+Integer.toString(num);
                }
            }
            
        }
return guesshelp;

    }
        
    public String getInfo() {
        String info = this.name;
        if(game){
            info+= "you won";

        }
        else{
            info+= "you lost";
        }
        return info;
    }
}
        
        
