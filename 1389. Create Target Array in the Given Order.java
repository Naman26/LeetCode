class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            target.add(index[i], nums[i]);
        }
        
        int [] array = new int[nums.length];
        for(int j =0; j < array.length; j++){
            array[j] = (int)target.get(j);
        }
        return array;
    }
}