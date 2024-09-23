import java.util.Scanner;

public class SchoolActivity extends Days{
    public static final String activityName = "school";
    public SchoolActivity(Scanner scanner){
        super(scanner);
    }
    @Override
    public void execute(){
        System.out.println("Choose a day to see what courses I took each day.");
        while (true) {
            String chosenDay = chooseDay(); //print days and store choice
            activitiesEachDay(chosenDay, activityName);
            if ("E".equalsIgnoreCase(chosenDay)){
                break;
            }
        }
    }
}
