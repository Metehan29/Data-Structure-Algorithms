package Github;

public class bubbleSort {
    public static void main(String[] args) {

        int[] array = {2,6,9,23,56,89,103,201,553,986};

        for (int i =0 ; i<array.length;i++){
            for (int j =0 ; j<array.length-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j]=array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for (int i =0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }


    }


    }



