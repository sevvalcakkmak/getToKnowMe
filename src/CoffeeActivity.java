import java.util.Scanner;

public class CoffeeActivity extends Days{
    public static final String activityName = "coffee";
    public CoffeeActivity(Scanner scanner){
        super(scanner);
    }
    @Override
    public void execute(){
        System.out.println("That is a really deep topic, so before we dive in tell me do you like coffee?");
        while (true){
            String response = yesOrNo();
            if ("Yes".equalsIgnoreCase(response)) {
                System.out.println("I'm glad to hear that because I am in love with coffee too, which one is your favorite?");
                System.out.println("\t- Americano");
                System.out.println("\t- Espresso");
                System.out.println("\t- Latte");
                System.out.println("\t- Cappuccino");
                System.out.println("\t- Cold Brew");
                System.out.println("\t- Turkish Coffee");
                System.out.println("\t- Filter");
                System.out.println("\t- Else");
                System.out.print("> ");
                response = scanner.nextLine();

                switch (response.toLowerCase()) {
                    case "americano":
                        System.out.println("Nice choice! The diluted magic of an Americano is unique. Do you add anything to it?");
                        String yesOrNo = yesOrNo();

                        if ("Yes".equalsIgnoreCase(yesOrNo)) {
                            System.out.println("Enhancing the experience! What's your favorite add-in for your Americano?");
                            System.out.println("\t- Sugar");
                            System.out.println("\t- Milk");
                            System.out.println("\t- Flavored Syrup");
                            System.out.println("\t- Other");
                            System.out.print("> ");
                            String addInResponse = scanner.nextLine();

                            switch (addInResponse.toLowerCase()) {
                                case "sugar":
                                    System.out.println("I prefer my americano sugar-free. How many spoons of sugar do you usually go for?");
                                    System.out.print("> ");
                                    int spoonOfSugar = scanner.nextInt();
                                    scanner.nextLine(); // Consume the newline character
                                    if (spoonOfSugar == 1){
                                        System.out.println("A touch of sweetness!");
                                    } else if (spoonOfSugar == 2) {
                                        System.out.println("That might be so sweet");
                                    } else if (spoonOfSugar > 2) {
                                        System.out.println("Are you serious? You should add less sugar for your health!");
                                    }else{
                                        System.out.println("What do you mean?");
                                    }
                                    break;
                                case "milk":
                                    System.out.println("Creamy touch! I like to add milk to my americano too!");
                                    break;
                                case "flavored syrup":
                                    System.out.println("I prefer the classic flavors mostly, what is your suggestion for flavored syrup?");
                                    System.out.print("> ");
                                    String flavoredSyrup = scanner.nextLine();
                                    System.out.println("Thanks for your suggest! I will give it a try.");
                                    break;
                                case "other":
                                    System.out.println("Curious! What unique ingredient do you like adding to your Americano?");
                                    System.out.print("> ");
                                    String other = scanner.nextLine();
                                    System.out.println("It sounds tasty!");
                                    break;
                                default:
                                    System.out.println("Interesting choice!");
                            }
                        } else {
                            System.out.println("Keeping it pure! Usually I like to keep my americano simple too.");
                            System.out.println("Wanna go to drink coffee with me?");
                            String drinkCoffee = yesOrNo();
                            if ("Yes".equalsIgnoreCase(drinkCoffee)){
                                System.out.println("I'm buying your coffee then, let's enjoy our coffees together!");
                            }else {
                                System.out.println("Your lost, I will enjoy my coffee time alone.");
                            }
                        }
                        break;
                    case "espresso":
                        System.out.println("People who drink pure espresso are scary? Are you one of them too?");
                        String espressoDrinkerResponse = yesOrNo();
                        if ("Yes".equalsIgnoreCase(espressoDrinkerResponse)) {
                            System.out.println("Fearless espresso lover! But I still prefer to drink my espresso with milk.");
                        } else {
                            System.out.println("Yes, I knew you are not that scary.");
                        }
                        break;
                    case "latte":
                        System.out.println("Classic! Lattes are known for their creamy texture. Do you add anything to it?");
                        yesOrNo = yesOrNo();

                        if ("Yes".equalsIgnoreCase(yesOrNo)) {
                            System.out.println("Enhancing the experience! What's your favorite add-in for your Latte?");
                            System.out.println("\t- Sugar");
                            System.out.println("\t- Flavored Syrup");
                            System.out.println("\t- Other");
                            System.out.print("> ");
                            String addInResponse = scanner.nextLine();

                            switch (addInResponse.toLowerCase()) {
                                case "sugar":
                                    System.out.println("I prefer my latte sugar-free. How many spoons of sugar do you usually go for?");
                                    System.out.print("> ");
                                    int spoonOfSugar = scanner.nextInt();
                                    scanner.nextLine(); // Consume the newline character
                                    if (spoonOfSugar == 1){
                                        System.out.println("A touch of sweetness!");
                                    } else if (spoonOfSugar == 2) {
                                        System.out.println("That might be so sweet");
                                    } else if (spoonOfSugar > 2) {
                                        System.out.println("Are you serious? You should add less sugar for your health!");
                                    }else{
                                        System.out.println("What do you mean?");
                                    }
                                    break;
                                case "flavored syrup":
                                    System.out.println("I prefer the classic flavors mostly, what is your suggestion for flavored syrup?");
                                    System.out.print("> ");
                                    String flavoredSyrup = scanner.nextLine();
                                    System.out.println("Thanks for your suggest! I will give it a try.");
                                    break;
                                case "other":
                                    System.out.println("Curious! What unique ingredient do you like adding to your Latte?");
                                    System.out.print("> ");
                                    String other = scanner.nextLine();
                                    System.out.println("It sounds tasty!");
                                    break;
                                default:
                                    System.out.println("Interesting choice!");
                            }
                        } else {
                            System.out.println("Keeping it pure! Usually I like to keep my latte simple too.");
                            System.out.println("Wanna go to drink coffee with me?");
                            String drinkCoffee = yesOrNo();
                            if ("Yes".equalsIgnoreCase(drinkCoffee)){
                                System.out.println("I'm buying your coffee then, let's enjoy our coffees together!");
                            }else {
                                System.out.println("Your lost, I will enjoy my coffee time alone.");
                            }
                        }
                        break;
                    case "cappuccino":
                        System.out.println("Ah, the foamy delight! Do you add anything to it?");
                        yesOrNo();
                        yesOrNo = scanner.nextLine();

                        if ("Yes".equalsIgnoreCase(yesOrNo)) {
                            System.out.println("Enhancing the experience! What's your favorite add-in for your Cappuccino?");
                            System.out.println("\t- Sugar");
                            System.out.println("\t- Flavored Syrup");
                            System.out.println("\t- Other");
                            System.out.print("> ");
                            String addInResponse = scanner.nextLine();

                            switch (addInResponse.toLowerCase()) {
                                case "sugar":
                                    System.out.println("I prefer my Cappuccino sugar-free. How many spoons of sugar do you usually go for?");
                                    System.out.print("> ");
                                    int spoonOfSugar = scanner.nextInt();
                                    scanner.nextLine(); // Consume the newline character
                                    if (spoonOfSugar == 1){
                                        System.out.println("A touch of sweetness!");
                                    } else if (spoonOfSugar == 2) {
                                        System.out.println("That might be so sweet");
                                    } else if (spoonOfSugar > 2) {
                                        System.out.println("Are you serious? You should add less sugar for your health!");
                                    }else{
                                        System.out.println("What do you mean?");
                                    }
                                    break;
                                case "flavored syrup":
                                    System.out.println("I prefer the classic flavors mostly, what is your suggestion for flavored syrup?");
                                    System.out.print("> ");
                                    String flavoredSyrup = scanner.nextLine();
                                    System.out.println("Thanks for your suggest! I will give it a try.");
                                    break;
                                case "other":
                                    System.out.println("Curious! What unique ingredient do you like adding to your Cappuccino?");
                                    System.out.print("> ");
                                    String other = scanner.nextLine();
                                    System.out.println("It sounds tasty!");
                                    break;
                                default:
                                    System.out.println("Interesting choice!");
                            }
                        } else {
                            System.out.println("Keeping it pure! Usually I like to keep my Cappuccino simple too.");
                            System.out.println("Wanna go to drink coffee with me?");
                            String drinkCoffee = yesOrNo();
                            if ("Yes".equalsIgnoreCase(drinkCoffee)){
                                System.out.println("I'm buying your coffee then, let's enjoy our coffees together!");
                            }else {
                                System.out.println("Your lost, I will enjoy my coffee time alone.");
                            }
                        }
                        break;
                    case "cold brew":
                        System.out.println("Iced goodness!");
                        System.out.println("Wanna go to drink coffee with me?");
                        String drinkCoffee = yesOrNo();
                        if ("Yes".equalsIgnoreCase(drinkCoffee)){
                            System.out.println("I'm buying your coffee then, let's enjoy our coffees together!");
                        }else {
                            System.out.println("Your lost, I will enjoy my coffee time alone.");
                        }
                        break;
                    case "turkish coffee":
                        System.out.println("Embracing tradition! It has a bitter taste, so it is not my favorite. However, if you make turkish coffee for me I enjoy it. Do you?");
                        String makeCoffee = yesOrNo();
                        if ("Yes".equalsIgnoreCase(makeCoffee)){
                            System.out.println("You are a wonderful person");
                        }else {
                            System.out.println("That made me sad.");
                        }
                        break;
                    case "filter":
                        System.out.println("Simple and effective! When do you prefer it mostly?");
                        System.out.print("> ");
                        String preferenceTime = scanner.nextLine();
                        System.out.println("I see. I mostly drink filter coffee when I take a study break because I really enjoy the make filter coffee!");
                        break;
                    case "else":
                        System.out.println("What is your favorite then?");
                        System.out.print("> ");
                        String elseCoffee = scanner.nextLine();
                        System.out.println("My favorites are Cappuccino and Filter Coffee but I will try " + elseCoffee + "at my first opportunity.");
                        break;
                    default:
                        System.out.println("Hmm, that's an interesting choice!");
                }
                break;
            } else if ("No".equalsIgnoreCase(response)){
                System.out.println("Not a coffee fan? I would say I am a coffee addict. It is so hard to understand why you don't like coffee...");
                break;
            }
            else {
                System.out.println("What?");
            }
        }
    }
}
