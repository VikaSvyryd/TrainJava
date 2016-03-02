//Demo of WHILE
package operators;

public class OperWhile {
    public static void main(String[] args) {
        int i = 10;

        while (i<=10 & i>0) {
            System.out.println(i);
            i--;
        }

        //While operator with empty body

        int j=100;
        int k=200;

        while (++j < --k);
        System.out.println("the middle number is " +j);

    // Do-While demo

        int m =25;
        do {
            System.out.println(+m);
            m--;
        }
        while (m>0);

        //The same case

        int s = 13;
        do {
            System.out.println(s);
        } while (--s >0);

    }
}

