public class DeleteEnd {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int index = n - 1; // delete 30

        for (int i = index; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }

        n--; //

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(n);
    }
}
