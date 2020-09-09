class NumArray {
    int[] sums;
    
    public NumArray(int[] nums) {
        // obj = nums;
        sums = new int[nums.length];
        if(nums.length > 0)
            sums[0]= nums[0];
        for (int i = 1; i< sums.length; i++){
            sums[i]= sums[i-1] + nums[i];
        }
    }
    
    public int sumRange(int i, int j) {
        int sum = 0;
        if(i!=0){
            return sums[j] - sums[i-1];
        }
        else{
            return sums[j];
        }

    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */