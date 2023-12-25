//QB498
import java.util.*;

class QB498 {

    public static void main(String[] args) {
        QB498 ab = new QB498();
        ab.npr();
    }

    void npr() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        System.out.print("Enter r");
        int r = sc.nextInt();
        int npr = 1;
        for (int i = 1; i <= r; i++) {
            npr = npr * n;
            n--;
        }
        System.out.println("Answer of npr is " + npr);
    }
}
