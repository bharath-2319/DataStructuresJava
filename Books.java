public class Books {
    static int max(int[] books) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < books.length; i++) {
            if (books[i] > max) {
                max = books[i];
            }
        }
        return max;
    }

    static int sum(int[] books) {
        int sum = 0;
        for (int i = 0; i < books.length; i++) {
            sum += books[i];
        }
        return sum;
    }

    static int caluclate(int[] books, int pages) {
        int student = 1, caluclatepages = 0;
        for (int i = 0; i < books.length; i++) {
            if (caluclatepages + books[i] <= pages) {
                caluclatepages += books[i];
            } else {
                student++;
                caluclatepages = books[i];
            }
        }
        return student;
    }

    static int Allocation(int[] books, int students) {
        int low = max(books), high = sum(books);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (caluclate(books, mid) > students) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[] books = { 25, 46, 28, 49, 24 };
        int students = 4;
        int ans = Allocation(books, students);
        System.out.println(ans);
    }
}
