/** Class displaying overloaded method use for addressing person at the start of a letter
 * Created by Draga on 4/08/2016.
 */
public class FormLetterWriter {

    public static void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms. " + lastName);
    }

    public static void displaySalutation(String lastName, String firstName){
        System.out.println("Dear " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        displaySalutation("Johnson");
        displaySalutation("Johnson", "Alex");
    }
}
