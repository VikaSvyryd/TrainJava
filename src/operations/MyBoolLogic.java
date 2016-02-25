package operations;

public class MyBoolLogic {
    public static void main (String [] args){
        boolean a=true;
        boolean b=false;
        boolean c=true;
        boolean d=false;
//OR demo
        System.out.println("OR demo ");
        System.out.println(a|b); //true|false=true
        System.out.println(a|c);//true|true=true
        System.out.println(b|a);//false|true=true
        System.out.println(b|d);//false|false=false

//AND demo
        System.out.println("AND demo ");
        System.out.println(a&b);//true&false=false
        System.out.println(a & c);//true&true=true
        System.out.println(b & a);//false&true=false
        System.out.println(b&d);//false&false=false

//^ (XOR) demo
        System.out.println("XOR demo ");
        System.out.println(a^b);//true^false=true
        System.out.println(a^c);//true^true=false
        System.out.println(b^a);//false^true=true
        System.out.println(b^d);//false^false=false


// && demo
        System.out.println("&& demo ");
        System.out.println(a&&b);//true&&true=false
        System.out.println(a&&c);//true&&false=true
        System.out.println(b&&a);//false&&true=false
        System.out.println(b&&d);//false&&false=false

//|| demo
        System.out.println("|| demo ");
        System.out.println(a||b); //true||false=true
        System.out.println(a||c);//true||true=true
        System.out.println(b||a);// false||true=true
        System.out.println(b||d);//false||false=false

    }
}
