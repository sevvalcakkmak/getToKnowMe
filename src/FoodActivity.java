import java.util.Scanner;

public class FoodActivity extends Days{
    public static final String activityName = "food";

    public FoodActivity (Scanner scanner){
        super(scanner);
    }
    @Override
    public void execute(){
        System.out.println("Do you wonder what I eat this week?");
        String response = yesOrNo();
        if ("Yes".equalsIgnoreCase(response)){
            System.out.println("Choose the day then.");
            while ("Yes".equalsIgnoreCase(response)) {
                String chosenDay = chooseDay(); //print days and store choice
                activitiesEachDay(chosenDay, activityName);
                if ("E".equalsIgnoreCase(chosenDay)){
                    break;
                }
            }
        } else if ("No".equalsIgnoreCase(response)){
            System.out.println("Okay...");
        } else {
            System.out.println("What?");
        }
    }
}
