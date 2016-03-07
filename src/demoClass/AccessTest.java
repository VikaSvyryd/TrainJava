package demoClass;

public class AccessTest {
    public static void main(String[] args) {
        Test obj = new Test();
        Test obj2 = new Test();

//        obj.a = 10;

        obj.b = 20;
        obj2.b = 30;

        Test.b = 50;


        //obj.c = 100;

       obj.setC(100);

        System.out.println ("a =" + obj.a + " b = " + obj.b + " c = " + obj.getC());

    }
}
