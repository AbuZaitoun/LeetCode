class Solution {
    public int romanToInt(String s) {
        int toReturn = 0;
        HashMap<String, Integer> values = new HashMap<String, Integer>();
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if(toReturn > (values.get(s.charAt(i)+"")*4)) {
                toReturn = toReturn - values.get(s.charAt(i)+"");
            }else 
                toReturn = toReturn + values.get(s.charAt(i)+"");
        }
        return toReturn;
    }
}