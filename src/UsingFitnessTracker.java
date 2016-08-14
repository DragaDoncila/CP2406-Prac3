import java.time.LocalDate;
import java.util.Scanner;

/**Class displaying capability of FitnessTracker with examples for each method.
 * Created by Draga on 4/08/2016.
 */
public class UsingFitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the day of the month>>> ");
        int dayOfMonth = input.nextInt();

        System.out.printf("Enter the month number>>> ");
        int monthNumber = input.nextInt();

        System.out.printf("Enter the year>>> ");
        int year = input.nextInt();
        LocalDate exerciseDate = LocalDate.of(year, monthNumber, dayOfMonth);

        System.out.printf("What activity did you complete? >>> ");
        String activity = input.next();

        System.out.printf("How long did you spend on this activity? >>> ");
        int minutesSpent = input.nextInt();

        FitnessTracker myExercise = new FitnessTracker(activity, minutesSpent, exerciseDate);
        System.out.println("You completed " + myExercise.getMinutesSpent() + " minutes of " + myExercise.getActivity() +
         " today, " + myExercise.getDateCompleted());
    }
}
