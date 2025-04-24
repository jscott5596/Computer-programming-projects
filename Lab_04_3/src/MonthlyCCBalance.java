
/**
 *
 * @author 24scottjp
 */
public class MonthlyCCBalance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double principle = 5000;
        double month_1 = (principle * .17) + principle;
        double month_2 = (month_1 * .17) + month_1;
        System.out.println("Your balance was " + principle + " After 1 month you will owe " + month_1 + " After two months you will owe " + month_2);
    }
    
}
