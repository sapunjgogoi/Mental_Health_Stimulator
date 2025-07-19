package Mental_Health_Simulation_Assistant;

import java.util.Scanner;

public class Assistant {
    private User user;
    private MoodTracker moodTracker;
    private QuoteProvider quoteProvider;
    private CalmActivity calmActivity;

    public Assistant() {
        user = new User();
        moodTracker = new MoodTracker();
        quoteProvider = new QuoteProvider();
        calmActivity = new CalmActivity();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("👋 Hello! I’m your Mental Health Assistant.");
        System.out.print("What's your name? ");
        String name = scanner.nextLine();
        user.setName(name);

        System.out.print("On a scale of 1–5, how are you feeling today? ");
        int mood = scanner.nextInt();
        scanner.nextLine(); // clear buffer

        user.addMood(mood);
        moodTracker.saveMood(user);

        System.out.println("Thank you for sharing, " + user.getName() + ".");
        System.out.println("💡 Here’s a quote for you: ");
        System.out.println("\"" + quoteProvider.getQuote() + "\"");

        System.out.println("✨ Here’s something you could try:");
        System.out.println(calmActivity.getActivity());

        System.out.println("✅ Your mood has been saved. Take care!");

        scanner.close();
    }
}
