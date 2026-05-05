public class Singleelement {

    static int element(int[] arr) {
        int n = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    return arr[0];
                }
            }
            if (i == n - 1) {
                if (arr[i - 1] != arr[i]) {
                    return arr[i];
                }
            } else {
                if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };

        int element = element(arr);
        System.out.println(element + " ");
    }
}
