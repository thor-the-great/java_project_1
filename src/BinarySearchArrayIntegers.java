public class BinarySearchArrayIntegers {
    public static void main(String[] args){

        int[] numArray = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        int n = 7;
        System.out.print(binarySearch(numArray, n));

        int m = 8;
        System.out.print(binarySearch(numArray, m));
    }

    public static Boolean binarySearch(int[] arr, int n){

        int left = 0;
        int right = arr.length - 1 ;

        while (left <= right){

            int mid = left + (( right  - left ) / 2 );

            if  (arr[mid] == n){
                return true;

            }

            else if (n < arr[mid]){
                right = mid - 1;

            }
            else {
                left = mid + 1;
            }

        }

        return false;

    }

}
