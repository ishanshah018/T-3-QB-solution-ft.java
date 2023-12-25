//QB 496
import java.util.*;

class QB496 {

    int sum = 0, rem, temp;

    public static void main(String[] args) {
        QB496 ab = new QB496();
        ab.palid();
    }

    void palid() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int n = sc.nextInt();

        for (temp = n; n > 0;) {
            rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("PALINDROME NUMBER");
        } else {
            System.out.println("NOT PALINDROME NUMBER");
        }
    }
}
