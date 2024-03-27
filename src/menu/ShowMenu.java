package menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ShowMenu {

    private Map<String, String> words;
    private final Scanner sc;
    private final Random random;

    public ShowMenu() {
        words = new HashMap<>();
        sc = new Scanner(System.in);
        random = new Random();

    }

    public void showMenuOptions() {
        while (true) {
            System.out.println("Programming Field Most Used Words");
            System.out.println("Please enter the answers in capital letters --> Hello-Salam");
            System.out.println("Choose a lnaguage");
            System.out.println("1) English: ");
            System.out.println("2) Azerbaijani: ");
            System.out.println("3) Exit system: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                askQuestions(choice);
            } else if (choice == 2) {
                askQuestions(choice);
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;

            }

        }
    }

    private void askQuestions(int languagesChoice) {
        Object[] obj = words.keySet().toArray();

        System.out.println("How many questions do you want to answer ?");
        int totalQuestions = sc.nextInt();
        sc.nextLine();

        int questionsCount = 0;
        while (questionsCount < totalQuestions) {
            String randomWords = (String) obj[random.nextInt(obj.length)];
            String correctTranslation = words.get(randomWords);

            int attempts = 3;


            switch (languagesChoice) {
                case 1:
                    System.out.println("What is the Azerbaijani translation of " + randomWords + "?");
                    break;
                case 2:
                    System.out.println(randomWords + " sozunun Inglis dilinde menasi nedir?");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    return;
            }
            String userAnswer = sc.nextLine();
            while (!userAnswer.equalsIgnoreCase(correctTranslation) && attempts > 0) {
                System.out.println("Incorrect answer! You have " + attempts + " options left");
                userAnswer = sc.nextLine();
                attempts--;
            }

            if (userAnswer.equalsIgnoreCase(correctTranslation)) {
                System.out.println("Correct Answer!");
            } else {
                System.out.println("Correct answer: " + correctTranslation);
            }
            questionsCount++;
        }
        System.out.println("You have answered " + totalQuestions + " questions.");
        System.out.println("Starting again.....\n--------------------------------------------");
    }

    public void setWords(Map<String, String> words) {
        this.words = words;
    }
}

