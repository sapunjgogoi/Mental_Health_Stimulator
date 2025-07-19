import java.util.Scanner;

/**
 * The main entry point for the Mental Health Check-in Simulator.
 */
public class Executer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Hi, what is your name?  ");
        String name = sc.nextLine();
        User user = new User(name);
        Assistant assistant = new Assistant(user);

        while (true) {
            System.out.println("\n*** Check-in Menu ☰ ***");
            System.out.println("1. Start a session");
            System.out.println("2. Show mood history");
            System.out.println("3. Terminate the session");
            System.out.print("Choose an option: ");
            
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    assistant.startSession(sc);
                    break;
                case "2":
                    assistant.showMoodHistory();
                    break;
                case "3":
                    System.out.println("I hope you had a great session. Take care! ");
                    sc.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid input, please try again. ");
                    break;
            }
        }
    }
}