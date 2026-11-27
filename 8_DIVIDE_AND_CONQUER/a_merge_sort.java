public class a_merge_sort {

    public static void mergesort(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergesort(array, si, mid);
        mergesort(array, mid + 1, ei);

        mergearray(array, si, ei, mid);
    }

    public static void mergearray(int array[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1]; // Exact size of current subarray
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (array[i] < array[j]) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = array[i];
            i++;
            k++;
        }

        while (j <= ei) {
            temp[k] = array[j];
            j++;
            k++;
        }

        // Copy sorted elements from temp[] back into array[] starting at si
        for (k = 0, i = si; k < temp.length; k++, i++) {
            array[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int array[] = {6, 4, 2, 1, 8, 7, 9, 3, 5};
        mergesort(array, 0, array.length - 1);

        // Print final sorted array once
        for (int h = 0; h < array.length; h++) {
            System.out.print(array[h] + " ");
        }
    }
}