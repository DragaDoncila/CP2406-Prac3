import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**Class takes user name and calculated dollar credit based on user's GPA
 * Created by Draga on 15/08/2016.
 */
public class BookstoreCredit {
    final static int CONVERSION_RATE = 10;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter name >>> ");
        String userName = input.next();

        System.out.printf("Please enter GPA >>> ");
        double gPA = input.nextDouble();

        calculateCredit(userName, gPA);
    }

    public static void calculateCredit(String userName, double gpa){
        double storeCredit = gpa * CONVERSION_RATE;
        System.out.println("Welcome, " + userName + "!");
        System.out.println("Based on your GPA of " + gpa + ", you have $" + storeCredit
        + " in store credit.");
    }

}
