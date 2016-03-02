package operators;

public class myContinue {
    public static void main(String[] args) {

        // Continue - перериває виконання ітерації циклу і йде на наступну ітерацію циклу !

        int k;
        int i = 0;

        for (k = 0; k < 10; i++ ) {
            k = i * 2;
            if (k == 4) {
                continue;
            }

            System.out.println("k = " + k + " i = " +i);
        }


        /*int[] array={1,4,2,3,5};

        for(int element : array) {
            if (element == 2) {
                continue;
            }
            System.out.println(element);
        }

        System.out.println("Out of FOR");*/
    }
}
