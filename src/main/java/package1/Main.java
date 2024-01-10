package package1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("""
                Hello!:)
                Choose what kind version of irregular verbs you are interested:
                
                1. Show me all irregular verbs with translation (PL)
                2. Let's test myself and fill missing irregular verbs in 2nd and 3rd form.
                """);

        int chooseMethd = scan.nextInt();

        switch (chooseMethd) {
            case 1 -> Methods.printIrrArray((irregularVerbs.irregularVerbsArray));
            case 2 -> Methods.fillSecondThirdVerbALL();
            //case 3 -> method that allow user to choose how many irregularVerbs he want try
        }

    }
}
//NOTE: finished all homework tasks. +lesson from web

//Methods.printIrrArray(irregularVerbs.irregularVerbsArray);

