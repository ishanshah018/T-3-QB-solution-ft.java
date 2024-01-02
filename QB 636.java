//QB 636

import java.util.*;

class Ex1 {
    public static void main(String args[]) {
        met ab = new met();

        Scanner sc = new Scanner(System.in);
        System.out.println("How many Elements:");
        int n = sc.nextInt();
        int ans = ab.sum(n);
        System.out.println("Sum of " + n + " numbers: " + ans);
    }
}

class met {
    Scanner sc = new Scanner(System.in);

    int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter elements: ");
            int s = sc.nextInt();
            sum = sum + s;
        }
        return sum;
    }
}
