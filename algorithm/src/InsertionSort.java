public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 4, 3, 1, 9, 6, 0, 8};
        insertionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
        public static void insertionSort(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int j=i;
                int temp=arr[i];
                while(j>=1&&temp<arr[j-1]){
                    arr[j]=arr[j-1];
                    j--;
                    }
                arr[j]=temp;
                }
            }
        }


