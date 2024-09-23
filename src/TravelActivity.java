import java.util.Scanner;

public class TravelActivity extends Days{

    public static final String activityName = "travel";
    public TravelActivity(Scanner scanner){
        super(scanner);
    }
    @Override
    public void execute(){
        activitiesEachDay("everyday", activityName);
    }
}
