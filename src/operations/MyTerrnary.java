//ternary operation demo
package operations;
public class MyTerrnary {
    public static void main (String [] args){
        int i = 20;
        int k;

        k = i<=20 ? (i*20) : ++i;
        {
            System.out.println("i=" + i + " k=" + k);
        }
//Demo of the same operator
        if (k>399) i= -20;
                else k =  -20;
        {
            System.out.println("i= " +i+ " k= "+k);
        }
    }
}
