//QB 640

class Main {
    public static void main(String[] args) {

        Ref ab = new Ref();
        ab.set(10, 20);
        System.out.println("Before Swapping\n Value of a: " + ab.a + " & b: " + ab.b);

        ab.swapvalue(ab);
        System.out.println("After Swapping \n Value of a: " + ab.a + " & b: " + ab.b);

    }
}

class Ref {
    int a, b;

    void set(int x, int y) {
        a = x;
        b = y;
    }

    void swapvalue(Ref obj) {

        int temp;
        temp = obj.a;
        obj.a = obj.b;
        obj.b = temp;

    }
}
