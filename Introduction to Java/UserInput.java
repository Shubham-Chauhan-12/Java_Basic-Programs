import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // For Integer Value
        int num = sc.nextInt();

        // For Double Value
        double large = sc.nextInt();

        // For Float Value
        Float temp = sc.nextFloat();

        // For String Value
        String name = sc.next(); // for single word

        String word = sc.nextLine(); // for more than 1 word

        // For Character
        char ch = sc.next().charAt(0);

        // For Boolean Value
        boolean result = sc.nextBoolean();


    }
}
