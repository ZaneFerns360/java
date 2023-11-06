import java.util.Random;
import java.time.LocalDate;

public class ThoughtOfTheDay {
    public static void main(String[] args) {
        String[] quotes = {
            "The only way to do great work is to love what you do.",
            "Believe you can and you're halfway there.",
            "Don't watch the clock; do what it does. Keep going.",
            "The future belongs to those who believe in the beauty of their dreams.",
            "The secret of getting ahead is getting started.",
            // Add more quotes as needed
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);

        LocalDate date = LocalDate.now();
        System.out.println("Thought of the day for " + date + ":");
        System.out.println(quotes[index]);
    }
}
