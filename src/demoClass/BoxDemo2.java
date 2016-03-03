package demoClass;

public class BoxDemo2 {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        int vol1;
        int vol2;

    //Box for a kitty
        mybox1.width = 11;
        mybox1.height = 12;
        mybox1.depth = 13;

    //Box for a puppy
        mybox2.depth = 15;
        mybox2.width = 16;
        mybox2.height = 17;

    //Counting of the two boxes' volume
        vol1 = mybox1.depth * mybox1.height * mybox1.width;
        System.out.println("The volume of a kitty box is " + vol1 + ".");

        vol2 = mybox2.depth * mybox2.height * mybox2.width;
        System.out.println("The volume of a puppy box is " + vol2 + ".");

    }
}