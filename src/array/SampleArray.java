package array;

public class SampleArray {

    public static void main(String args []) {
        int[][] array = {
                            {1, 2, 10},
                            {3, 4, 5}
                        };

        int i;
        int k;

        for (i = 0; i < 2; i++) {
            System.out.println("Row - " + i);

            for (k = 0; k < 3; k++) {
                System.out.print(array[i][k] + " | ");
            }

            System.out.println();
        }


    }


}
