import java.util.Scanner;

public class CatActivity extends Activity {
    public static final String activityName = "cat";
    private final Days days;
    public CatActivity(Scanner scanner){
        super(scanner);
        this.days = new Days(scanner);
    }

    @Override
    public void execute(){

        while (true){
            System.out.println("I have a cat, her name is Piko. Did you like her name?");
            String response = yesOrNo();
            if ("Yes".equalsIgnoreCase(response)) {
                System.out.println("I'm glad you like it.");
                break;
            } else if ("No".equalsIgnoreCase(response)){
                System.out.println("Do you have any name suggestions then?");
                System.out.print("> ");
                response = scanner.nextLine();
                if ("Piko".equalsIgnoreCase(response)) {
                    System.out.println("Oh, you're so creative! Suggesting Piko is truly a stroke of genius.");
                } else {
                    System.out.println("Well, i think Piko is ten times better than " + response + "!");
                }
                break;
            } else {
                System.out.println("What?");
            }
        }
        days.activitiesEachDay("everyday", activityName);
    }
}
