public class Main {

    public static void main(String[] args) {

//        int newScore = calculatedScore("Ravi", 100);
//        System.out.println("New score is " + newScore);
//        calculatedScore(100);

        System.out.println("New score is " + calculatedScore("Ravi", 100));
        System.out.println("New score is " + calculatedScore(50));


    }

    public static int calculatedScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculatedScore(int score) {

        return calculatedScore("Anonymous", score);
    }
}
