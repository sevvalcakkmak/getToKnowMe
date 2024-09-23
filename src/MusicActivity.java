import java.util.Scanner;

public class MusicActivity extends Days{
    public static final String activityName = "music";
    public MusicActivity(Scanner scanner){
        super(scanner);
    }
    @Override
    public void execute(){
        System.out.println("I have listened music every day this week, do you wanna compare our listening minutes?");
        String response = yesOrNo();
        if ("Yes".equalsIgnoreCase(response)) {
            System.out.println("How many minutes did you listen to music today?");
            System.out.print("> ");
            int minutes = scanner.nextInt();
            scanner.nextLine(); // dummy
            int[] myWeeklyMinutes = {270, 144, 196, 88, 136, 144, 162};
            String[] days = {"Monday" ,"Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            System.out.println("Days that I listened to more songs from you: ");
            for (int i = 0; i<7; i++){
                if (minutes <  myWeeklyMinutes[i]){
                    System.out.println(days[i] + ": " + myWeeklyMinutes [i] + " minutes");
                }
            }
        } else if ("No".equalsIgnoreCase(response)){
            System.out.println("Okay...");
        } else {
            System.out.println("What?");
        }
        System.out.println("Do you wonder about my listening music activity this week?");
        response = yesOrNo();
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
