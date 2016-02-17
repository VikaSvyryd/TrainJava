package training;

public class IfSample {
    public static void main (String args[]){
        int x, y;
        x=10;
        y=20;
        if (x<y) System.out.println ("x less than y");

        x=x*2;
        if (x==y) System.out.println ("now x equals y");

        x=x*2;
        if (x>y) System.out.println("x more than y");

        //Цей оператор нічого не відображатиме
        if (x==y) System.out.println("You'll see nothing");
    }
}
