package fliprace;

import java.util.*;
public class FlipRace {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Coin coinOne = new Coin();
        Coin coinTwo = new Coin();
        int gameCount, oneCount, twoCount;
        boolean playAgain = true, flip = true;
        
        while (playAgain) {
            gameCount = 0;
            oneCount = 0;
            twoCount = 0;
            System.out.println("Welcome to the flip race game!"
                    + "\nTwo coins will be flipped until one of them, or both, get heads three times.");
            
            while (flip) {
                
                coinOne.flip();
                coinTwo.flip();
                gameCount++;
                
                if (coinOne.isHeads()) {
                    oneCount++;
                }
                if (coinTwo.isHeads()) {
                    twoCount++;
                }
                System.out.println("");
                System.out.println("Coin one: " + oneCount);
                System.out.println("Coin two: " + twoCount);
                
                if (oneCount == 3) {
                    System.out.println("Coin one got three heads first!" 
                            + "\nFlip count: " + gameCount);
                    break;
                }
                else if (twoCount == 3) {
                    System.out.println("Coin two got three heads first!" 
                    + "\nFlip count: " + gameCount);
                    break;
                }
                else if (twoCount == 3 && oneCount == 3) {
                    System.out.println("It's a tie!" 
                    + "\nFlip count: " + gameCount);
                    break;
                }
                System.out.println("");
                System.out.println("Would you like to flip again? (y/n)");
                String input = scan.nextLine();
                if (input.equalsIgnoreCase("n")) {
                    flip = false;
                }
                
            }
            System.out.println("");
            System.out.println("Would you like to play again? (y/n)");
            String input = scan.nextLine();
            if (input.equalsIgnoreCase("n")) {
                playAgain = false;
            }
            
        }
        System.out.println("");
        System.out.println("Thank you for playing!");
    }
    
}
