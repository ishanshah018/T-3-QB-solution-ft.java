//QB 576

import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Ex1 ab = new Ex1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int ans = ab.fibo(n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans);
        }

    }

    int fibo(int count) {
        if (count == 0) {
            return 0;
        } else if (count == 1) {
            return 1;
        } else {
            return fibo(count - 1) + fibo(count - 2);
        }

    }
}
