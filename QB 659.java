//QB 659

//PASSING AN OBJECT TO METHOD 

import java.util.*;

class run {

    public static void main(String args[]) {
        Power ab = new Power();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
        ab.num = sc.nextInt();
        System.out.println("Enter the value of Power");
        ab.pow = sc.nextInt();

        Power pq = ab.findPow(ab);
        System.out.println("power of given number is " + pq.result);
    }
}

class Power {

    int num, pow, result = 1;

    Power findPow(Power obj) {
        int i;
        Power obj1 = new Power();
        for (i = 1; i <= obj.pow; i++) {
            obj1.result = obj1.result * obj.num;
        }
        return obj1;
    }
}
