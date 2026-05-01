package SearchAlgorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {-17,2,3,5,6,8,9,36,65,123};
        System.out.println(linearSearch(array,-17));
    }
    public static int linearSearch(int[] array,int target){
        int highIndex=array.length-1;
        int lowIndex=0;
        while (lowIndex<=highIndex){
            if (target==array[lowIndex]){
                return lowIndex;
            }
            else
                lowIndex++;
        }
        return -1;
    }
}
