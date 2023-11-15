package package1;

public class irregular_verbs {
    public static void main(String[] args) {
    }

    public static void print_irrArray(String irrArr[][]) {
        System.out.println("I.F  II.F  III.F  PL" + '\n');

        for (int i = 0; i < irrArr.length; i++) {
            for (int j = 0; j < irrArr[i].length; j++) {
                System.out.print(irrArr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static String[][] irregularVerbs = new String [41][4];

        static {

            irregularVerbs[0][0] = "be";
            irregularVerbs[0][1] = "was/were";
            irregularVerbs[0][2] = "been";
            irregularVerbs[0][3] = "być";

            irregularVerbs[1][0] = "become";
            irregularVerbs[1][1] = "became";
            irregularVerbs[1][2] = "become";
            irregularVerbs[1][3] = "stawać się";

            irregularVerbs[2][0] = "begin";
            irregularVerbs[2][1] = "began";
            irregularVerbs[2][2] = "begun";
            irregularVerbs[2][3] = "zaczynać";

            irregularVerbs[3][0] = "break";
            irregularVerbs[3][1] = "broke";
            irregularVerbs[3][2] = "broken";
            irregularVerbs[3][3] = "łamać";

            irregularVerbs[4][0] = "bring";
            irregularVerbs[4][1] = "brought";
            irregularVerbs[4][2] = "brought";
            irregularVerbs[4][3] = "przynosić";

            irregularVerbs[5][0] = "build";
            irregularVerbs[5][1] = "built";
            irregularVerbs[5][2] = "built";
            irregularVerbs[5][3] = "budować";

            irregularVerbs[6][0] = "buy";
            irregularVerbs[6][1] = "bought";
            irregularVerbs[6][2] = "bought";
            irregularVerbs[6][3] = "kupować";

            irregularVerbs[7][0] = "catch";
            irregularVerbs[7][1] = "cought";
            irregularVerbs[7][2] = "cought";
            irregularVerbs[7][3] = "łapać";

            irregularVerbs[8][0] = "choose";
            irregularVerbs[8][1] = "chose";
            irregularVerbs[8][2] = "chosen";
            irregularVerbs[8][3] = "wybierać";

            irregularVerbs[9][0] = "come";
            irregularVerbs[9][1] = "came";
            irregularVerbs[9][2] = "come";
            irregularVerbs[9][3] = "przyjść";

            irregularVerbs[10][0] = "cost";
            irregularVerbs[10][1] = "cost";
            irregularVerbs[10][2] = "cost";
            irregularVerbs[10][3] = "kosztować";

            irregularVerbs[11][0] = "cut";
            irregularVerbs[11][1] = "cut";
            irregularVerbs[11][2] = "cut";
            irregularVerbs[11][3] = "ciąć";

            irregularVerbs[12][0] = "do";
            irregularVerbs[12][1] = "did";
            irregularVerbs[12][2] = "done";
            irregularVerbs[12][3] = "robić";

            irregularVerbs[13][0] = "draw";
            irregularVerbs[13][1] = "drew";
            irregularVerbs[13][2] = "drawn";
            irregularVerbs[13][3] = "rysować";

            irregularVerbs[14][0] = "dream";
            irregularVerbs[14][1] = "dreamed/dremt";
            irregularVerbs[14][2] = "dreamed/dremt";
            irregularVerbs[14][3] = "śnić";

            irregularVerbs[15][0] = "drink";
            irregularVerbs[15][1] = "drank";
            irregularVerbs[15][2] = "drunk";
            irregularVerbs[15][3] = "pić";

            irregularVerbs[16][0] = "drive";
            irregularVerbs[16][1] = "drove";
            irregularVerbs[16][2] = "driven";
            irregularVerbs[16][3] = "prowadzić";

            irregularVerbs[17][0] = "eat";
            irregularVerbs[17][1] = "ate";
            irregularVerbs[17][2] = "eaten";
            irregularVerbs[17][3] = "jeść";

            irregularVerbs[18][0] = "fall";
            irregularVerbs[18][1] = "fell";
            irregularVerbs[18][2] = "fallen";
            irregularVerbs[18][3] = "padać";

            irregularVerbs[19][0] = "feel";
            irregularVerbs[19][1] = "felt";
            irregularVerbs[19][2] = "felt";
            irregularVerbs[19][3] = "czuć";

            irregularVerbs[20][0] = "find";
            irregularVerbs[20][1] = "found";
            irregularVerbs[20][2] = "found";
            irregularVerbs[20][3] = "znaleźć";

            irregularVerbs[21][0] = "fly";
            irregularVerbs[21][1] = "flew";
            irregularVerbs[21][2] = "flown";
            irregularVerbs[21][3] = "latać";

            irregularVerbs[22][0] = "get";
            irregularVerbs[22][1] = "got";
            irregularVerbs[22][2] = "got";
            irregularVerbs[22][3] = "dostawać";

            irregularVerbs[23][0] = "give";
            irregularVerbs[23][1] = "gave";
            irregularVerbs[23][2] = "given";
            irregularVerbs[23][3] = "dawać";

            irregularVerbs[24][0] = "go";
            irregularVerbs[24][1] = "went";
            irregularVerbs[24][2] = "gone";
            irregularVerbs[24][3] = "iść";

            irregularVerbs[25][0] = "grow";
            irregularVerbs[25][1] = "grew";
            irregularVerbs[25][2] = "grown";
            irregularVerbs[25][3] = "rosnąć";

            irregularVerbs[26][0] = "have";
            irregularVerbs[26][1] = "had";
            irregularVerbs[26][2] = "had";
            irregularVerbs[26][3] = "mieć";

            irregularVerbs[27][0] = "hear";
            irregularVerbs[27][1] = "heard";
            irregularVerbs[27][2] = "heard";
            irregularVerbs[27][3] = "słyszeć";

            irregularVerbs[28][0] = "hit";
            irregularVerbs[28][1] = "hit";
            irregularVerbs[28][2] = "hit";
            irregularVerbs[28][3] = "uderzać";

            irregularVerbs[29][0] = "hold";
            irregularVerbs[29][1] = "held";
            irregularVerbs[29][2] = "held";
            irregularVerbs[29][3] = "trzymać";

            irregularVerbs[30][0] = "hurt";
            irregularVerbs[30][1] = "hurt";
            irregularVerbs[30][2] = "hurt";
            irregularVerbs[30][3] = "ranić";

            irregularVerbs[31][0] = "keep";
            irregularVerbs[31][1] = "kept";
            irregularVerbs[31][2] = "kept";
            irregularVerbs[31][3] = "trzymać";

            irregularVerbs[32][0] = "know";
            irregularVerbs[32][1] = "knew";
            irregularVerbs[32][2] = "known";
            irregularVerbs[32][3] = "znać";

            irregularVerbs[33][0] = "learn";
            irregularVerbs[33][1] = "learned/learnt";
            irregularVerbs[33][2] = "learned/learnt";
            irregularVerbs[33][3] = "uczyć się";

            irregularVerbs[34][0] = "leave";
            irregularVerbs[34][1] = "left";
            irregularVerbs[34][2] = "left";
            irregularVerbs[34][3] = "opuszczać";

            irregularVerbs[35][0] = "lend";
            irregularVerbs[35][1] = "lent";
            irregularVerbs[35][2] = "lent";
            irregularVerbs[35][3] = "pożyczać";

            irregularVerbs[36][0] = "lose";
            irregularVerbs[36][1] = "lost";
            irregularVerbs[36][2] = "lost";
            irregularVerbs[36][3] = "tracić/zgubić";

            irregularVerbs[37][0] = "make";
            irregularVerbs[37][1] = "made";
            irregularVerbs[37][2] = "made";
            irregularVerbs[37][3] = "robić/wykonywać";

            irregularVerbs[38][0] = "mean";
            irregularVerbs[38][1] = "meant";
            irregularVerbs[38][2] = "meant";
            irregularVerbs[38][3] = "znaczyć/mieć na myśli";

            irregularVerbs[39][0] = "meet";
            irregularVerbs[39][1] = "met";
            irregularVerbs[39][2] = "met";
            irregularVerbs[39][3] = "spotykać/poznać";

            irregularVerbs[40][0] = "pay";
            irregularVerbs[40][1] = "paid";
            irregularVerbs[40][2] = "paid";
            irregularVerbs[40][3] = "płacić";
        }
    }

