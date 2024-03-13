package operations;

import java.util.*;

import static operations.MethodsUtils.*;

public class Methods {
    static String[][] irrArr = irregularVerbs.irregularVerbsArray;

    static int setPossition;
    static double progress = 0;
    protected static Iterator<Integer> iterator;


    public static void fillSecondAndThirdVerbALL() {
        Set<Integer> uniqueNumbers = setSetWithUniqueNumbers(irrArr.length);
        iterator = uniqueNumbers.iterator();
        int limit = irrArr.length;

        Scanner scan = new Scanner(System.in);
        while (progress != irrArr.length) {
            if (!iterator.hasNext()) {
                iterator = uniqueNumbers.iterator();
            }
            setPossition = iterator.next();

            print1stForm(setPossition);

            System.out.print(" ");
            String userInput1 = scan.next();

            System.out.print(" ");
            String userInput2 = scan.next();

            checkAnswers(userInput1, userInput2);
            printProgressInPercent(limit);

        }
        System.out.println("Congratulations!:)");
        scan.close();
    }


    public static void fillSecondAndThirdVerbWithLimit() {
        int limit = enterLimit();
        Scanner scan = new Scanner(System.in);

        Set<Integer> uniqueNumbers = setSetWithUniqueNumbers(limit);
        iterator = uniqueNumbers.iterator();

        while (progress != limit) {
            if (!iterator.hasNext()) {
                iterator = uniqueNumbers.iterator();
            }

            setPossition = iterator.next();

            print1stForm(setPossition);

            System.out.print(" ");
            String userInput1 = scan.next(); //wywala tutaj

            System.out.print(" ");
            String userInput2 = scan.next();

            checkAnswers(userInput1, userInput2);
            printProgressInPercent(limit);

        }
        System.out.println("Congratulations!:)");
        scan.close();

    }

    //this method print whole array (PL-version included)
    public static void printAllIrregularVerbsPL() {
        System.out.println("I.F     II.F     III.F     PL" + '\n');

        for (int i = 0; i < irrArr.length; i++) {
            for (int j = 0; j < irrArr[i].length; j++) {
                System.out.print("[" + irrArr[i][j] + "]  ");
            }
            System.out.println();
        }
    }

}
