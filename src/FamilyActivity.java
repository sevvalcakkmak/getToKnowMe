import java.util.Scanner;

public class FamilyActivity extends Days{
    public FamilyActivity(Scanner scanner){
        super(scanner);
    }
    @Override
    public void execute(){
        System.out.println("I live in the family house. What about you, do you live with you family");
        String response = yesOrNo();
        if ("Yes".equalsIgnoreCase(response)) {
            System.out.println("Nice!! Even though I live with my family too, I cannot spend much time with them because of school and other stuffs.");
        } else if ("No".equalsIgnoreCase(response)) {
            System.out.println("Where do you stay?");
            System.out.println("\t- Dorm");
            System.out.println("\t- My house");
            System.out.println("\t- Else");
            System.out.print("> ");
            String stay = scanner.nextLine();
            switch (stay.toLowerCase()){
                case "dorm":
                    System.out.println("So you are living the dorm life!");
                    break;
                case "my house":
                    System.out.println("Nice! Having your own space must be great.");
                    break;
                case "else":
                    System.out.println("Curious! Where do you stay?");
                    System.out.print("> ");
                    String elseStay = scanner.nextLine();
                    System.out.println("Great!");
                    break;
                default:
                    System.out.println("Invalid response.");
            }
        } else {
            System.out.println("What?");
        }
    }
}
