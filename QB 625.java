//QB 625

import java.util.*;

class Run {
    public static void main(String args[]) {
        Array ab = new Array();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter for How many Elements:");
        int n = sc.nextInt();

        System.out.println("Enter Elements:");
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        ab.sort(a);
        System.out.println("After sorting Elements:");
        ab.display(a);
    }
}

class Array {
    void sort(int a[]) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

    void display(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
