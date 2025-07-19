// package Mental_Health_Simulation_Assistant;

import java.util.ArrayList;

public class User {
    private String name;
    private ArrayList<Integer> moodHistory;

    public User() {
        moodHistory = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addMood(int mood) {
        moodHistory.add(mood);
    }

    public ArrayList<Integer> getMoodHistory() {
        return moodHistory;
    }
}
