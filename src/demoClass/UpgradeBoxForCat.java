package demoClass;

public class UpgradeBoxForCat {
    public static void main(String[] args) {

        Box NewForCat = new Box();
        Box NewForDog = new Box();
        int vol;

        NewForCat.width = 24;
        NewForCat.depth = 56;
        NewForCat.height = 45;

        NewForDog.depth = 98;
        NewForDog.height = 55;
        NewForDog.width = 34;

        vol = NewForCat.volume();
            System.out.println("The volume of a cat's box is " + vol);
        //System.out.printl("The volume of a cat's box is " + NewForCat.volume());


        vol = NewForDog.volume();
            System.out.println("The volume of dog's box is " + vol);
    }
}
