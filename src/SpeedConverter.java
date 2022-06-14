public class SpeedConverter {

//    public static void main(String[] args) {
//
//        long one = toMilesPerHour(5);
//        System.out.println(one);
//
////        two = printConversion(1.5);
////        System.out.println(two);
//    }

    public static long toMilesPerHour (double kilometresPerHour) {
        if (kilometresPerHour < 0) {
            return -1;
        } else if (kilometresPerHour > 0) {
            long answer = Math.round(kilometresPerHour / 1.609);
            return answer;
        }
        return 0;
    }

    public static void printConversion (double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else if (kilometersPerHour >= 0) {
            long milesPerHour = Math.round(kilometersPerHour / 1.609);
            System.out.println(kilometersPerHour + " km/h" + " = " + milesPerHour + " mi/h");
        }
    }
}

//// Answer
//
//public class SpeedConverter {
//    public static long toMilesPerHour(double kilometersPerHour) {
//
//        if(kilometersPerHour < 0) {
//            return -1;
//
//        }
//
//        return Math.round(kilometersPerHour / 1.609);
//
//    }
//
//    public static void printConversion(double kilometersPerHour) {
//
//        if(kilometersPerHour < 0) {
//            System.out.println("Invalid Value");
//        } else {
//            long milesPerHour = toMilesPerHour(kilometersPerHour);
//            System.out.println(kilometersPerHour +
//                    " km/h = " + milesPerHour +
//                    " mi/h");
//
//        }
//    }
//}