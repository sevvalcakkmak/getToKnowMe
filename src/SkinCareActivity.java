import java.util.Scanner;

public class SkinCareActivity extends Days{
    public static final String activityName = "skin care";
    public SkinCareActivity(Scanner scanner){
        super(scanner);
    }
    @Override
    public void execute(){
        System.out.println("I have a basic skin care routine.");
        System.out.println("Which of my routines are you interested in?");
        while (true){
            System.out.println("\t- Morning");
            System.out.println("\t- Night");
            System.out.println("\t- Both");
            System.out.println("\t- 'E' to exit");
            System.out.print("> ");
            String routine = scanner.nextLine();
            activitiesEachDay(routine, activityName);
            if ("E".equalsIgnoreCase(routine)){
                break;
            }
        }
        System.out.println("Are you knowledgeable about skin care?");
        String yesOrNo = yesOrNo();
        if ("Yes".equalsIgnoreCase(yesOrNo)) {
            System.out.println("So you know about my skin care routine, do you think it is good?");
            String goodRoutine = yesOrNo();
            if ("Yes".equalsIgnoreCase(goodRoutine)) {
                System.out.println("Thanks for saying it, I will keep this routine!");
            } else if ("No".equalsIgnoreCase(goodRoutine)) {
                System.out.println("Oh really? What do you suggest?");
                System.out.print("> ");
                String routineSuggest = scanner.nextLine();
                System.out.println("Thanks for sharing your suggestions. I will consider them.");
            } else {
                System.out.println("What?");
            }
        } else if ("No".equalsIgnoreCase(yesOrNo)) {
            System.out.println("I was gonna ask if my routine is good or not but never mind.");
        } else {
            System.out.println("What?");
        }
    }
}
