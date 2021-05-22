// https://leetcode.com/problems/minimum-index-sum-of-two-lists
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList(list1));
        
        ArrayList<String> toReturn = new ArrayList<>();
        
        int best = 100000;
        int index = 0;
        for(String name: list2) {
            if(listOne.contains(name)){
                if(index + listOne.indexOf(name) == best) {
                    toReturn.add(name);
                } else if (index + listOne.indexOf(name) < best) {
                    best = index + listOne.indexOf(name);
                    toReturn.clear();
                    toReturn.add(name);
                }
            }
            
            index++;
        }
        String[] array = new String[toReturn.size()];
        array = toReturn.toArray(array);
        
        return array;
    }
}