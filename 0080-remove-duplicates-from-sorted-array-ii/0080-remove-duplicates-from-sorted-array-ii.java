class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
    int n = nums[j];
    if (i < 2 || n != nums[i - 2]) {
       nums[i] = n;
          i++;
    }
}
        return i;
    }
}

