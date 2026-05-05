public class Root {

    static int function(int n, int m, int mid) {
        long ans = 1;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
            if (ans > m)
                return 2;
        }
        if (ans == m)
            return 1;
        return 0;
    }

    static int FindingRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int midn = function(n, m, mid);
            if (midn == 1) {
                return mid;
            }
            if (midn == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 27;
        int answer = FindingRoot(n, m);
        System.out.println(answer + " ");
    }
}
