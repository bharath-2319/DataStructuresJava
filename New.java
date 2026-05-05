public class New {
    static int maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int FindingDivisor(int[] arr, int mid) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Math.ceil((double) arr[i] / (double) mid);
        }
        return sum;
    }

    static int checking(int[] arr, int threshold) {
        int low = 1, high = maximum(arr);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (FindingDivisor(arr, mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 9 };
        int threshold = 7;

        int ans = checking(arr, threshold);
        System.out.println(ans);
    }
}
