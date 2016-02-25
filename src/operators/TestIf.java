package operators;

public class TestIf {

    public static void main(String[] args) {
       /* int i = 1;

        if (i == 1) {
            if (i > 0) {
                System.out.println("Text5");
            }
            System.out.println("Text1");
        } else if (i == 7) {
            System.out.println("Text2");
        } else {
            System.out.println("Text4");
        }

        System.out.println("Text3");*/


        String name = "Vika";
        String surname="Svyryd";

        switch (name) {
            case "Andr":
                               System.out.println("1");
                System.out.println("4");


                switch (surname) {
                    case "Ryda":
                        System.out.println("...");

                }

            case "Vika111":
                System.out.println("2");
                break;

            case "Vasa":
                System.out.println("3");

            default:
                System.out.println("def");
        }


        int f = 12;

        while (f != 12) {
            System.out.println("f");
        }

        do {
            System.out.println("f");
        } while (f == 12);



    }

}
