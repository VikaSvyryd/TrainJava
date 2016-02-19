package array;

public class AverageNumber {
    public static void main (String args[]) {
        double numbers[] = { 10.2, 11.3, 12.1, 13.5, 14.6 };
        double result = 0;
        int i;

        for(i=0; i<5; i++) {
            result = result + numbers[i];
            System.out.println("V");
            System.out.println("V");
            System.out.println("V");
            System.out.println("V");
        }

        if (true) {
            System.out.println("V");
            System.out.println("V");
            System.out.println("V");
            System.out.println("V");
        }


        System.out.println("The average number equals "+ result/5);

    }
}
