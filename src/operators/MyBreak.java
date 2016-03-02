package operators;

public class MyBreak {
    public static void main(String[] args) {
        int j, s;

        for (j = 0, s = 0; j < 100; s++) {
            j=s*10;
            if (j == 50){
                break;
            }
            System.out.println("j = " + j + " s = " + s);
        }
        System.out.println("Break will work if j = " + j + " and  s will be= " + s);
    }
}



/*

    {

        // Break - Перериває виконання циклу тобто повністю виходить із циклу !




        int[] array={1,4,2,3,5};

        for(int element : array) {
            if (element == 5) {
                break;
            }
            System.out.println(element);
        }

        System.out.println("Out of FOR");
    }
}
*/
