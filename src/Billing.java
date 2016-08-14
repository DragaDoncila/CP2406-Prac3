/**Computes price for billing a customer for the printing of a photobook
 * Created by Draga on 4/08/2016.
 */
public class Billing {
    public static final double TAX_MULTIPLIER = 1.08;

    public static double computeBill(double price){
        double finalPrice = price * TAX_MULTIPLIER;
        return finalPrice;
    }

    public static double computeBill(double price, int qty){
        double finalPrice = price * qty * TAX_MULTIPLIER;
        return finalPrice;
    }

    public static double computeBill(double price, int qty, double couponFraction){
        double finalPrice = price * qty * TAX_MULTIPLIER * (1 - couponFraction);
        return finalPrice;
    }

    public static void main(String[] args) {
        System.out.println("Your total price is: $ " + computeBill(56.00));
        System.out.println("Your total price is: $ " + computeBill(56.00, 3) + " for 3 photobooks.");
        System.out.println("Your total price is: $ " + computeBill(56.00, 3, 0.3) + " for 3 photobooks with 30% discount");
    }

}
