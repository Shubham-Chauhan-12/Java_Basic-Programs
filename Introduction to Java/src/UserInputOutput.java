package src;

import java.util.Scanner;

public class UserInputOutput {


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



        // Output

        System.out.print("Output comes in single line without line break ");

        System.out.println("Output comes in diff line by using (println)");


    // single line comment

     /* multi
        line  ( ctrl + shift + / )
        comment */

    }
}
