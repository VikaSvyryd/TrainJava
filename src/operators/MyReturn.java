package operators;

public class MyReturn {
    public static void main(String[] args) {
        test();

        System.out.println("Into Main");
    }

    public static void test() {
        // Return - Виходить із методу !

        int[] array={1,4,2,3,5};

        for(int element : array) {
            if (element == 2) {
                return;
            }
            System.out.println(element);
        }

        System.out.println("Out of FOR");
    }

}
