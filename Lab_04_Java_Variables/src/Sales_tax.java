

/**
 *
 * @author 24scottjp
 */
public class Sales_tax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    int subtotal = 100;
    double SalesTax = 0.05 * subtotal;
    double FinalTotal = (subtotal + SalesTax);
    System.out.println("Your final from a subtotal of " + subtotal + " is " + FinalTotal);
        
        
        
        
    }
    
}
