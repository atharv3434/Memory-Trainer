public class ScoreTracker {
    private static int score = 0;

    public static void increaseScore() {
        score += 10;
    }

    public static int getScore() {
        return score;
    }
}
