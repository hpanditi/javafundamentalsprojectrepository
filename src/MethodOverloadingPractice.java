public class MethodOverloadingPractice {

    public static void main(String[] args) {
        double methodOne = calcFeetAndInchesToCentimeters(5, 8);
        if (methodOne < 0.0) {
            System.out.println("Invalid parameters");
        } else {
            System.out.println("The total amount of centimeters is: " + methodOne);
        }

        double methodTwo = calcFeetAndInchesToCentimeters(5);
        if (methodTwo < 0.0) {
            System.out.println("Invalid parameters");
        } else {
            System.out.println("The total amount of feet is: " + methodTwo);
        }
    }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid value entered");
            return -1;

        } else {
            double answer = (feet * 12 * 2.54) + (inches * 2.54);
            return answer;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches < 0 || inches > 12) {
            System.out.println("Invalid value entered");
            return -1;
        } else {
            double answerTwo = (inches/12);
            return answerTwo;
        }
    }
}
