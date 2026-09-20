class Solution { 
    public int[] singleNumber(int[] nums) { 
        int n = nums.length; 
        int[] result = new int[2];
        int index = 0;
        for (int i = 0; i < n; i++) { 
            int c = 0; 
            for (int j = 0; j < n; j++) { 
                if (i != j && nums[i] == nums[j]) { 
                    c++; 
                } 
            } 
            if (c == 0) { 
                result[index] = nums[i]; 
                index++;
                if (index == 2) {
                    return result;
                }
            } 
        } 
        return result; 
    } 
}
