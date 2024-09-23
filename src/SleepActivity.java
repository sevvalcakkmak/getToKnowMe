import java.util.Scanner;

public class SleepActivity extends Days{
    public static final String activityName = "sleep";
    public SleepActivity(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {

        System.out.println("Well, you don't wanna know about my sleep schedule. It is the worst.");
        System.out.println("How many hours do you sleep per day on average?");
        System.out.print("> ");
        int hour = scanner.nextInt();
        scanner.nextLine(); // dummy
        if (hour < 6) {
            System.out.println("Is this even healthy? I think you should sleep more.");
        } else if (hour <= 8) {
            System.out.println("Balanced sleep!");
        } else {
            System.out.println("Wow, you're getting plenty of sleep!");
        }

        while (true){
            System.out.println("Do you wonder my sleeping schedule?");
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
                break;
            } else if ("No".equalsIgnoreCase(response)){
                System.out.println("Okay...");
                break;
            } else {
                System.out.println("What?");
            }
        }
    }
}
