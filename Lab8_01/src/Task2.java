import java.util.Scanner;
/**
 *
 * @author 24scottjp
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
       Scanner in = new Scanner(System.in);
       String firstName = "";
       String lastName = "";    
       firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
       lastName = SafeInput.getNonZeroLenString(in, "Enter your last name"); 
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
