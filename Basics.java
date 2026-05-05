class Basics {
    static int find(int[] arr, int target, int length) {
        int low = 0, high = length - 1;
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int length = arr.length;

        int index = find(arr, 5, length);
        System.out.println(index + " ");
    }
}