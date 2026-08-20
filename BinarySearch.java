package Github;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {2, 6, 9, 23, 56, 89, 103, 201, 553, 986};
        System.out.println(binarySearch(array, 89));


    }

    public static int binarySearch(int[] array, int target) {
        int highIndex = array.length - 1;
        int lowIndex = 0;

        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;
            int middleValue = array[middleIndex];
            if (target == middleValue) {
                return middleIndex;
            } else if (middleValue > target) {
                highIndex = middleIndex - 1;
            } else {
                lowIndex = middleIndex + 1;
            }
        }


        return -1;
    }
}