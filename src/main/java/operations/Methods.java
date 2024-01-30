package operations;

import java.util.*;

import static operations.MethodsUtils.*;

public class Methods {

    static String[][] irrArr = irregularVerbs.irregularVerbsArray;
    protected static Set<Integer> uniqueNumbers = setSetWithUniqueNumbers(irrArr.length);
    protected static Iterator<Integer> iterator = uniqueNumbers.iterator();

    static int wrongAnswers = 0;
    static int setPossition = 0;


    public static void fillSecondThirdVerbALL() {
        Scanner scan = new Scanner(System.in);
        int progress = 0;
        double percentProgress = irregularVerbs.irregularVerbsArray.length;

        //loop it until progress == 100%
        while (progress != irrArr.length) {
            if (wrongAnswers == uniqueNumbers.size()) {
                resetWrongAnswers();
                setPossitionAtZero();
            } else {
                setPossition = iterator.next();
            }

            //1st form
            System.out.print(irrArr[setPossition][0]);

            //write 2nd form verb
            System.out.print(" ");
            String userInput1 = scan.next().trim();

            //write 3rd form verb
            System.out.print(" ");
            String userInput2 = scan.next().trim();

            //print 1st verb  then you need to fill 2nd and 3rd verb if they are equals to [?][1] and [?][2] progress++ and remove
            //this value from Set.
            if (userInput1.equalsIgnoreCase(irrArr[setPossition][1]) && userInput2.equalsIgnoreCase(irrArr[setPossition][2])) {
                System.out.println("Good Answer.");
                iterator.remove();
                progress++;

            } else {
                System.out.println("Not Good Answer.");
                wrongAnswers++;
            }

            //think about progress in % when method will start work
//            if(progress > 0) {
//                percentProgress = (progress / percentProgress) * 100;
//            }
//            System.out.println("Progress: " +percentProgress + "%");

        }
    }


    //this method print whole array (PL-version included)

    public static void printIrrArray() {
        System.out.println("I.F     II.F     III.F     PL" + '\n');

        for (int i = 0; i < irrArr.length; i++) {
            for (int j = 0; j < irrArr[i].length; j++) {
                System.out.print("[" + irrArr[i][j] + "]  ");
            }
            System.out.println();
        }
    }





    /*
    wrongAnswers = 0;
                iterator = uniqueNumbers.iterator();
                setPossition = iterator.next();
     */


    //test
    //print uniqueNumbers values
     /*Iterator<Integer> uniqIterator = uniqueNumbers.iterator();
        while(uniqIterator.hasNext()){
            System.out.println(uniqIterator.next());
        }
      */
    //html whole day//opajs


}


//if i want to get random indexes from irregularVerbsArray i need to put random indexes from
// irregularVerbsArray to new temporary one.