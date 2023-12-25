import java.util.*;

class QB497 {

    int sum = 0, rem, temp;

    public static void main(String[] args) {
        QB497 ab = new QB497();
        ab.arm();
    }

    void arm() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int n = sc.nextInt();

        for (temp = n; n > 0;) {
            rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("ARMSTRONG NUMBER");
        } else {
            System.out.println("NOT ARMSTRONG NUMBER");
        }
    }
}
