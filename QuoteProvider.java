import java.util.Random;

/**
 * Provides random inspirational quotes.
 */
public class QuoteProvider {
    private static final String[] quotes = {
        "You are stronger than you think.",
        "Take it one step at a time.",
        "This too shall pass.",
        "Breathe. You're doing okay.",
        "It's okay to ask for help.",
        "You matter. Your feelings are valid.",
        "Progress, not perfection."
    };

    /**
     * Selects and returns a random quote.
     * @return A randomly selected quote as a String.
     */
    public String getRandomQuote() {
        Random rand = new Random();
        int index = rand.nextInt(quotes.length);
        return quotes[index];
    }
}