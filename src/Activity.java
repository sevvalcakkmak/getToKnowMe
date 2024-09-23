import java.util.Scanner;

abstract class Activity implements Executable{
    protected Scanner scanner;
    public Activity(Scanner scanner){
        this.scanner = scanner;
    }

    public String yesOrNo() {
        System.out.println("\t- Yes");
        System.out.println("\t- No");
        System.out.print("> ");
        return scanner.nextLine();
    }
    public String chooseDay() {
        System.out.println("\t- Monday");
        System.out.println("\t- Tuesday");
        System.out.println("\t- Wednesday");
        System.out.println("\t- Thursday");
        System.out.println("\t- Friday");
        System.out.println("\t- Saturday");
        System.out.println("\t- Sunday");
        System.out.println("\t- 'E' to exit");
        System.out.print("> ");
        return  scanner.nextLine();
    }

    public void cat(String day){
        System.out.println("I feed my cat and spend time with her every day.");
    }
    public void coffee(String day){
        System.out.println("I am in love with coffee. I drank coffee every day this week.");
    }
    public void events(String day){
        System.out.println("I took guitar lesson this wednesday");
        System.out.println("I went ballet theater this thursday");
    }

    public void family(String day){
        System.out.println("I spend time with my family every day.");
    }
    public void food(String day){
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("I didn't have breakfast.\nI ate cheesecake. Also I ate different appetizers and foods for lunch in the Hacettepe Çatı.\nI didn't have dinner");
                break;
            case "tuesday":
                System.out.println("I didn't have breakfast.\nI ate soup, pasta and meatball for lunch in the school cafeteria.\nI ate potatoes and fried peppers for dinner at home.");
                break;
            case "wednesday":
                System.out.println("I didn't have breakfast.\nI ate mac and cheese for lunch.\nI ate soup and kidney bean for dinner at home.");
                break;
            case "thursday":
                System.out.println("I didn't have breakfast.\nI ate creamy pasta and cheesecake for lunch.\nI ate chicken and rice for dinner at home.");
                break;
            case "friday":
                System.out.println("I ate eggs for breakfast.\nI ate marshmallow as a desert but didn't have lunch.\nI went to Aspava and ate beyti for dinner.");
                break;
            case "saturday":
                System.out.println("I ate fried potatoes for breakfast.\nI didn't have lunch.\nI ate chicken and rice for dinner at home.");
                break;
            case "sunday":
                System.out.println("I didn't have breakfast because I was sleeping.\nI didn't have lunch but I drank ayran.\nI prepare and eat pasta for dinner at home.");
                break;
            case "e":
                break;
            default:
                System.out.println("Invalid day chosen.");
        }
    }
    public void music(String day){
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("I have listened to 64 different songs and 1 podcast.");
                System.out.println("My total song listening time: 270 minutes.");
                break;
            case "tuesday":
                System.out.println("I have listened to 33 different songs.");
                System.out.println("My total song listening time: 144 minutes.");
                break;
            case "wednesday":
                System.out.println("I have listened to 22 different songs.");
                System.out.println("My total song listening time: 196 minutes.");
                break;
            case "thursday":
                System.out.println("I have listened to 27 different songs.");
                System.out.println("My total song listening time: 88 minutes.");
                break;
            case "friday":
                System.out.println("I have listened to 46 different songs.");
                System.out.println("My total song listening time: 136 minutes.");
                break;
            case "saturday":
                System.out.println("I have listened to 36 different songs and 1 podcast.");
                System.out.println("My total song listening time: 144 minutes.");
                break;
            case "sunday":
                System.out.println("I have listened to 64 different songs and 1 podcat.");
                System.out.println("My total song listening time: 162 minutes.");
                break;
            case "e":
                break;
            default:
                System.out.println("Invalid day chosen.");
        }
    }
    public void school(String day){
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("Olasılık ve İstatistik");
                System.out.println("Data Structures");
                break;
            case "tuesday":
                System.out.println("Object Oriented Programming");
                System.out.println("Differential Equations");
                break;
            case "wednesday":
                System.out.println("Object Oriented Programming Lab");
                break;
            case "thursday":
                System.out.println("Academic English");
                System.out.println("Differential Equations");
                break;
            case "friday":
                System.out.println("Elektrik ve Elektronik Devreler");
                break;
            case "saturday":
                System.out.println("None");
                break;
            case "sunday":
                System.out.println("None");
                break;
            case "e":
                break;
            default:
                System.out.println("Invalid day chosen.");
        }
    }
    public void skinCare(String day){
        switch (day.toLowerCase()){
            case "morning":
                System.out.println("In the mornings, I always apply sunscreen before I go out. I think it is important.");
                break;
            case "night":
                System.out.println("Before I sleep, I clean my face with face wash gel then I apply C vitamin serum.");
                break;
            case "both":
                System.out.println("In the mornings, I always apply sunscreen before I go out. I think it is important.");
                System.out.println("Before I sleep, I clean my face with face wash gel then I apply C vitamin serum.");
                break;
            case "e":
                break;
            default:
                System.out.println("Invalid day chosen.");
        }
    }
    public void sleep(String day){
        switch (day.toLowerCase()) {
            case "monday":
                System.out.println("Monday: 02.53 - 09.00");
                break;
            case "tuesday":
                System.out.println("Tuesday: 00.00 - 07.56\n" +
                        "         20.00 - 23.30");
                break;
            case "wednesday":
                System.out.println("Wednesday: 5.30 - 09.50");
                break;
            case "thursday":
                System.out.println("Thursday: 00.20 - 11.30");
                break;
            case "friday":
                System.out.println("Friday: 05.10 - 09.30\n" +
                        "        11.40 - 14.26");
                break;
            case "saturday":
                System.out.println("Saturday: 03.00 - 12.10\n" +
                        "          13.10 - 14.30");
                break;
            case "sunday":
                System.out.println("Sunday: 4.15 - 11.20");
                break;
            case "e":
                break;
            default:
                System.out.println("Invalid day chosen.");
        }
        if (!"e".equalsIgnoreCase(day)) {
            System.out.println("I know I have a perfect schedule!!");
        }
    }
    public void travel(String day){
        System.out.println("My school is really far away from my home. It takes me an hour and a half to get to school.");
    }
}

