//QB 603

import java.util.Scanner;

class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex2 ab = new Ex2();
        System.out.println("Choose an option [ONLY digits 1,2,3,4 are valid ]:");
        System.out.println("Enter 1 for Area of circle ");
        System.out.println("Enter 2 for Area of rectangle ");
        System.out.println("Enter 3 for Area of traingle ");
        System.out.println("Enter 4 to EXIT.. ");
        int choice;
        do {
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Enter Radius: ");
                double r = sc.nextDouble();
                ab.area(r);
            } else if (choice == 2) {
                System.out.println("Enter x: ");
                float x = sc.nextFloat();
                System.out.println("Enter y: ");
                float y = sc.nextFloat();
                ab.area(x, y);
            } else if (choice == 3) {
                System.out.println("Enter base: ");
                double base = sc.nextDouble();
                System.out.println("Enter height: ");
                double height = sc.nextDouble();
                ab.area(base, height);
            } else {
                System.exit(0);
            }

        } while (choice != 4);
    }

}

class Ex2 {
    void area(double x) {
        double c = 3.14 * x * x;
        System.out.println("Area of circle is: " + c);
    }

    void area(float x, float y) {
        float r = x * y;
        System.out.println("Area of Rectangle is: " + r);

    }

    void area(double base, double height) {
        double t = 0.5 * base * height;
        System.out.println("Area of Triangle is: " + t);
    }

}
