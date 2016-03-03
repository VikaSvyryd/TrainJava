package demoClass;

class Box {
    int width;
    int depth;
    int height;
    //Counting object's volume. Use in BoxDemo2.java, BoxForCat.java
    /*void volume(){
        System.out.print("The volume is ");
        System.out.println(width * depth * height);*/

    //counting and RETURN
    int volume(){
        return width * height * depth;
    }
    //sizes of boxes
    void setDimentions(int w, int h, int d){
        width = w;
        height = h;
        depth = d;
    }
}


class BoxDemo {
    public static void main(String[] args) {
        Box catbox = new Box();
        int volume;

        catbox.width = 10;
        catbox.height = 20;
        catbox.depth = 30;

        volume = catbox.depth * catbox.height * catbox.width;

        System.out.println( "The volume of the box is " + volume );
    }
}