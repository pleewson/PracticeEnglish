package operations;

public class irregularVerbs {
    protected static String[][] irregularVerbsArray = new String [2][4];
    //if you comment array indexes change value of array[] above

        static {

            irregularVerbsArray[0][0] = "be";
            irregularVerbsArray[0][1] = "was/were";
            irregularVerbsArray[0][2] = "been";
            irregularVerbsArray[0][3] = "być";

            irregularVerbsArray[1][0] = "become";
            irregularVerbsArray[1][1] = "became";
            irregularVerbsArray[1][2] = "become";
            irregularVerbsArray[1][3] = "stawać się";

//            irregularVerbsArray[2][0] = "begin";
//            irregularVerbsArray[2][1] = "began";
//            irregularVerbsArray[2][2] = "begun";
//            irregularVerbsArray[2][3] = "zaczynać";

           /* irregularVerbsArray[3][0] = "break";
            irregularVerbsArray[3][1] = "broke";
            irregularVerbsArray[3][2] = "broken";
            irregularVerbsArray[3][3] = "łamać";

            irregularVerbsArray[4][0] = "bring";
            irregularVerbsArray[4][1] = "brought";
            irregularVerbsArray[4][2] = "brought";
            irregularVerbsArray[4][3] = "przynosić";

            irregularVerbsArray[5][0] = "build";
            irregularVerbsArray[5][1] = "built";
            irregularVerbsArray[5][2] = "built";
            irregularVerbsArray[5][3] = "budować";

            irregularVerbsArray[6][0] = "buy";
            irregularVerbsArray[6][1] = "bought";
            irregularVerbsArray[6][2] = "bought";
            irregularVerbsArray[6][3] = "kupować";

            irregularVerbsArray[7][0] = "catch";
            irregularVerbsArray[7][1] = "cought";
            irregularVerbsArray[7][2] = "cought";
            irregularVerbsArray[7][3] = "łapać";

            irregularVerbsArray[8][0] = "choose";
            irregularVerbsArray[8][1] = "chose";
            irregularVerbsArray[8][2] = "chosen";
            irregularVerbsArray[8][3] = "wybierać";

            irregularVerbsArray[9][0] = "come";
            irregularVerbsArray[9][1] = "came";
            irregularVerbsArray[9][2] = "come";
            irregularVerbsArray[9][3] = "przyjść";

            irregularVerbsArray[10][0] = "cost";
            irregularVerbsArray[10][1] = "cost";
            irregularVerbsArray[10][2] = "cost";
            irregularVerbsArray[10][3] = "kosztować";

            irregularVerbsArray[11][0] = "cut";
            irregularVerbsArray[11][1] = "cut";
            irregularVerbsArray[11][2] = "cut";
            irregularVerbsArray[11][3] = "ciąć";

            irregularVerbsArray[12][0] = "do";
            irregularVerbsArray[12][1] = "did";
            irregularVerbsArray[12][2] = "done";
            irregularVerbsArray[12][3] = "robić";

            irregularVerbsArray[13][0] = "draw";
            irregularVerbsArray[13][1] = "drew";
            irregularVerbsArray[13][2] = "drawn";
            irregularVerbsArray[13][3] = "rysować";

            irregularVerbsArray[14][0] = "dream";
            irregularVerbsArray[14][1] = "dreamed/dremt";
            irregularVerbsArray[14][2] = "dreamed/dremt";
            irregularVerbsArray[14][3] = "śnić";

            irregularVerbsArray[15][0] = "drink";
            irregularVerbsArray[15][1] = "drank";
            irregularVerbsArray[15][2] = "drunk";
            irregularVerbsArray[15][3] = "pić";

            irregularVerbsArray[16][0] = "drive";
            irregularVerbsArray[16][1] = "drove";
            irregularVerbsArray[16][2] = "driven";
            irregularVerbsArray[16][3] = "prowadzić";

            irregularVerbsArray[17][0] = "eat";
            irregularVerbsArray[17][1] = "ate";
            irregularVerbsArray[17][2] = "eaten";
            irregularVerbsArray[17][3] = "jeść";

            irregularVerbsArray[18][0] = "fall";
            irregularVerbsArray[18][1] = "fell";
            irregularVerbsArray[18][2] = "fallen";
            irregularVerbsArray[18][3] = "padać";

            irregularVerbsArray[19][0] = "feel";
            irregularVerbsArray[19][1] = "felt";
            irregularVerbsArray[19][2] = "felt";
            irregularVerbsArray[19][3] = "czuć";

            irregularVerbsArray[20][0] = "find";
            irregularVerbsArray[20][1] = "found";
            irregularVerbsArray[20][2] = "found";
            irregularVerbsArray[20][3] = "znaleźć";

            irregularVerbsArray[21][0] = "fly";
            irregularVerbsArray[21][1] = "flew";
            irregularVerbsArray[21][2] = "flown";
            irregularVerbsArray[21][3] = "latać";

            irregularVerbsArray[22][0] = "get";
            irregularVerbsArray[22][1] = "got";
            irregularVerbsArray[22][2] = "got";
            irregularVerbsArray[22][3] = "dostawać";

            irregularVerbsArray[23][0] = "give";
            irregularVerbsArray[23][1] = "gave";
            irregularVerbsArray[23][2] = "given";
            irregularVerbsArray[23][3] = "dawać";

            irregularVerbsArray[24][0] = "go";
            irregularVerbsArray[24][1] = "went";
            irregularVerbsArray[24][2] = "gone";
            irregularVerbsArray[24][3] = "iść";

            irregularVerbsArray[25][0] = "grow";
            irregularVerbsArray[25][1] = "grew";
            irregularVerbsArray[25][2] = "grown";
            irregularVerbsArray[25][3] = "rosnąć";

            irregularVerbsArray[26][0] = "have";
            irregularVerbsArray[26][1] = "had";
            irregularVerbsArray[26][2] = "had";
            irregularVerbsArray[26][3] = "mieć";

            irregularVerbsArray[27][0] = "hear";
            irregularVerbsArray[27][1] = "heard";
            irregularVerbsArray[27][2] = "heard";
            irregularVerbsArray[27][3] = "słyszeć";

            irregularVerbsArray[28][0] = "hit";
            irregularVerbsArray[28][1] = "hit";
            irregularVerbsArray[28][2] = "hit";
            irregularVerbsArray[28][3] = "uderzać";

            irregularVerbsArray[29][0] = "hold";
            irregularVerbsArray[29][1] = "held";
            irregularVerbsArray[29][2] = "held";
            irregularVerbsArray[29][3] = "trzymać";

            irregularVerbsArray[30][0] = "hurt";
            irregularVerbsArray[30][1] = "hurt";
            irregularVerbsArray[30][2] = "hurt";
            irregularVerbsArray[30][3] = "ranić";

            irregularVerbsArray[31][0] = "keep";
            irregularVerbsArray[31][1] = "kept";
            irregularVerbsArray[31][2] = "kept";
            irregularVerbsArray[31][3] = "trzymać";

            irregularVerbsArray[32][0] = "know";
            irregularVerbsArray[32][1] = "knew";
            irregularVerbsArray[32][2] = "known";
            irregularVerbsArray[32][3] = "znać";

            irregularVerbsArray[33][0] = "learn";
            irregularVerbsArray[33][1] = "learned/learnt";
            irregularVerbsArray[33][2] = "learned/learnt";
            irregularVerbsArray[33][3] = "uczyć się";

            irregularVerbsArray[34][0] = "leave";
            irregularVerbsArray[34][1] = "left";
            irregularVerbsArray[34][2] = "left";
            irregularVerbsArray[34][3] = "opuszczać";

            irregularVerbsArray[35][0] = "lend";
            irregularVerbsArray[35][1] = "lent";
            irregularVerbsArray[35][2] = "lent";
            irregularVerbsArray[35][3] = "pożyczać";

            irregularVerbsArray[36][0] = "lose";
            irregularVerbsArray[36][1] = "lost";
            irregularVerbsArray[36][2] = "lost";
            irregularVerbsArray[36][3] = "tracić/zgubić";

            irregularVerbsArray[37][0] = "make";
            irregularVerbsArray[37][1] = "made";
            irregularVerbsArray[37][2] = "made";
            irregularVerbsArray[37][3] = "robić/wykonywać";

            irregularVerbsArray[38][0] = "mean";
            irregularVerbsArray[38][1] = "meant";
            irregularVerbsArray[38][2] = "meant";
            irregularVerbsArray[38][3] = "znaczyć/mieć na myśli";

            irregularVerbsArray[39][0] = "meet";
            irregularVerbsArray[39][1] = "met";
            irregularVerbsArray[39][2] = "met";
            irregularVerbsArray[39][3] = "spotykać/poznać";

            irregularVerbsArray[40][0] = "pay";
            irregularVerbsArray[40][1] = "paid";
            irregularVerbsArray[40][2] = "paid";
            irregularVerbsArray[40][3] = "płacić";

            */
        }
    }

