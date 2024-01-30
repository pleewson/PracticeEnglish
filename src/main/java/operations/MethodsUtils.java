package operations;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import static operations.Methods.*;

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

    protected static void setPossitionAtZero() {
        iterator = uniqueNumbers.iterator();
        setPossition = iterator.next();
    }

    protected static void resetWrongAnswers() {
        wrongAnswers = 0;
    }
}
