// package Mental_Health_Simulation_Assistant;

import java.util.Random;

public class CalmActivity {
    private String[] activities = {
        "Try a 5-minute deep breathing exercise.",
        "Write down 3 things you’re grateful for.",
        "Take a short walk outside if you can.",
        "Listen to your favorite calming music.",
        "Drink a glass of water and stretch."
    };

    public String getActivity() {
        Random rand = new Random();
        return activities[rand.nextInt(activities.length)];
    }
}
