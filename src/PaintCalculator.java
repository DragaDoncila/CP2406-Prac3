import java.util.Scanner;

/**Class calculates total price of painting a room, complete with ceilings. Based on user supplied
 * measurements of room
 * Created by Draga on 15/08/2016.
 */
public class PaintCalculator {
    public static final int SQUARE_FEET_PER_GALLON = 350;
    public static final double PRICE_PER_GALLON = 32.0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter length >>> ");
        double length = input.nextDouble();

        System.out.printf("Enter width >>> ");
        double width = input.nextDouble();

        System.out.printf("Enter height >>> ");
        double height = input.nextDouble();

        double paintPrice = calculatePaintingPrice(length, width, height);
        System.out.println("The paint cost for your " + length + " foot long, " + width + " foot wide room with " +
        height + " foot tall ceilings is $" + paintPrice);

    }

    public static double calculatePaintingPrice(double length, double width, double height){
        double wallArea = (length * height * 2) + (width * height * 2);
        double gallonsNeeded = calculateGallons(wallArea);
        System.out.println("You need " + gallonsNeeded + " gallons of paint for " + wallArea +
        " square foot room");

        double priceOfPaint = gallonsNeeded * PRICE_PER_GALLON;
        return priceOfPaint;
    }

    public static double calculateGallons(double wallArea){
        double gallonsNeeded = wallArea / SQUARE_FEET_PER_GALLON;
        return gallonsNeeded;
    }

}
