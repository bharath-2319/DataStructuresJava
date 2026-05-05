package practice;

public class Koko {
    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int calucalateHours(int[] arr, int hourly) {
        int totalH = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            totalH += Math.ceil((double) arr[i] / (double) hourly);
        }
        return totalH;
    }

    static int calucalate(int[] arr, int h) {
        int low = 1, high = max(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalH = calucalateHours(arr, mid);
            if (totalH <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 7, 11 };
        int h = 8;

        int answer = calucalate(arr, h);
        System.out.println(answer + " ");

    }
}
