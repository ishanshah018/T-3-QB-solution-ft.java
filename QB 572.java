import java.util.Scanner;

class Ex1 {

    public static void main(String[] args) {
        Ex1 ab = new Ex1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int ans = ab.sum(n);
        System.out.println("Factorial of " + n + " is " + ans);
    }

    int sum(int n) {
        if (n > 1) {
            return n * sum(n - 1);
        } else {
            return 1;
        }
    }
}
