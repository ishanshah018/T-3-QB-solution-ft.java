//QB 546
import java.util.*;

class Temperature {
    double f, c;

    public static void main(String[] args) {
        Temperature ab = new Temperature();
        ab.farenhit();
        ab.celsius();
    }

    void farenhit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter farenheit");
        f = sc.nextDouble();

    }

    void celsius() {
        c = f - 273;
        System.out.println("Temperature in celsius is " + c);

    }

}
