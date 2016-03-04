//This class uses constructor.

package demoClass;

public class ConstrForCatDod {

    public static void main(String[] args) {

        constrBoxDemo Pet1 = new constrBoxDemo(56, 78, 98);
        constrBoxDemo Pet2 = new constrBoxDemo(34, 54, 78);
        int vol;

        vol = Pet1.volume();
        System.out.println("The volume of a cat's box is" + vol);

        vol = Pet2.volume();
        System.out.println("The volume of a dog's box is " + vol);

    }
}