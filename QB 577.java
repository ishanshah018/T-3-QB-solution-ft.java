//QB 577

class Ex1 {
    public static void main(String[] args) {
        Ex1 ab = new Ex1();
        int[] numArr = { 7, 32, 64, 2, 10, 23 };
        int store = ab.call(numArr, numArr.length);
        System.out.println("Smallest element in Array is:  " + store);

    }

    int call(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], call(arr, n - 1));
    }
}
