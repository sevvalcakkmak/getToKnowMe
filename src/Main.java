import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("- Choose an activity to get to know me?");
            System.out.println("\t- Food");
            System.out.println("\t- Music");
            System.out.println("\t- Coffee");
            System.out.println("\t- Skin Care");
            System.out.println("\t- Sleep");
            System.out.println("\t- Cat");
            System.out.println("\t- Travel");
            System.out.println("\t- School");
            System.out.println("\t- Family");
            System.out.println("\t- Events");
            System.out.println("\t- Other");
            System.out.println("\t- 'E' to exit");
            System.out.print("> ");
            String activity = scanner.nextLine();

            Executable chosenActivity;
            switch (activity.toLowerCase()) {
                case "food" -> chosenActivity = new FoodActivity(scanner);
                case "music" -> chosenActivity = new MusicActivity(scanner);
                case "coffee" -> chosenActivity = new CoffeeActivity(scanner);
                case "skin care" -> chosenActivity = new SkinCareActivity(scanner);
                case "sleep" -> chosenActivity = new SleepActivity(scanner);
                case "cat" -> chosenActivity = new CatActivity(scanner);
                case "travel" -> chosenActivity = new TravelActivity(scanner);
                case "school" -> chosenActivity = new SchoolActivity(scanner);
                case "family" -> chosenActivity = new FamilyActivity(scanner);
                case "events" -> chosenActivity = new EventsActivity(scanner);
                case "other" -> {
                    System.out.println("Tell me about your activity:");
                    System.out.print("> ");
                    String otherActivityDescription = scanner.nextLine();
                    chosenActivity = () -> System.out.println("Good, we can talk more about that later.");
                }
                case "e" -> chosenActivity = new ExitActivity(scanner);
                default -> {
                    System.out.println("Invalid activity. Please choose a valid activity.");
                    continue;
                }
            }
            chosenActivity.execute();
            if ("E".equalsIgnoreCase(activity)){
                break;
            }
        }
    }
}


