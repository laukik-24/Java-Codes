
public class LargestNumber {

    public static int Largest(int nums[]) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        int largest[] = {100,200,103,104};

        int large = Largest(largest);

        System.out.print(large);

    }
    
}
