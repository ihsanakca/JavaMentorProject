package day10_IfandLoopsPractice;

public class C02_TersUcgen {
    public static void main(String[] args) {
        /*
        ********
        *******
        ******
        *****
        ****
        ***
        **
        *
         */

        for (int i=8; i>=1;i--){
            for (int j = 1; j <(i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
