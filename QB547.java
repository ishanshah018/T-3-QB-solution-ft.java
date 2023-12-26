//QB547
//Here we use two method in first we had done addition and for second method we had perform swapping 
import java.util.*;

class Ex1 {
    int a = 5, b = 2;// Two variables are accesseed
    int add;

    public static void main(String[] args) {
        Ex1 ab = new Ex1();
        ab.sum();
        ab.swap();
    }

    void sum() {
        add = a + b;
        System.out.println("Addition of a and b is" + add);
    }

    void swap() {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("The value of a is" + a);
        System.out.println("The value of b is" + b);
    }
}
