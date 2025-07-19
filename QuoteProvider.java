// package Mental_Health_Simulation_Assistant;

import java.util.Random;

public class QuoteProvider {
    private String[] quotes = {
        "You are stronger than you think.",
        "Take it one day at a time.",
        "Breathe. You’ve got this.",
        "Every moment is a fresh beginning.",
        "It’s okay to not be okay."
    };

    public String getQuote() {
        Random rand = new Random();
        return quotes[rand.nextInt(quotes.length)];
    }
}
