public class SortingAscend {
    static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 40, 50, 60 };
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[i - 1]) {
                swap(arr, i);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
