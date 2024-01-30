package application;

import jdk.dynalink.Operation;
import operations.Methods;
import operations.irregularVerbs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static operations.irregularVerbs.*;

public class test {
    public static void main(String[] args) {

//        System.out.println(irregularVerbsArray[0][1]);

        Scanner scan = new Scanner(System.in);
        String[] poprawnaOdp = irregularVerbsArray[0][1].trim().split("/");

        System.out.println(Arrays.toString(poprawnaOdp));

        String userAnswer = scan.next();


        //jak rozdzielic was/were
        for (String poprawna : poprawnaOdp) {
            if (poprawna.trim().equals(userAnswer)) {
                System.out.println("good");
                break;
            }
        }


//        Set<Integer> razdwatrzy = new LinkedHashSet<>();
//
//        while(razdwatrzy.size() < 10){
//            Random rnd = new Random();
//            int randomNr = rnd.nextInt(10);
//            razdwatrzy.add(randomNr);
//        }
//
//        Iterator<Integer> iterator = razdwatrzy.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

    }
}

