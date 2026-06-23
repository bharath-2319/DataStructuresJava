package DataStructuresJava.Arrays;

public class MaxProductArray {
    static int maxProduct(int[] arr) {
        int maxProduct = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {
                product *= arr[j];
                maxProduct = Math.max(product, maxProduct);
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, -1, 5 };
        int ans = maxProduct(arr);
        System.out.println(ans);
    }
}
