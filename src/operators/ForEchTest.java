package operators;

public class ForEchTest {
    public static void main(String[] args) {

        int numbers[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int summ = 0;
        int count = 0;

        for (int u : numbers) {
            System.out.println("Element " + u);
            summ = summ + u;

            count++;

            if (count == 3) {
                    break;
            }
        }

        System.out.println("summ = " + summ);

    /*    String names[] = {"two", "four", "ten"};

        for (String name : names) {
            System.out.println(name);
        }*/

    }
}
