public class LargestNumber {
    public static void main(String[] args) {
        int[] nums = {23445444, 34434, 43, 332133, 332333};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];

            }
        }
        System.out.println("Largest number: " + max);
    }
}
