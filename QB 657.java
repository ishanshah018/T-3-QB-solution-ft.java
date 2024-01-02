//QB 657

import java.util.*;

class Run {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time-1 in hour");
        int h1 = sc.nextInt();
        System.out.println("Enter time-1 in minutes");
        int m1 = sc.nextInt();
        System.out.println("Enter time-2 in hour");
        int h2 = sc.nextInt();
        System.out.println("Enter time-2 in minutes");
        int m2 = sc.nextInt();
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();
        t1.set(h1, m1);
        t2.set(h2, m2);
        t3.sum(t1, t2);
        t3.print();
    }
}

class Time {

    int hour;
    int min;

    void set(int h, int m) {
        hour = h;
        min = m;
    }

    void sum(Time t1, Time t2) {
        min = t1.min + t2.min;
        hour = (t1.hour + t2.hour) + (min / 60);
        min = min % 60;
    }

    void print() {
        System.out.println("Total hours:" + hour);
        System.out.println("Total minutes:" + min);
    }
}
