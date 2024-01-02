//QB 639

//Swapping using (call by value)
import java.util.Scanner;

class Ex1 {
    public static void main(String args[]) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        x = sc.nextInt();
        System.out.print("Enter the second number: ");
        y = sc.nextInt();
        System.out.println("Before swapping\nx = " + x + "\ny = " + y);

        Ex1 s = new Ex1();
        s.swap(x, y);

    }

    void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swapping \nx = " + a + "\ny = " + b);

    }
}
