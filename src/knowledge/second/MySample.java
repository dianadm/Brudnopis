package knowledge.second;

public class MySample {

    /*
        Allows optional labels Allows break statement Allows continue statement
    if  Yes                     No                     No
    while Yes                   Yes                     Yes
    do while Yes                Yes                     Yes
    for Yes                     Yes                     Yes
    switch Yes                  Yes                     No
    */

    public static void main(String[] args) {

        LOOP_1: for (int i = 0; i < 5; i++) {
            System.out.println("i=" + i);
            LOOP_2: for (int j = 0; j < 5; j++) {
                System.out.println("j=" + j);
                if (i==j) continue LOOP_1;
            }
            System.out.println();
        }

    }
}
