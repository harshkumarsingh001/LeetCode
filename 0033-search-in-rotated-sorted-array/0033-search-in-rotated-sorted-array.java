class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) return mid;

            // Left half sorted hai
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // left mein search karo
                } else {
                    left = mid + 1;  // right mein search karo
                }
            } 
            // Right half sorted hai
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // right mein search karo
                } else {
                    right = mid - 1; // left mein search karo
                }
            }
        }

        return -1; // nahi mila
    }
}