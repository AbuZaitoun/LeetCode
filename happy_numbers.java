class Solution {
    public boolean isHappy(int n) {
        // HashSet<Integer> hs = new HashSet();
        
        while(true) {
            n = summation(n);
            System.out.println(n);
            if (n == 1) return true;
            if (n == 4) return false;
            // if(hs.contains(n)) return false;
            // else { hs.add(n); }
        }
        // return true;
        
    }
   
    int summation(int n) {
        int sum = 0;
        while(n > 0) {
            int number = n % 10;
            number = number*number;
            sum += number;
            n /= 10;
        }
        return sum;
    }
    
    boolean isPowerOfTen(int n) { 
        while (n >= 10 && n % 10 == 0) 
            n /= 10;
        return n == 1; 
    }
}