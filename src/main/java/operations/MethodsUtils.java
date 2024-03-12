package operations;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import static operations.Methods.*;
import static operations.irregularVerbs.irregularVerbsArray;

public class MethodsUtils {

    protected static Set<Integer> setSetWithUniqueNumbers(int length) {
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        Random rnd = new Random();

        while (uniqueNumbers.size() < irrArr.length) {
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

    public static void printProgressInPercent() {
        double progressInPercent = (progress / irrArr.length) * 100;
        System.out.println("Progress: " + progressInPercent +"%");
    }
}
