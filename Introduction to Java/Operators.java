public class Operators {

    public static void main(String[] args) {

        // Arithmetic Operators ( + , - , * , / , % )

        int a = 10;
        int b = 5;
        int c , d , e , f , g;

        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b;
        g = a % b;  // modular operator gives u remainder

        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);


        // Relational Operator ( > , < , = , ! ) return boolean value

        System.out.println(a < b);
        System.out.println(a > b);
        System.out.println(a <= b); // less than or equal to
        System.out.println(a >= b); // greater than or equal to
        System.out.println( a != b); // not equal
        System.out.println( a == b );  // equal to


        // Assignment Operator ( = )

        int ab = 5 ; // assigning the value by =

            //  assignment operator also with arithmetic operator

                 ab += 10; // it is  same to ab = ab + 10;

        // Logical Operator ( && , || , ! )

            // AND operator ( && ) give true only if all condition are true

                System.out.println(a == 10 && b == 5);  // true

                System.out.println(a == 5 && b == 5);   // false

           // OR operator  ( || ) give true only if any one condition will be true

                System.out.println(a == 10 || b == 7);  // true

                System.out.println(a == 5 || b == 3);   // false


          // NOT operator ( ! ) gives opp. result according to real original value

                System.out.println(!(3>5));  // true   but actual value is False

                System.out.println( 3!=3);   // false   but actual value is true


    }
}
