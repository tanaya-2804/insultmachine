import java.util.Random;
import java.util.Scanner;

public class InsultMachine {
    public static void main(String[] args) {
        String[] insults = {
            "You're as useful as a screen door on a submarine.",
            "Your secrets are safe with me. I never even listen when you tell me them.",
            "You're as bright as a black hole on a cloudy night.",
            "I'd agree with you, but then we’d both be wrong."
        };
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("Here’s your insult: ");
            System.out.println(insults[random.nextInt(insults.length)]);
            System.out.println("Do you want another insult? (yes/no): ");
            String input = scanner.nextLine().trim().toLowerCase();
            if (!input.equals("yes")) break;
        }
        scanner.close();
    }
}
