public class PeakElement {
    static int element(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if ((i == 0 || arr[i - 1] < arr[i]) && (i == arr.length - 1 || arr[i] > arr[i + 1])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };
        System.out.println(element(arr));
    }
}
