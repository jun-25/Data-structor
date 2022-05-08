 class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 4, 3, 1, 9, 6, 0, 8};
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    // 버블정렬 알고리즘
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}