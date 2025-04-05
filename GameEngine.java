import java.util.Random;
import java.util.Scanner;

public class GameEngine {
    public static boolean playLevel(int level) {
        String sequence = generateSequence(level);
        System.out.println("🔁 Memorize: " + sequence);

        try { Thread.sleep(1500); } catch (InterruptedException e) {}
        System.out.print("\033[H\033[2J"); // Clear console (may not work in all IDEs)
        System.out.flush();

        Scanner sc = new Scanner(System.in);
        System.out.print("✍️ Enter the sequence: ");
        String userInput = sc.nextLine();

        return sequence.equals(userInput);
    }

    private static String generateSequence(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(rand.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
