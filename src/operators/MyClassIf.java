package operators;

public class MyClassIf {
    public static void main(String[] args) {

        // Simple If demo
        int a = 102;

        if (a < 100) {
            a = (a / 2);
        } else {
            a = (a * 2);
        }

        System.out.println("a= " + a);


//If in If
        int age = 40;
        int weight = 60;
        double index;
        if (age <= 30) {
            if (weight <= 65) {
                index = age/weight;
                System.out.println("Your body index is " + index);
            }

        } else {
                System.out.println("Enter correct parameters.");
        }

//If-else-if-else...


    }
}

