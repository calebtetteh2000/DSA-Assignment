public class Main {
    //bubble sort = pairs of adjacent elements are compared, and the elements
    //              swapped if they are not in order.
    //              Quadratic time O(n^2)
    //              small data set = okay...
    //              large data set = BAD
    public static void main(String[] args) {
        int[] array = {3, 2, 5, 1, 9, 7, 4, 8, 6};
// enhanced for loop
        bubbleSort(array);
        for(int i : array){
            System.out.print(i);
        }
    }

    public static void bubbleSort(int array[]){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}