package operations;
import java.util.*;
import static operations.MethodsUtils.*;
public class Methods {
    static String[][] irrArr = irregularVerbs.irregularVerbsArray;
    protected static Set<Integer> uniqueNumbers = setSetWithUniqueNumbers(irrArr.length);
    protected static Iterator<Integer> iterator = uniqueNumbers.iterator();
    static int setPossition;
    static double progress = 0;

    public static void fillSecondAndThirdVerbALL() {
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
            printProgressInPercent();
            scan.close();
        }
        System.out.println("Congratulations!:)");
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
