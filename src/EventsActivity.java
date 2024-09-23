import java.util.Scanner;

public class EventsActivity extends Days{
    public static final String activityName = "events";
    public EventsActivity(Scanner scanner){
        super(scanner);
    }
    @Override
    public void execute(){
        System.out.println("Did you attend any special events last week?");
        String response = yesOrNo();
        if ("Yes".equalsIgnoreCase(response)) {
            System.out.println("Really? What kinda event is this?");
            System.out.print("> ");
            String event = scanner.nextLine();
            System.out.println("Hmm, I would like to join you next time!");
            System.out.println("I went ballet theater last week. It was fascinating. Do you like to watch it too?");
            response = yesOrNo();
            if ("Yes".equalsIgnoreCase(response)) {
                System.out.println("Really? Next time I will tell when there is a new ballet theater.");
            } else if ("No".equalsIgnoreCase(response)){
                System.out.println("Nooo, I think you should give it a chance.");
            }
            else {
                System.out.println("What?");
            }
        } else {
            System.out.println("I went ballet theater last week. It was fascinating. Do you like ballet theaters too??");
            response =yesOrNo();
            if ("Yes".equalsIgnoreCase(response)) {
                System.out.println("Really? Next time I will tell when there is a new ballet theater.");
            } else if ("No".equalsIgnoreCase(response)){
                System.out.println("Nooo, I think you should give it a chance.");
            }
            else {
                System.out.println("What?");
            }
        }
    }
}
