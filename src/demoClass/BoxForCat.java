package demoClass;

public class BoxForCat {
    public static void main (String[] args){

        Box forCat = new Box();
        Box forDog = new Box();

        //Cat's box parameters
        forCat.width=10;
        forCat.height=20;
        forCat.depth=30;

        //Dog's box parameters
        forDog.depth=20;
        forDog.height=40;
        forDog.width=60;

        //Counting volume of the objects
            forCat.volume();
            forDog.volume();

    }

}
