import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String userInput;

        System.out.println("Chatbot: Hello! I am a simple AI Chatbot.");
        System.out.println("Chatbot: Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            userInput = sc.nextLine().toLowerCase();

            if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Chatbot: Hello! Nice to meet you 😊");

            } else if (userInput.contains("how are you")) {
                System.out.println("Chatbot: I am doing great! Thank you for asking.");

            } else if (userInput.contains("internship")) {
                System.out.println("Chatbot: This chatbot is created for CodeAlpha Internship.");

            } else if (userInput.contains("java")) {
                System.out.println("Chatbot: Java is a powerful object-oriented programming language.");

            } else if (userInput.contains("bye")) {
                System.out.println("Chatbot: Goodbye! Have a great day 👋");
                break;

            } else {
                System.out.println("Chatbot: Sorry, I didn't understand that.");
            }
        }

        sc.close();
    }
}
