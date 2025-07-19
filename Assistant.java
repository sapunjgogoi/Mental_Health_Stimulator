import java.util.Scanner;

/**
 * Orchestrates a personalized mental health check-in session based on user's mood.
 */
public class Assistant {
    private User user;
    private CalmActivity ca;
    private QuoteProvider qp;
    private MoodTracker mt;

    public Assistant(User user) {
        this.user = user;
        this.ca = new CalmActivity();
        this.qp = new QuoteProvider();
        this.mt = new MoodTracker();
    }
    
    // =================================================================
    // === NEW HELPER METHOD FOR PRONOUN SWAPPING ===
    // =================================================================
    /**
     * Converts first-person pronouns in a string to second-person.
     * @param userInput The original string from the user.
     * @return A new string with pronouns swapped for a natural response.
     */
    private String personalizeResponse(String userInput) {
        String response = userInput.trim();
        // Use regex with word boundaries (\b) and case-insensitivity ((?i))
        response = response.replaceAll("(?i)\\bi'm\\b", "you're");
        response = response.replaceAll("(?i)\\bi am\\b", "you are");
        response = response.replaceAll("(?i)\\bmy\\b", "your");
        response = response.replaceAll("(?i)\\bme\\b", "you");
        response = response.replaceAll("(?i)\\bi\\b", "you");
        return response;
    }

    public void startSession(Scanner sc) {
        String mood = mt.askMood(sc, user);
        user.addMoodHistory(mood);
        System.out.println("Thank you for sharing. Logging that to your mood history... ");

        switch (mood.trim().toLowerCase()) {
            case "happy":
            case "excited":
            case "okay":
                System.out.println("\nThat's wonderful to hear you're feeling " + mood + "! ");
                System.out.print("What's making you feel so good today? I'd love to hear about it: ");
                String reason = sc.nextLine();

                if (reason != null && !reason.trim().isEmpty()) {
                    String personalizedReason = personalizeResponse(reason);
                    System.out.println("\nIt's great to hear that " + personalizedReason + "!");
                    System.out.println("That is a fantastic reason to be happy. Thank you for sharing that joy with me! ");
                } else {
                     System.out.println("\nWell, whatever the reason, I'm glad you're feeling good!");
                }
                
                System.out.println("It's great to embrace these positive moments. Keep that great energy going! ");
                break;

            case "sad":
                System.out.println("\nI'm sorry to hear you're feeling sad. It's okay to feel this way. ");
                System.out.println("Here's a thought for you: \"" + qp.getRandomQuote() + "\"");
                ca.suggestMusic();
                break;

            case "anxious":
                System.out.println("\nFeeling anxious can be tough. Let's try to ground ourselves. ");
                System.out.println("Here's a thought for you: \"" + qp.getRandomQuote() + "\"");
                System.out.print("\nA guided breathing exercise can often help with anxiety. Would you like to try it? (yes/no): ");
                if (sc.nextLine().trim().equalsIgnoreCase("yes")) {
                    ca.breathingExercise();
                } else {
                    ca.suggestGratitudeJournal();
                }
                break;

            case "angry":
                System.out.println("\nIt's okay to feel angry. Let's find a constructive way to process it. ");
                System.out.println("Here's a thought for you: \"" + qp.getRandomQuote() + "\"");
                ca.suggestPhysicalActivity();
                break;

            case "tired":
                System.out.println("\nFeeling tired is a signal from your body to rest. Please be kind to yourself. ");
                System.out.println("Here's a gentle thought: \"" + qp.getRandomQuote() + "\"");
                System.out.println("Perhaps some calming music would be nice. Remember to prioritize your rest.");
                break;
                
            default:
                System.out.println("\nThank you for sharing that you're feeling '" + mood + "'.");
                System.out.println("Here is a quote for you: \"" + qp.getRandomQuote() + "\"");
                System.out.print("Would you like to try a calming breathing exercise? (yes/no): ");
                if (sc.nextLine().trim().equalsIgnoreCase("yes")) {
                    ca.breathingExercise();
                }
                break;
        }
        
        System.out.println("\nThank you for checking in with yourself today!");
    }

    public void showMoodHistory() {
        System.out.println("\n--- Your Mood History  ---");
        if (user.getMoodHistory().isEmpty()) {
            System.out.println("No moods have been logged yet.");
        } else {
            for (String mood : user.getMoodHistory()) {
                System.out.println("- " + mood);
            }
        }
        System.out.println("-------------------------");
    }
}