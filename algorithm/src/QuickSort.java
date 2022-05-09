public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 4, 3, 1, 9, 6, 0, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if(start>=end){return;}
        int pivot = start;
        int left = pivot + 1;
        int right = end;
        int temp = 0;
        while (left <= right) {
            while (left <= end && arr[left] <= arr[pivot]) {
                left++;
            }
            while (right > pivot && arr[right] >= arr[pivot]) {
                right--;
            }

            if (left > right) {
                temp=arr[pivot];
                arr[pivot]=arr[right];
                arr[right]=temp;

            } else {
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        quickSort(arr,start,right-1);
        quickSort(arr,right+1,end);

    }
}


