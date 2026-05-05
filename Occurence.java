public class Occurence {
    static int finding(int[] arr, int target) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                } else {
                    last = i;
                }
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 6, 7, 8 };
        int number = finding(arr, 5);
        System.out.println(number + " ");
    }
}