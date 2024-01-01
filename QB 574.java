//QB 574
import java.util.*;

class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex1 ab = new Ex1();
        System.out.print("Enter Decimal number: ");
        int n = sc.nextInt();
        int ans = ab.deci(n);
        System.out.print("Binary conversion of " + n + " is " + ans);
    }

    int deci(int n) {
        if (n != 0) {
            return (n % 2 + 10 * deci(n / 2));
        } else {
            return 0;
        }

    }
}
