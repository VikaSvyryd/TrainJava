package demoClass;

class Test {

    // �������� ����� � ��������� � ������������ ���� �� �����
    final int a = 10;

    /* ����� �������� ������ �� ����� b ��� ��������� ����� ����� ����� (����� ��� Test obj = new Test(); obj.b)
        �������� ������ ����� �������� ��� Test.b
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
