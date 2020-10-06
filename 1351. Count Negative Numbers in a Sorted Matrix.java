class Solution {
    int neg = 0;
    public int countNegatives(int[][] grid) {
        int negatives = 0;
        for(int i = 0; i < grid.length; i++){
            for (int j = grid[i].length-1; j >= 0; j--){
                if (grid[i][j] >= 0)
                    break;
                else{
                    negatives++;
                }
            }
        }
        return negatives;
    }
    
    public int negativeRow(int arr[], int low, int high){
        int mid = (high + low)/2;
        System.out.println(low +" "+ high + " "+mid +" " +neg);
        if (high >= 0){
            return 0;
        }
        else if (low < 0){
            return low;
        }
        else if (low >= high){
            return 1;
        }
        else if ( mid < 0){
            high = mid -1;
            neg = mid;
            negativeRow(arr, low, high);
            
        }
        else{
            low = mid + 1;
            negativeRow(arr, low, high);
        } 
        return neg;
        
    }
}