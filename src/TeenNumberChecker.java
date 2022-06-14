public class TeenNumberChecker {

    public static boolean hasTeen (int a, int b, int c) {

        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public static boolean isTeen (int d) {

        return d >= 13 && d <= 19;
    }
}

//public class TeenNumberChecker {
//
//    public static boolean hasTeen (int numberone, int  numbertwo, int numberthree) {
//
//        if ((numberone >= 13 && numberone <= 19) || (numbertwo >= 13 && numbertwo <= 19) || (numberthree >= 13 && numberthree <= 19)) {
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean isTeen(int num4) {
//        if (num4 >= 13 && num4 <= 19) {
//            return true;
//        }
//        return false;
//    }
//
//}