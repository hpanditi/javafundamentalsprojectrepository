public class practicetwo {

    public static void main(String[] args) {

        // This is a single line comment

        /* This is a
        * multi-line
        * comment */

        // Variables

        String name = "John";
        System.out.println("Hello, my name is: " + name);

        int myNum = 15;

        System.out.println(myNum);

        int mySecondNum;

        mySecondNum = 20;

        System.out.println(mySecondNum);

        String firstName = "Harry";

        String secondName = "Potter";

        String fullName = firstName + " " + secondName;

        System.out.println(fullName);

        int a = 10;

        int b = 15;

        int c = a + b;

        System.out.println(c);

//        if (a > b) {
//            System.out.println("True");
//        } else {
//            System.out.println("False");
//        }

        int d = 5;
        int e = 10;
        int f = 15;

        System.out.println(d + e + f);

        int g, h, i;
        g = h = i = 100;
        System.out.println(g + h + i);

        // All Java variables must be identified with unique names known as identifiers

        // Boolean data types return true or false

        boolean isJavaFun = true;

        boolean isFishTasty = false;

        System.out.println(isJavaFun);

        System.out.println(isFishTasty);

        char myGrade = 'A';

        System.out.println(myGrade);

        String iceCream = "I love ice cream!";

        System.out.println(iceCream);

        // Type casting is when you assign a value of one primitive data type to another type.

        // Widening casting - converting a smaller type to a larger type size

        int myFirstInteger = 10;

        double myFirstDouble = myFirstInteger;

        System.out.println(myFirstInteger);

        System.out.println(myFirstDouble);

        // Narrowing casting - converting a larger type to a smaller size type.

        double mySecondDouble = 9.78d;

        int mySecondInt = (int) mySecondDouble;

        System.out.println(mySecondDouble);

        System.out.println(mySecondInt);

        // Operators are used to perform operations on variables and values

        int j = 100 + 50;

        System.out.println(j);

        int sum1 = 100 + 100;

        int sum2 = sum1 + 250;

        int sum3 = sum2 + sum2;

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);

        int k = 10;
        k += 5;

        System.out.println(k);

        String love = "I love you!";

        System.out.println(love);

        String txt = "abcde";

        System.out.println("The length of the text string is: " + txt.length());

        String fname = "Hermione ";

        String lname = "Granger";

        System.out.println(fname + " " + lname);

        System.out.println(fname.concat(lname));

        String l = "10";

        int m = 20;

        String n = l + m;

        System.out.println(n);

        int o = Math.max(5, 10);

        System.out.println(o);

        int p = Math.min(5, 10);

        System.out.println(p);

        double q = Math.sqrt(64);

        System.out.println(q);

        double r = Math.abs(-4.7);

        System.out.println(r);

        System.out.println(Math.random());

        int randomNum = (int)(Math.random() * 101);

        System.out.println(randomNum);

    }
}
