class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        for (int j = 0; j < k; j++) {
            //写k=1的情况
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
        }
    }
}
