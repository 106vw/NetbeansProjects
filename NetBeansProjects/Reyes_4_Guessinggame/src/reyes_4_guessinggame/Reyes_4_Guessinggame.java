package reyes_4_guessinggame;

import java.util.Random;
import java.util.Scanner;

public class Reyes_4_Guessinggame {

    static String username; 
    static int uguess;
    static int magicnumber;
    static int moves;
    static Random random;
    static int counter = uguess;
    
    
    static boolean lessthan2(int uguess){
        return (uguess<2);
        
    }
    static boolean greaterthan1(int uguess){
        return (uguess>1);
        
    }
    static boolean greaterthan22(int magicnumber){
    return (magicnumber>22);
}
    
    // the satatic are shared with the entire program 
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        Scanner guess = new Scanner(System.in);
        
        System.out.println("Hello You Wanna play a game ?");
        System.out.println("What is your name?");
        username = name.nextLine();
        
        System.out.println( "HELLO " + username + 
                " please pick a number between 1 and 100 ");
        uguess = guess.nextInt();
        
        if (lessthan2(uguess)){
            System.out.println("You get " + uguess + " guess " + username);
              
        }
        if (greaterthan1(uguess)){
            System.out.println("You get " + uguess + " guesses " + username);
            
        }
        System.out.println("try to guess what number I am thinking about");
        
    while(counter > 0){
        player();
        counter-- ;
    
    }    
        
       
        
        
    }
    @SuppressWarnings("empty-statement")
    static void player(){
        if(magicnumber==22){
           System.out.println("YOU HAVE WON");
        }
       else if (greaterthan22 (magicnumber)){
           System.out.println(" THE NUMBER YOU CHOSE WAS TOO LOW THAN THE NUMBER I WAS THINKING OF. ");
       } else{System.out.println("try to guess what number I am thinking about");}
     
    }
    
    
}
