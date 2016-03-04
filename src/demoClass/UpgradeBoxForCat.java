package demoClass;

public class UpgradeBoxForCat {
    public static void main(String[] args) {

        Box newForCat = new Box();
        Box newForDog = new Box();
        int vol;

        newForCat.width = 24;
        newForCat.depth = 56;
        newForCat.height = 45;

        newForDog.depth = 98;
        newForDog.height = 55;
        newForDog.width = 34;

        vol = newForCat.volume();
            System.out.println("The volume of a cat's box is " + vol);
        //System.out.printl("The volume of a cat's box is " + NewForCat.volume());


        vol = newForDog.volume();
            System.out.println("The volume of dog's box is " + vol);
    }
}
