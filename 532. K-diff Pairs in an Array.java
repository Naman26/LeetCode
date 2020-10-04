class Solution {
    public int findPairs(int[] nums, int k) {
        HashSet<Integer> in = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if(nums[j] - nums[i] == k && j!= i){
                    in.add(nums[j]+ nums[i]);
                }
            }
        }
        return in.size();
    }
}