import java.util.Scanner;

public class Days extends Activity{
    private String day;
    private String activity;
    public Days(Scanner scanner) {
        super(scanner);
    }

    @Override
    public void execute() {
    }
    public void activitiesEachDay(String day, String activity){
        this.day = day;
        this.activity = activity;
        switch (activity) {
            case "cat":
                cat(day);
                break;
            case "coffee":
                coffee(day);
                break;
            case "events":
                events(day);
                break;
            case "family":
                family(day);
                break;
            case "food":
                food(day);
                break;
            case "music":
                music(day);
                break;
            case "school":
                school(day);
                break;
            case "skin care":
                skinCare(day);
                break;
            case "sleep":
                sleep(day);
                break;
            case "travel":
                travel(day);
                break;
        }
    }
}
