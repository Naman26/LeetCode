class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] pair = new int [2*n];
        int j = 0; 
        for(int i = 0; i< nums.length/2; i++){
            pair[j]= nums[i];
            // System.out.println(nums[i]);
            // System.out.println(nums[nums.length/2 +i]);
            pair[j+1] = nums[nums.length/2 +i];
            // System.out.println(pair[i] + "  "+ pair[i+1]);
            j+=2;
        }
        return pair;
    }
}