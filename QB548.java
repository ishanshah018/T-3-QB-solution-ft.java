//QB548
import java.util.*;

class run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex1 ab = new Ex1();
        ab.add();

        System.out.println("Subtraction");
        System.out.println("Enter a");
        int x = sc.nextInt();
        System.out.println("Enter b");
        int y = sc.nextInt();
        Ex1 pq = new Ex1();
        pq.sub(x, y);

        int ans = ab.multi();
        System.out.println("Multiplication is: " + ans);

        System.out.println("Division");
        System.out.println("Enter a");
        int m = sc.nextInt();
        System.out.println("Enter b");
        int n = sc.nextInt();
        Ex1 is = new Ex1();
        double faq = is.div(m, n);
        System.out.println("Division is" + faq);
    }
}

class Ex1 {
    Scanner sc = new Scanner(System.in);

    void add() {
        System.out.println("Addition");
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Addition is: " + c);
    }

    void sub(int x, int y) {
        int d = x - y;
        System.out.println("Subtarcttion is: " + d);
    }

    int multi() {
        System.out.println("Multiplication");
        System.out.println("Enter a");
        int r = sc.nextInt();
        System.out.println("Enter b");
        int s = sc.nextInt();
        int e = r * s;
        return e;
    }

    double div(int m, int n) {
        double z = ((double) m / n);
        return z;
    }
}
