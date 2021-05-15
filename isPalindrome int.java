class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int number = x;
        int toReturn = 0;
        while (number != 0) {
            if ((long)10*toReturn > 2147483647 || (long)10*toReturn < -2147483647) {  
                toReturn = 0;
                break;
            }
            toReturn = (10*toReturn) + number%10;
            number /= 10;
        }
        
        return toReturn == x;
    }
}