
/**
 *
 * @author 24scottjp
 */
import java.util.Scanner;
public class Rochambeu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        String P1Inp;
        String P2Inp;
        String Conkey;
        
  
        do
        {
            Scanner in = new Scanner(System.in);
        System.out.println("Please enter Your input Player 1. Remeber to put either R,P,or S");
        P1Inp = in.nextLine();
        
        if (P1Inp.equalsIgnoreCase("R"))
          
                {
                    System.out.println("Player 2 enter your input");
                    P2Inp= in.nextLine();
                    if(P2Inp.equalsIgnoreCase("R")) {
                        System.out.println("Tie. Do you want to play again(y/n)");
              
                    }
                    else if(P2Inp.equalsIgnoreCase("P")) {
                        System.out.println("Player 2 Wins, Paper beats rock. Do you want to play again?(y/n)");
                                            }
               else if(P2Inp.equalsIgnoreCase("S")) {
                        System.out.println("Player 1 Wins, Rock beats Scissors. Do you want to play again?(y/n)");
                       
                    }
               else{
                        System.out.println("You entered trash, Do you want to play again?");
                         
               }
                }
       else if (P1Inp.equalsIgnoreCase("S"))
          
                {
                    System.out.println("Player 2 enter your input");
                    P2Inp= in.nextLine();
                    if(P2Inp.equalsIgnoreCase("S")) {
                        System.out.println("Tie. Do you want to play again(y/n)");
                   
                    }
                    else if(P2Inp.equalsIgnoreCase("P")) {
                        System.out.println("Player 1 Wins, Scissors beats paper. Do you want to play again?(y/n)");
                    
                    }
               else if(P2Inp.equalsIgnoreCase("R")) {
                        System.out.println("Player 2 Wins, Rock beats Scissors. Do you want to play again?(y/n)");
                  
                    }
                    else {
                 System.out.println("You entered trash Do you want to play again?");
                  
             }
                }
             else if (P1Inp.equalsIgnoreCase("P"))
          
                {
                    System.out.println("Player 2 enter your input(y/n)");
                    P2Inp= in.nextLine();
                    if(P2Inp.equalsIgnoreCase("P")) {
                        System.out.println("Tie. Do you want to play again(y/n)");
                  
                    }
                    else if(P2Inp.equalsIgnoreCase("S")) {
                        System.out.println("Player 2 Wins, Scissors beats paper. Do you want to play again?(y/n)");
                      
                    }
               else if(P2Inp.equalsIgnoreCase("R")) {
                        System.out.println("Player 1 Wins, Paper beats Rock. Do you want to play again?(y/n)");
                      
                    }
                    else {
                 System.out.println("You entered trash Do you want to play again?");
           
             }
                }
             else {
                 System.out.println("You entered trash :((( Please go again");
                   System.out.println("Do you want to play again");
           
             }
         
              Conkey = in.nextLine();
    }
    while(Conkey.equalsIgnoreCase("y"));
      
        }
     
    }

