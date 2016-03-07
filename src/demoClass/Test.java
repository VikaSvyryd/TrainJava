package demoClass;

class Test {

    // Значення змінної є фінальним і переприсвоїти його не можна
    final int a = 10;

    /* Можна отримати доступ до змінної b без створення обєкту цього класу (тобто без Test obj = new Test(); obj.b)
        натомість доступ можна отримати так Test.b
    */
    public static int b;

    private int c;

    void setC (int i){
        c = i;
    }

    int getC(){
        return c;
    }
}
