public class codeblocksifthenelsecontrolstatements {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score is less than 5000 but greater than 1000");
////          System.out.println("This was executed");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if(gameOver == true) {
            int finalScore = ((score + (levelCompleted * bonus)) + 1000);
            System.out.println("Your final score is " + finalScore);

            int scoreTwo = 10000;
            int levelCompletedTwo = 8;
            int bonusTwo = 200;

            int finalScoreTwo = ((scoreTwo + (levelCompletedTwo * bonusTwo)) + 1000);
            System.out.println("Your second final score is " + finalScoreTwo);
        }
    }
}
