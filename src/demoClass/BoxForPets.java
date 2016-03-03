package demoClass;

public class BoxForPets {
    public static void main(String[] args) {

        Box forPets1 = new Box();
        Box forPets2 = new Box();
        int vol;

        //Every exemplar of class initialization
        forPets1.setDimentions(23, 56, 78);
        forPets2.setDimentions(34, 77, 23);

        //Volume of the objects
        vol = forPets1.volume();
        System.out.println("An optimal volume for the cat's box is " + vol);

        vol = forPets2.volume();
        System.out.println("An optimal volume for the dog's box is " + vol);

    }
}
