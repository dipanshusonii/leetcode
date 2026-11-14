class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;;
        for(int i=0; i<nums.size(); i++){
            int sum = 0;
            for(int j = i; j<nums.size(); j++){
                sum += nums.get(j);
                if((j-i+1) <= r && (j-i+1) >= l){
                    if(sum > 0) minSum = Math.min(minSum,sum);
                }
            }
        }
        if(minSum == Integer.MAX_VALUE) return -1;
        return minSum;
    }
}