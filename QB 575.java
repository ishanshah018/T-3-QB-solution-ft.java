//QB 575

import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex1 ab = new Ex1();
        System.out.print("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2: ");
        int n2 = sc.nextInt();
        int ans = ab.gcd(n1, n2);
        System.out.println("HCF of " + n1 + " and " + n2 + " is " + ans);
        System.out.println("LCM of " + n1 + " and " + n2 + " is " + (n1 * n2 / ans));

    }

    int gcd(int n1, int n2) {
        if (n2 != 0) {
            return gcd(n2, n1 % n2);

        } else {
            return n1;
        }
    }
}
