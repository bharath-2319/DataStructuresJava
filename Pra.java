import java.util.Scanner;

public class Pra {
    public int searching(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target)
                return mid;
            if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        System.out.println("enter the target");
        int target = sc.nextInt();

        Pra pp = new Pra();
        int answer = pp.searching(arr, target);
        System.out.println(+target + " found at " + answer + " index");

        sc.close();
    }
}
