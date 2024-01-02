//QB 627

class Ex1 {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 5, 6, 3, 2 };
        Ex1 ab = new Ex1();
        ab.odd(arr);
        ab.even(arr);
    }

    void odd(int arr[]) {
        System.out.println("Odd Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    void even(int arr[]) {
        System.out.println("Even Numbers:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
