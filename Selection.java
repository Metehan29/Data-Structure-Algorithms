package dataStructures.SIRALAMA;

public class Selection {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 35, -3, 6, 7, 15, 2, 9 };
        int minindex;
        for (int i = 0; i < arr.length; i++) {
            minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minindex]) {
                    minindex = j;

                }
            }
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
