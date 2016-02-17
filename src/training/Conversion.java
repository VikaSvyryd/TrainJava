package training;

public class Conversion {
    public static void main (String args []){
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nConversion from int to byte type.");
        b=(byte) i;
        System.out.println("i and b "+i+" "+b);

        System.out.println("\nConversion from double to int type");
        i=(int) d;
        System.out.println("d and i "+d+" "+i);

        System.out.println("\nConversion from double to byte");
        b= (byte)d;
        System.out.println("d and b "+d+" "+b);
    }
}
