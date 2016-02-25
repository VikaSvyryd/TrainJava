//The simplest math. operation demonstration
package operations;

public class MyMathOper {
    public static void main (String [] args) {
        int a=10;
        int b=25;

        System.out.println("a equals "+a);
        System.out.println("b equals "+b);

        int c=a+b; //addition demo
        System.out.println("c equals " +c);

        int d=a-b; //subtraction demo
        System.out.println("d equals " +d);

        int e=a*b;//multiplication demo
        System.out.println("e equals " + e);

        int f=a/5; //partition demo
        System.out.println("f equals " +f);

        int g=a%b; // modulus demo
        System.out.println("g equals " + g);

        int h=7;
        h+=5; // h=h+5 demo
        System.out.println("h equals " + h);

        int i=13;
        i-=a; // i=i-a demo
        System.out.println("i equals " + i);

        int j=a;
        j*=a; //j=j*a demo
        System.out.println("j eqals " + j);

        int k=b;
        k/=a; // k= k/b
        System.out.println("k equals " + k);

        int l=11; //l=11+1
        System.out.print("l equals ");
        System.out.println(++l);

        int m=15; // m=15-1
        System.out.print("m equals ");
        System.out.println(m++);

        int p=a;
        System.out.print("p equals ");
        System.out.println(--p);

        int q=b;
        System.out.print("q equals ");
        System.out.println(q--);

        int n=a;
        n=-a;
        System.out.println("n equals " +n);
   }
}
