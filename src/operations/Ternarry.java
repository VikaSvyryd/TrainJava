package operations;

public class Ternarry {
    public static void main (String args[]){
        int i,k;
        i=10;
        k = i<0 ? -i : i; // getting max i
        System.out.print("Maximum");
        System.out.println(i + "maximum" +k);

        i=-10;
        k = i<0 ? i : i; //getting max o\i
        k = i<0 ? -i : i; // getting max i
        System.out.print("Maximum");
        System.out.println(i + "maximum" +k);
    }
}
