import java.util.Scanner;

public class MemoryTrainer {
    public static void main(String[] args) {
        System.out.println("🧠 Welcome to the Memory Trainer Game!");
        System.out.println("Remember the sequence and type it correctly!");

        Scanner sc = new Scanner(System.in);
        int level = 1;

        while (true) {
            System.out.println("\n➡️ Level: " + level);
            boolean success = GameEngine.playLevel(level);

            if (success) {
                ScoreTracker.increaseScore();
                level++;
            } else {
                System.out.println("❌ Wrong! Game Over.");
                System.out.println("🏆 Your Score: " + ScoreTracker.getScore());
                break;
            }

            System.out.print("Continue to next level? (yes/no): ");
            if (!sc.next().equalsIgnoreCase("yes")) break;
        }
        System.out.println("Thanks for playing!");
    }
}
