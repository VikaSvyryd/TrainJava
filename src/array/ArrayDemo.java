// Simple two-dimension array demonstration
package array;

public class ArrayDemo {
    public static void main (String args []) {

        int array [][]={{10, 9, 8, 7, 6,},{5, 4, 3, 2, 1}};
        int a, b;

        for(a=0; a<2; a++) {
            System.out.println("Row number " + a);

                for (b = 0; b < 5; b++){
                    System.out.print(array[a][b] + " ");
                }
            System.out.println();
        }

    }
}
