public class operatorsoperandsexpressions {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3

        System.out.println("1 + 2 = " + result);

        // Comment

        int previousResult = result;

        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 3 -1 = 2

        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20

        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 /5 = 4

        System.out.println("20 / 5 = " + result);

        result = result % 3; // remainder of (4 % 3)

        System.out.println("4 % 3 = " + result);

        // Abbreviating Operators

        // result = result + 1;

        result++; // 1 + 1 = 2

        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1

        System.out.println("2 - 1 = " + result);

        // result = result + 2

        result += 2; // 1 + 2 = 3

        System.out.println("1 + 2 = " + result);

        // result = result * 10;

        result *= 10; // 3 * 10 = 30

        System.out.println("3 * 10 = " + result);

        // result = result / 3

        result /= 3; // 30 / 3 = 10

        System.out.println("30 / 3 = " + result);

        // result = result - 2

        result -= 2; // 10 - 2 = 8

        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;

        // There is no semicolon after the parentheses below

        // Use a code block

        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        // Logical and Operator

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // Example of Logical and Operator

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // Logical OR Operator

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true!");
        }

        boolean isCar = false;

        // The NOT Operator (!)

        if (isCar) {
            System.out.println("This is not supposed to happen.");
        }

        isCar = true;

        // Ternary Operator

        boolean wasCar = isCar ? true : false;

        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double one = 20.00;

        double two = 80.00;

        double answerone = ((one + two) * (100.00));

        double remainder = (answerone % 40.00);

        boolean booleanVariable = false;

        if (remainder == 0) {
            booleanVariable = true;
        } else {
            booleanVariable = false;
        }

        System.out.println("The boolean variable is: " + booleanVariable);

        if (booleanVariable == false) {
            System.out.println("Got some remainder");
        } else {
            System.out.println();
        }
    }
}
