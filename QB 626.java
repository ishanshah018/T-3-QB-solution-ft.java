//QB 626

class Run {
    public static void main(String[] args) {
        int[] a = { 11, 12, 13 };
        dim ab = new dim();
        ab.display(a);
    }

}

class dim {

    void display(int[] array) {
        System.out.println("Yor array is  :");
        for (int q : array)
            System.out.print(q);
    }
}
