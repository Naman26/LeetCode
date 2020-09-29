class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] combo = new int[nums1.length + nums2.length];
        int j, i;
        for (i = 0, j = 0; i < Math.max(nums1.length, nums2.length); i++){
            if(i < nums1.length){
                combo[j] = nums1[i];
                j++;
            }
            if(i < nums2.length){
                combo[j] = nums2[i];
                j++;
            }
        }
        Arrays.sort(combo);
        if(combo.length % 2 == 0){
            return (combo[combo.length/2] + combo[(combo.length/2 - 1)])/2.0;
        }
        else{
            return combo[combo.length/2]/1.0;
        }
     }
}