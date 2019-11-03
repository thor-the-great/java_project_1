public class BubbleSort {
    public static int[] bubbleSortArray(int[] arr){
        // Find the length of the input array
        int len = arr.length;

        // Run a for loop from the end to the first element. The index will be
        // the tail pointer. Everything to the right of the tail pointer will be
        // assumed sorted as the largest elements would bubble to the tail pointer.
        for(int bubblePosition = len-1; bubblePosition >= 0;bubblePosition--){
            // Run an inner for loop from 0 to the current position of the tail
            // pointer.
            for(int i=0;i<bubblePosition;i++){
                // If the current element > next element, swap the two
                if(arr[i]>arr[i+1]){
                    // Use a temporary variable to perform the swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }
}

/* public static int[] bubbleSortArray(int[] arr){
    int temp;
    boolean fixed = false;
    while(fixed == false) {
        fixed = true;
    for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            fixed = false;
        }
    }
    }



    return arr;
}*/