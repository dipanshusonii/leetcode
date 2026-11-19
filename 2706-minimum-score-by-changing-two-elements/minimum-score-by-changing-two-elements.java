class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if (n <= 3) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i <= 2; i++) {
            ans = Math.min(ans, nums[n - 3 + i] - nums[i]);
        }
        return ans;
    }
}