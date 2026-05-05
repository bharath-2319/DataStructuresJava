public class Bloom {
    static Boolean possibleBloomDays(int[] arr, int m, int k, int days) {
        int bouqes = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                count++;
            } else {
                bouqes += (count / k);
                count = 0;
            }
        }
        bouqes += (count / k);
        return (bouqes >= m);
    }

    static int Minimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int Maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static int MinimumDays(int[] arr, int m, int k) {
        if ((long) m * k > arr.length)
            return -1;
        int ans = -1;
        int low = Minimum(arr), high = Maximum(arr);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possibleBloomDays(arr, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 10, 3, 10, 2 };
        int m = 3, k = 1;

        int MinimumDay = MinimumDays(arr, m, k);
        System.out.println(MinimumDay);
    }
}
