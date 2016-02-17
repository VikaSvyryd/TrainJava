package training;

public class BoolTrain {
    public static void main (String args []){
        boolean b;

        b=false;
        System.out.println("b equals "+b);

        b=true;
        System.out.println("b equals "+b);

        if(b) System.out.println("It works.");

        b=false;
        if (b) System.out.println("It doesen't work");

        System.out.println("10>9 equals"+ (10>9));
    }
}
