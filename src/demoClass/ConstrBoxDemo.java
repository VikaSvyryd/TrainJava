//Constructor for class ConstrForCatDog
package demoClass;

class constrBoxDemo {
    int width;
    int depth;
    int height;

//This is a constructor for the class
    constrBoxDemo(int w, int h, int d) {
        width = w;
        depth = d;
        height = h;
    }
    //Counting and returning a volume of an object
    int volume(){
            return width * depth * height;
        }
}

