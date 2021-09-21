public class bubbleSort {
    public static void bubbleSorting(int[] arr){
        int i, j, temp, flag = 0, n = arr.length;
        for(i=0; i<n; i++){
            for(j=0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    flag = 1;
                }
            }
            if(flag == 0) break;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,5,6,2,3,4,11,28,8,9,7};
        System.out.printf("Array before sorting: ");
        for(int i = 0; i < arr.length; i++){
            System.out.printf(arr[i] + " ");
        }
        bubbleSorting(arr);
        System.out.printf("\nArray after sorting: ");
        for(int j = 0; j < arr.length; j++){
            System.out.printf(arr[j] + " ");
        }
    }
}
