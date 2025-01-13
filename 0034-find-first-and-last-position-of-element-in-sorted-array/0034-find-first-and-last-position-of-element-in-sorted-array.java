class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = arr[1] = -1; // Initialize result to [-1, -1]

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                arr[0] = i; // Set the starting index
                arr[1] = i; // Initialize the ending index
                
                // Update ending index while the next element equals the target
                while (i + 1 < nums.length && nums[i + 1] == target) {
                    i++; // Move to the next index
                    arr[1] = i;
                }
                break; // Exit the loop once the range is found
            }
        }
        return arr;
    }
}
