import java.util.*;

class QB495 {

    public static void main(String[] args) {
        QB495 ab = new QB495();
        ab.prod();
    }

    void prod() {
        int prod = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number");
        int n = sc.nextInt();
        while (n > 0) {
            int temp = n % 10;   //here we store value of modulo in temp variable to use it 
            prod = prod * temp;
            n = n / 10;

        }
        System.out.println("Product of numbers is " + prod);
    }
}
