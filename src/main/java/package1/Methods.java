package package1;

import java.util.*;

public class Methods {

   static String[][] irrArr = irregular_verbs.irregularVerbsArray;

    public static void fillSecondThirdVerbALL(){
        Scanner scan = new Scanner(System.in);
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();

        Random rnd = new Random();


        //add to Set unique numbers
        while(uniqueNumbers.size() < irrArr.length){
            int randomNumber = rnd.nextInt(irrArr.length);
            uniqueNumbers.add(randomNumber);
        }

        Iterator<Integer> iterator = uniqueNumbers.iterator();

        int progress = 0;

        //loop it until progress == 100%
        while(progress < irrArr.length){
            int valueOfSet = iterator.next();
            System.out.println(irrArr[valueOfSet][0]);

            //print 1st verb  then you need to fill 2nd and 3rd verb if they are equals to [?][1] and [?][2] progress++ and remove
            //this value from Set.
            
            if(scan.next().equalsIgnoreCase(irrArr[valueOfSet][1]) && scan.next().equalsIgnoreCase(irrArr[valueOfSet][2])){
                System.out.println("good");
                iterator.remove();
                progress++;
                break;

            }else{
                System.out.println("not okey");
            }
            break;
        }


        //test
        //print uniqueNumbers values
     /*Iterator<Integer> uniqIterator = uniqueNumbers.iterator();
        while(uniqIterator.hasNext()){
            System.out.println(uniqIterator.next());
        }
      */



        }
    }


//if i want to get random indexes from irregularVerbsArray i need to put random indexes from
// irregularVerbsArray to new temporary one.