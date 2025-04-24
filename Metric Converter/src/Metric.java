

import java.util.Scanner;
/**
 *
 * @author 24scottjp
 */
public class Metric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

double MetInput;
double feet;
double miles;
double inches;
boolean Terminator = true;


      Scanner in = new Scanner(System.in);
        System.out.println("Please type in a length in meters");
        
        
        if (in.hasNextDouble())
        {
            MetInput = in.nextDouble();
            do
            {
              feet = MetInput * 3.28084;
 miles = MetInput/0.00062137;
 inches = MetInput * 39.26;
                System.out.println(" You entered " + MetInput + " Meters");
                System.out.println("That would be " + feet + " feet");
                System.out.println(" That would be " + miles + " miles");
                System.out.println("That would be " + inches + " inches");

            }
            while(!Terminator);
        }
        else 
        {
            System.out.println("You entered trash :((");
}
    }
}