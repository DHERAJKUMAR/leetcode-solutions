class Solution { 
    public int[] smallerNumbersThanCurrent(int[] nums) { 
        int n = nums.length; 
        int[] result = new int[n]; 
         for (int i = 0; i < n; i++) { 
            int c = 0; 
            for (int j = 0; j < n; j++) { 
                if (j != i && nums[j] < nums[i]) { 
                    c++; 
                } 
            } 
            result[i] = c;
        } 
        
        return result;
    } 
}
