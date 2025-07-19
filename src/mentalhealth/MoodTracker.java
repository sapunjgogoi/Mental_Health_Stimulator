import java.util.Scanner;

/**
 * Handles asking the user about their current mood.
 */
public class MoodTracker {
    /**
     * Prompts the user for their mood and returns their input.
     * @param sc The Scanner object to read user input.
     * @param user The User object for a personalized greeting.
     * @return The mood entered by the user as a String.
     */
    public String askMood(Scanner sc, User user) {
        System.out.println("\nHi " + user.getName() + ", how are you feeling today? ");
        System.out.println("Options: Happy, Sad, Anxious, Angry, Tired, Excited, Okay");
        System.out.print("Your mood: ");
        String mood = sc.nextLine();
        return mood;
    }
}