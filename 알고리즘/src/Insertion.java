import java.util.Arrays;

class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 4, 3, 0, 1, 6, 9, 8};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    // 선택정렬 알고리즘
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp=arr[i];
            int j=i;
            while(j>=1&&temp>arr[j-1]){
                arr[j]=arr[j-1];
                 j--;
                }

            arr[j]=temp;

            }
        }
    }

