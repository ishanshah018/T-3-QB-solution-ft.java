//Qb 573

import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Ex1 ab = new Ex1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base");
        int b = sc.nextInt();
        System.out.print("Enter power");
        int p = sc.nextInt();
        int ans = ab.power(b, p);
        System.out.print("Power is: " + ans);
    }

    int power(int b, int p) {
        if (p != 0) {
            return b * power(b, p - 1);
        } else {
            return 1;
        }
    }
}
