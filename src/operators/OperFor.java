package operators;

public class OperFor {
    public static void main(String[] args) {

        //Simple for demo
        for (int n = 10; n >= 0; n--)// "n" is inside FOR cycle
        {
            System.out.println(n); // all numbers from 10 to 0 in a row
        }


        // Finding out a prime number

        int num = 17;
        boolean isPrime = true;

        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0) {
                isPrime = true;
            } else {
                isPrime = false;
            }
            break;
        }

        if (isPrime) {
            System.out.println("It's a prime number.");
        } else {
            System.out.println("It's not a prime number.");
        }


        //Usage of some "," if FOR cycle

        int a, b;

        for (a = 1, b = 4; a < b; a++, b--) {
            System.out.println("a= " + a);
            System.out.println("b= " + b);
        }

// Iteration and Initialisation parts' absence
        int l = 0;
        boolean done = false;

        for (; !done; ) {
            System.out.println("l equals " + l);
            if (l == 10) {
                done = true;
            }
            l++;
        }


//"For-each" demo

        int nums[] = {17, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
      /*  int q = 0;*/
        for (int element : nums) {
            System.out.println(element);
            sum = sum + element;
        }


        /*for (q = 0; q < 10; q++) {
            System.out.println(" " + nums[q]);
            sum += nums[q];
        }*/

       /* System.out.println("The sum is " + sum);*/


        //Break demo


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



// Modified FOR
        int collection[] = {4, 5, 2, 5, 6, 8, 7, 6, 4};
        int val = 8;
        boolean find = false;

        for (int c : collection) {
            if (c == val) {
                find = true;
                break;
            }
        }
        if (find) {
            System.out.println("We've founded it - number " + val);
        }


// For-in-For
        int f, p;
        for (f = 0; f < 10; f++){
            for (p = f; p < 10; p++)
        System.out.print("*");
        System.out.println();
        }
    }
}