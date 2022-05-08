public class 선택정렬 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 4, 3, 1, 9, 6, 0, 8};
        selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    // 선택정렬 알고리즘
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
}
