class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
    public void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public void merge(int arr[], int l, int m, int r) {
        int i = l;
        int j = m + 1;
        int k = l;
        int b[] = new int[r - l + 1];
        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                b[k - l] = arr[i];
                i++;
            } else {
                b[k - l] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= m) {
            b[k - l] = arr[i];
            i++;
            k++;
        }
        while (j <= r) {
            b[k - l] = arr[j];
            j++;
            k++;
        }

        for (int o = l; o <= r; o++) {
            arr[o] = b[o - l];
        }
    }
}