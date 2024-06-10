package Array;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 8, 9 };
        int left = 0;
        int right = a.length - 1;
        int key = 6;
        
        while (left <= right) {
            int mid = (left + right) / 2;
            
            if (key == a[mid]) {
                System.out.println("Key is present at index " + mid);
                break;
            } else if (key > a[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        if (left > right) {
            System.out.println("Key is not present in the array");
        }
    }
}
