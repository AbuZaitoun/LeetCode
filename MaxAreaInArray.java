//https://leetcode.com/problems/container-with-most-water/ 
class Solution {
    public int maxArea(int[] height) {
        
        int maxSize = 0;
        
        for(int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                if((Math.min(height[i], height[j]) * (j - i)) > maxSize) {
                    maxSize = Math.min(height[i], height[j]) * (j - i);
                }
            }
        }
        return maxSize;
    }
}