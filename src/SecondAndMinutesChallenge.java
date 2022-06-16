public class SecondAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(1, 1));
        System.out.println(getDurationString(1));

    }

    public static String getDurationString(long minutes, long seconds) {

        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            System.out.println("Invalid value");
        }

        long answerHours = minutes / 60;

        long answerMinutes = minutes % 60;

        return (answerHours + "h " + answerMinutes + "m " + seconds + "s");

    }

    public static String getDurationString (long seconds) {

        if (seconds < 0) {
            System.out.println("Invalid value");
        }

        long answerMinutesTwo = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(answerMinutesTwo, remainingSeconds);
    }
}
