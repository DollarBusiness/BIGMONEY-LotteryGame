/*
*Program: Lottery Game
*This: Lottery.java
*Author: Joel Dollar
*Date: 1/29/2016
*Purpose: This program is a Lottery guessing game 
*/
package lottery;
import java.util.Scanner;

public class Lottery {

    //===========  main ==========================
    public static void main(String[] args) {
        int answer;

            //GENERATES A RANDOM NUMBER WITH 3 DIGITS
        int lottery = 100 + (int)(Math.random() * ((999-100)+1));
        
        //SCANNER
        Scanner input = new Scanner(System.in);
        
        //USER ENTERS THEIR INPUT
        System.out.print("Enter a 3 digit number: ");
        answer = input.nextInt();
        
        //PUT ANSWER IN 3 PARTS
        int guessDigit = answer / 100;
        int guessDigit2 = (answer / 10) % 10;
        int guessDigit3 = answer % 10;
        
        //PUT LOTTERY IN 3 PARTS
        int valueDigit = lottery / 100;
        int valueDigit2 = (lottery / 10) % 10;
        int valueDigit3 = lottery % 10;
        
        
        //ALL DIGITS IN ORDER
        if(answer == lottery)
        {
            System.out.println("YOU WIN $10,000!!");
        }
        
        //DIGITS IN ANY ORDER
        else if((guessDigit == valueDigit || guessDigit == valueDigit2 || guessDigit == valueDigit3)
        && (guessDigit2 == valueDigit2 || guessDigit2 == valueDigit3) && (guessDigit3 == valueDigit3))
        {
            System.out.println("You have guessed 3 digits(out of order) correctly, YOU WIN $3,000!");
        }
        
        //ONE DIGIT IS CORRECT
        else if(guessDigit == valueDigit || guessDigit == valueDigit2 || guessDigit == valueDigit3)
        {
            System.out.println("You got one number correct, YOU WIN $1,000");
        }
        else if(guessDigit2==valueDigit || guessDigit2 == valueDigit2 || guessDigit2 == valueDigit3)
        {
            System.out.println("You got one number correct, YOU WIN $1,000");
        }
        else if(guessDigit3 == valueDigit || guessDigit3 == valueDigit2 || guessDigit3 == valueDigit3)
        {
            System.out.println("You got one number correct, YOU WIN $1,000");
        }
        
        //I WOULD OF USED A LOOP TO AUTOMATICALLY RE-RUN THE PROGRAM IF WE WERE AT LOOPS FOR THIS TYPE OF EXCEPTION
        // BUT FOR NOW THIS JUST LETS THE USER KNOW TO "RUN AGAIN"
        else
        {
           System.out.println("RUN ME AGAIN"); 
        }
        
        //NOW THE USER CAN SEE WHAT THE LOTTERY WAS WITHOUT HAVING NO CLUE
        System.out.println("The Lottery numbers were: " + lottery);
    }
    
}
