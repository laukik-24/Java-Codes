



public class MaxSubarraySum{

    //brute force method
    public static int maxsum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0 ; i < arr.length ; i++){
            int start = i;
            for(int j = 1 ; j < arr.length ; j++){
                int end = j ;
                currSum = 0;
                for(int k = start ; k <=end ; k++){
                    currSum += arr[k];
                }
                
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
       
    }

    //prefix Sum
    public static int prefixSum(int arr[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];

        // Compute prefix sum
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Try all subarrays using prefix sums
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    // Kadane's Algorithm

    public static int Kadane(int arr[] ) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < arr.length; i++) {
            cs += arr[i];
            if(cs < 0){
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        return ms;
    }

    public static void main(String[] args) {
        int arr[] = {23 , 24 , 92 , 33 , 123 , 0};
        // int arr[] = {1 , -2 , 6 , -1 , 3};
        // int arr[] = {-2,-3,-4,-1,-2,1,5,-3};
        // int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println(maxsum(arr));
        System.out.println(prefixSum(arr));
        System.out.println(Kadane(arr));
    }
}