public class BinarySearch {
    public static int binarySearch(int arr[] , int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (end - start)/2;
            if (arr[mid] ==  key) {
                return mid;
            }
            else if (arr[mid] < key) {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2 , 94 , 45, 92 , 93};

        System.out.println(binarySearch(arr, 45));

    }
}
