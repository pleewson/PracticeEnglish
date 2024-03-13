package operations;

import java.util.*;

import static operations.Methods.*;
import static operations.irregularVerbs.irregularVerbsArray;

public class MethodsUtils {

    protected static Set<Integer> setSetWithUniqueNumbers(int limit) {
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        Random rnd = new Random();

        while (uniqueNumbers.size() < limit) {
            int randomNumber = rnd.nextInt(irrArr.length);
            uniqueNumbers.add(randomNumber);
        }

        return uniqueNumbers;
    }

    protected static void print1stForm(int possition) {
        System.out.print(irrArr[possition][0]);
    }

    public static void checkAnswers(String firstAnswer, String secondAnswer) {
        String[] correctAnswersTwo = irregularVerbsArray[setPossition][1].trim().split("/");
        String[] correctAnswersThree = irregularVerbsArray[setPossition][2].trim().split("/");

        if (Arrays.asList(correctAnswersTwo).contains(firstAnswer) && Arrays.asList(correctAnswersThree).contains(secondAnswer)) {
            System.out.println("Good Answer.");
            iterator.remove();
            progress++;
        } else {
            System.out.println("Not Good Answer.");
        }
    }

    public static void printProgressInPercent(int limit) {
        double progressInPercent = (progress / limit) * 100;
        System.out.println("Progress: " + progressInPercent + "%");
    }

    public static int enterLimit() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of irregular verbs that you want try: ");
        while (!scan.hasNextInt()) {
            System.out.println("Thats not a number.");
            scan.next();
            scan.hasNextInt();
        }

        int limit = scan.nextInt();
        return limit;
    }
}


