/**
 * Provides various calming activities and suggestions for the user.
 */
public class CalmActivity {

    /**
     * Guides the user through a simple breathing exercise.
     */
    public void breathingExercise() {
        System.out.println("\nWe will start with a breathing exercise. It's great for calming the nervous system. ");
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println("\nBreathe in deeply through your nose for 4 seconds...");
                Thread.sleep(4000); 
                
                System.out.println("Hold your breath for 7 seconds...");
                Thread.sleep(7000); 

                System.out.println("Exhale slowly through your mouth for 8 seconds...");
                Thread.sleep(8000); 
            }
            System.out.println("\nWell done. I hope that helped you feel a bit calmer. ");
        } catch (InterruptedException e) {
            System.out.println("Exercise interrupted.");
            Thread.currentThread().interrupt();
        }
    }

    /**
     * Suggests listening to music.
     */
    public void suggestMusic() {
        System.out.println("\nMusic can be a wonderful companion. How about putting on your favorite playlist? ");
        System.out.println("Whether it's calming, energetic, or nostalgic, let the music meet you where you are.");
    }

    /**
     * Suggests engaging in some light physical activity.
     */
    public void suggestPhysicalActivity() {
        System.out.println("\nSometimes, moving your body can change your mind. ");
        System.out.println("Consider a short walk outside, some gentle stretching, or even a few minutes of dancing.");
        System.out.println("It's not about a hard workout, but about reconnecting with your body.");
    }
    
    /**
     * Suggests writing in a gratitude journal.
     */
    public void suggestGratitudeJournal() {
        System.out.println("\nFocusing on what we're grateful for can shift our perspective. ");
        System.out.println("Try writing down 3 simple things you are thankful for today.");
        System.out.println("They can be as small as a cup of coffee or the warmth of the sun.");
    }
}