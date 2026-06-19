public class DeleteValue {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int value = 20;
        int index = -1;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == value) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
