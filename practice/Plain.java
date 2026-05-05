package practice;

public class Plain {

    static int firstOccurence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int first = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    static int lastOccurence(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9 };
        int first = firstOccurence(arr, 7);
        int last = lastOccurence(arr, 7);
        System.out.println(first + " is the first occurence ");
        System.out.println(last + " is the last occurence");
    }
}
