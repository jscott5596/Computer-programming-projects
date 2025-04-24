/**
 *
 * @author 24scottjp
 */
import java.util.Scanner;  
public class FuelCost {

   
    public static void main(String[] args) {
      boolean terminal = true;
      double gallons;
      double FuelEfficency;
      double PPG;
      double D100;
      double TankCap;
      
  
        
  
        System.out.println("Please enter the gallons in your gas tank");
        Scanner in = new Scanner(System.in);
        
        do {
            
        if (in.hasNextDouble())
        {
        gallons = in.nextDouble();
         System.out.println("Please enter your fuel efficency (in MPG)");
         do {
             
 
            if (in.hasNextDouble())
            {
            
            FuelEfficency = in.nextDouble();
        System.out.println("Please enter the price of gas per gallon");
        do
                if (in.hasNextDouble())
                {
             
                PPG = in.nextDouble();
                 D100 = (100/FuelEfficency * PPG);
        System.out.println("Your cost for 100 miles is " + D100);
            TankCap = (FuelEfficency * gallons);
            System.out.println("You can go " + TankCap + " miles without refilling");
            }
               else {
            System.out.println("You entered trash :(((, please type in a number");
        }
        while(!terminal);
     
            }    
         
        }
         while(!terminal);
        }
         else 
        {
            System.out.println("You entered trash :(((, please type in a number");
        }

        }
         while(!terminal);
        }
}

  
    
    
    
  
    
 


