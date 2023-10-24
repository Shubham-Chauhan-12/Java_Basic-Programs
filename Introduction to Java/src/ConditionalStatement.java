package src;

public class ConditionalStatement {

    public static void main(String[] args) {

        // ** any  block will only execute if condition written in the block will be true or satisfied

            // IF statement

            int num = 5;

            if(num > 2){
                System.out.println("Condition is true");
            }

            // IF - Else statement

            if (num == 4){
                System.out.println("Condition is False");
            }
            else {
                System.out.println("Condition may be True");
            }

            // IF ,  Else -IF ,  Else statement

            if (num > 5){

                System.out.println("False");
            }

            else if (num == 5) {
                System.out.println("Equal and True");
            }

            else {
                System.out.println("not sure");
            }



        // Switch - case  ( alternative of If - else if conditions are more )

                // ** break terminate the current block


            switch (num){

                case 0 : System.out.println("number is zero");
                        break;
                case 1 : System.out.println("number is one");
                    break;
                case 2 : System.out.println("number is two");
                    break;
                case 3 : System.out.println("number is three");
                    break;
                case 4 : System.out.println("number is four");
                    break;
                case 5 : System.out.println("number is five");
                    break;

                default: System.out.println(" no number found");  // default case execute if other did not have true condition and it doesn't require break
            }


            // ** Nested if statements and switch case is also possible






    }
}
