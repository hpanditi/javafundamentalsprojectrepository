public class floatingpointprecision {

    public static void main(String[] args) {

        System.out.println("Hello World!!!");

        float one = 1.25f;

        double two = 1.50d;

        System.out.println(one);

        System.out.println(two);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value = " + myMindoubleValue);
        System.out.println("double maximum value = " + myMaxdoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue);
        System.out.println("MyDoubleValue = " + myDoubleValue);

//        Convert a given number of pounds to kilograms

        double pounds = 15d;

        double kilograms = 0.45359237;

        double answer = pounds * kilograms;

        System.out.println("The weight in kilograms is " + answer);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;

        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
