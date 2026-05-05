public class Roots {
    static int find(int mid, int n) {
        long ans = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                ans = mid * mid;
                n = n - 1;
            } else {
                mid = mid * mid;
                n = n / 2;
            }
        }
        return (int) ans;
    }

    static int root(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (find(mid, n) == m)
                return mid;
            else if (find(mid, n) < m) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 3, m = 27;

        int answer = root(n, m);
        System.out.println(answer + " ");
    }
}
