public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces (double numberOne, double numberTwo) {

        int a = (int)(numberOne * 1000);

        int b = (int)(numberTwo * 1000);

        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
