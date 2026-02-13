import java.util.Scanner;

public class AIChatbot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;

        System.out.println("Chatbot: Hello! Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            input = sc.nextLine().toLowerCase();

            if (input.contains("hello")) {
                System.out.println("Chatbot: Hi there!");
            } else if (input.contains("how are you")) {
                System.out.println("Chatbot: I am fine. How can I help you?");
            } else if (input.contains("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            } else {
                System.out.println("Chatbot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}

