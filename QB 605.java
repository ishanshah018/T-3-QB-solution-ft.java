//QB 605

import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        comparison ab = new comparison();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("For Two Integers");
        System.out.println("Enter Integer 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Integer 2: ");
        int n2 = sc.nextInt();
        ab.integer(n1, n2);

        System.out.println("------------------");
        System.out.println("For Two characters");
        System.out.println("Enter Character 1: ");
        char c1 = sc.next().charAt(0);
        System.out.println("Enter Character 2: ");
        char c2 = sc.next().charAt(0);
        ab.character(c1, c2);

        System.out.println("------------------");
        System.out.println("For Two Double value");
        System.out.println("Enter Double value 1: ");
        double d1 = sc.nextDouble();
        System.out.println("Enter Double value 2: ");
        double d2 = sc.nextDouble();
        ab.doub(d1, d2);

    }
}

class comparison {

    void integer(int n1, int n2) {
        if (n1 == n2) {
            System.out.println("=>Integer 1 and Integer 2 are equal ");
        } else {
            System.out.println("=>Integer 1 and Integer 2 are not equal ");
        }
    }

    void character(char c1, char c2) {
        int p = (int) c1;
        int q = (int) c2;
        if (p == q) {
            System.out.println("=>Character 1 and Character 2 are equal ");
        } else {
            System.out.println("=>Character 1 and Character 2 are not equal ");
        }
    }

    void doub(double d1, double d2) {
        if (d1 == d2) {
            System.out.println("=>Double 1 and Double 2 are equal ");
        } else {
            System.out.println("=>Double 1 and Double 2 are not equal ");
        }
    }
}
