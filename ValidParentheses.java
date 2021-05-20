class Solution {
    public boolean isValid(String s) {
        ArrayList<String> openning = new ArrayList<>();
        openning.add("(");
        openning.add("[");
        openning.add("{");
        HashMap<String, String> matching = new HashMap<>();
        matching.put(")", "(");
        matching.put("}", "{");
        matching.put("]", "[");
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (openning.contains(s.charAt(i)+"")) {
                stack.push(s.charAt(i)+"");
            } else {
                try {
                    String topElement = stack.pop();
                    if (!matching.get(s.charAt(i)+"").equals(topElement)) {
                        return false;
                    }
                } catch (Exception e) { return false; }
                
            }
        }
        if (stack.size() > 0) return false;
        
        return true;
    }
}