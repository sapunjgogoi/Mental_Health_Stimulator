# Mental-Health-Stimulator
A bot program stimulating the mental health check in
<br>
Author - Sapun Jyoti Gogoi

A simple console application I built to practice my Java skills and explore creating interactive programs.

---
## About This Project

As a computer science student, I wanted to apply my knowledge of Object-Oriented Programming (OOP) to a practical project. I created this simple mental health assistant to simulate a supportive conversation. It checks in on the user's mood, offers personalized feedback based on their feelings, and can guide them through a simple calming exercise.

The main goal was to build a program with a logical structure and a conversational flow that feels helpful and empathetic.

---
## Key Features

* **Mood Check-in:** Asks for your current mood (e.g., Happy, Sad, Anxious).
* **Personalized Responses:** Responds differently based on your input. If you're happy, it celebrates with you. If you're feeling down, it offers support.
* **Guided Breathing Exercise:** A simple, timed breathing activity to help with grounding and anxiety.
* **Inspirational Quotes:** Provides a random positive quote during each session.
* **Mood History:** You can view a list of all the moods you've logged.

---
## Tech Stack

* **Java**

---
## How To Run

1.  Make sure you have a Java Development Kit (JDK) installed.
2.  Clone or download the project files.
3.  Open your terminal or command prompt in the project's root directory.
4.  Compile all the Java files:
    ```bash
    javac *.java
    ```
5.  Run the main program:
    ```bash
    java Executer
    ```

---
## What I Learned

This was a great project for practicing core Java concepts:

* **Object-Oriented Design:** Structuring the program into different classes like `User`, `Assistant`, `MoodTracker`, etc., each with its own responsibility.
* **Handling User Input:** Using the `Scanner` class to create an interactive console experience.
* **Conditional Logic:** Using `switch` statements to create a dynamic conversational flow that changes based on user input.
* **Basic Thread Management:** Using `Thread.sleep()` to create timed pauses for the breathing exercise.

---
## Future Goals

Things I'd like to add in the future:

* Build a simple Graphical User Interface (GUI) using Java Swing or JavaFX.
* Save the mood history to a text file so it isn't lost when the program closes.