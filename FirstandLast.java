public class FirstandLast {

    public static int lowerBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int lowerBound = arr.length; // ✅ fix

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] >= target) {
                lowerBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return lowerBound;
    }

    public static int UpperBound(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int HigherBound = arr.length; // ✅ fix

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] > target) {
                HigherBound = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return HigherBound;
    }

    static int[] finding(int[] arr, int target) {

        int lb = lowerBound(arr, target);

        // ✅ correct check
        if (lb == arr.length || arr[lb] != target) {
            return new int[] { -1, -1 };
        }

        int ub = UpperBound(arr, target);

        return new int[] { lb, ub - 1 };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 6, 7 };

        int[] ans = finding(arr, 5);

        System.out.println(ans[0] + " " + ans[1]);
    }
}