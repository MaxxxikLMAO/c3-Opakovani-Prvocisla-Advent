import java.util.Scanner;

public class Opakovani1 {
    
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 0;
        String prvocisla = "";

        System.out.println("Zadej cislo: ");
        int cislo = sc.nextInt();

        if(cislo % 7 == 0) {
            System.out.println("Toto cislo je delitelne sedmi. ");
        } else {
            System.out.println("Toto cislo neni delitelne sedmi. ");
        }

        for(i = 1; i <= 100; i++) {
            int counter = 0;
            for(num = i; num >= 1; num--) {
                if(i % num == 0) {
                    counter = counter + 1;
                }
            }
            if(counter == 2) {
                prvocisla = prvocisla + i + " ";
            }
        }
        System.out.println("Cisla od 1 do sta jsou: ");
        System.out.println(prvocisla);

        String WhtDoTheNumbersMeanMason = "78207\n" +
                "89869\n" +
                "145449\n" +
                "73634\n" +
                "78681\n" +
                "81375\n" +
                "131482\n" +
                "126998\n" +
                "50801\n" +
                "115839\n" +
                "77949\n" +
                "53203\n" +
                "146099\n" +
                "56912\n" +
                "59925\n" +
                "132631\n" +
                "115087\n" +
                "89543\n" +
                "123234\n" +
                "108110\n" +
                "109873\n" +
                "81923\n" +
                "124264\n" +
                "87981\n" +
                "106554\n" +
                "147239\n" +
                "73615\n" +
                "72609\n" +
                "129684\n" +
                "84175\n" +
                "64915\n" +
                "98124\n" +
                "74391\n" +
                "55211\n" +
                "120961\n" +
                "119116\n" +
                "148275\n" +
                "89605\n" +
                "115986\n" +
                "120547\n" +
                "50299\n" +
                "137922\n" +
                "78906\n" +
                "145216\n" +
                "80424\n" +
                "122610\n" +
                "61408\n" +
                "97573\n" +
                "127533\n" +
                "116820\n" +
                "76068\n" +
                "77400\n" +
                "117943\n" +
                "85231\n" +
                "102442\n" +
                "62002\n" +
                "58761\n" +
                "56479\n" +
                "98200\n" +
                "85971\n" +
                "73985\n" +
                "88908\n" +
                "82719\n" +
                "120604\n" +
                "83378\n" +
                "88241\n" +
                "122574\n" +
                "76731\n" +
                "99810\n" +
                "137548\n" +
                "102617\n" +
                "105352\n" +
                "137585\n" +
                "83238\n" +
                "118817\n" +
                "149419\n" +
                "107629\n" +
                "63893\n" +
                "56049\n" +
                "70693\n" +
                "83844\n" +
                "76413\n" +
                "87021\n" +
                "90259\n" +
                "124289\n" +
                "102527\n" +
                "139625\n" +
                "106607\n" +
                "120241\n" +
                "101098\n" +
                "66142\n" +
                "96591\n" +
                "82277\n" +
                "142297\n" +
                "116671\n" +
                "131881\n" +
                "94861\n" +
                "79741\n" +
                "73561\n" +
                "115214";



    }

}
