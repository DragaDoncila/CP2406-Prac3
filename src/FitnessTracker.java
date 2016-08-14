import java.time.LocalDate;
import java.time.Month;

/**Class designed to track fitness activities, time spent doing them and a log of the dates participated. Contains
 * methods for retrieving all values.
 * Created by Draga on 4/08/2016.
 */
public class FitnessTracker {
    private String activity;
    private int minutesSpent;
    private LocalDate dateCompleted;

    public String getActivity(){
        return activity;
    }

    public int getMinutesSpent(){
        return minutesSpent;
    }

    public String getDateCompleted(){
        String displayableDate = dateCompleted.getMonth() + " " + dateCompleted.getDayOfMonth() + " " + dateCompleted.getYear();
        return displayableDate;
    }

    FitnessTracker(){
        activity = "running";
        minutesSpent = 0;
        dateCompleted = LocalDate.of(LocalDate.now().getYear(), 1, 1);
    }

    FitnessTracker(String activity, int minutesSpent, LocalDate dateCompleted){
        this.activity = activity;
        this.minutesSpent = minutesSpent;
        this.dateCompleted = dateCompleted;
    }
}
