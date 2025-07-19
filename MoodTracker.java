// package Mental_Health_Simulation_Assistant;

import java.io.FileWriter;
import java.io.IOException;

public class MoodTracker {
    public void saveMood(User user) {
        try {
            FileWriter writer = new FileWriter(user.getName() + "_mood_history.txt", true);
            int latestMood = user.getMoodHistory().get(user.getMoodHistory().size() - 1);
            writer.write("Mood: " + latestMood + "\n");
            writer.close();
            System.out.println("💾 Mood history saved!");
        } catch (IOException e) {
            System.out.println("Error saving mood: " + e.getMessage());
        }
    }
}
