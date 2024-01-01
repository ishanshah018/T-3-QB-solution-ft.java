// QB 571
import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Ex1 ab = new Ex1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1");
        int n1 = sc.nextInt();
        System.out.print("Enter n2");
        int n2 = sc.nextInt();
        int ans = ab.hcf(n1, n2);
        System.out.println("HCF of " + n1 + " and " + n2 + " is " + ans);
    }

    int hcf(int n1, int n2) {
        if (n2 != 0) {
            return hcf(n2, n1 % n2);
        } else {
            return n1;
        }
    }
}
