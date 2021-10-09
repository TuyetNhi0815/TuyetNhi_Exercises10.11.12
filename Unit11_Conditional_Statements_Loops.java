package Exercise;

public class Unit11_Conditional_Statements_Loops {
    public static void main(String[] args) {
        //01. for 1->20, value==8 -> break
/*        for (int i = 1; i <= 20; i++) {
            if (i == 8) {
                break;
            }
            System.out.println(i);
        }*/
        //02. while 1->100, value==80 -> break
/*        int i = 1;
        do {
            System.out.println(i);
            if (i == 80) {
                break;
            }
            i++;
        }
        while (i <= 100);*/
        //03. forA 1->10, forB 1->30, forB's value == 4 -> break forB
/*        A: for (int i = 1; i <= 10; i++) {
            B: for (int j = 1; j <= 30; j++) {
                if (j == 4) {
                    break B;
                }
                System.out.println(i + "  " + j);
            }
        }*/
        //04. for continue if value == 5
/*        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }*/
        //05. while continue if value == 5
/*        int i = 1;
        do {
            System.out.println(i);
            if (i == 5) {
                continue;
            }
            i++;
        }
        while (i <= 10);
    }*/
        //06. while 1->100, value==80 -> break
/*        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                continue;
            }
        }*/
    }
}
