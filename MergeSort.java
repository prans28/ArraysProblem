package Array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int a[] = { 2, 4, 5, 9, 3, 1 };
        int si = 0;
        int ei = a.length - 1;
        merge(a, si, ei);
        System.out.println(Arrays.toString(a));
    }

    private static void merge(int[] a, int si, int ei) { 
        if (ei > si) { 
            int mid = si + (ei - si) / 2;
            merge(a, si, mid);
            merge(a, mid + 1, ei);
            conquer(a, si, mid, ei); 
        }
    }

    private static void conquer(int[] a, int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1]; 
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) { 
            if (a[idx1] <= a[idx2]) {
                merge[x++] = a[idx1++];
            } else {
                merge[x++] = a[idx2++];
            }
        }

        while (idx1 <= mid) {
            merge[x++] = a[idx1++];
        }

        while (idx2 <= ei) {
            merge[x++] = a[idx2++];
        }

        for (int i = 0; i < merge.length; i++) {
            a[si + i] = merge[i];
        }
    }
}
