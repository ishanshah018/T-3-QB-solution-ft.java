//QB 623

import java.util.*;

class student {
    int rno;
    String n;
    long mo;

    public static void main(String args[]) {
        student[] b = new student[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = new student();
        }

        for (int i = 0; i < b.length; i++) {
            b[i].input();
        }

        for (int i = 0; i < b.length; i++) {
            b[i].print();
        }

    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Roll Number: ");
        rno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Student Name: ");
        n = sc.nextLine();
        System.out.println("Enter Student Mobile number: ");
        mo = sc.nextLong();
    }

    void print() {
        System.out.println("------------------------------------");
        System.out.println("Your Roll No is " + rno);
        System.out.println("Your Name is " + n);
        System.out.println("Your mobile number is " + mo);

    }
}
