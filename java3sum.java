class Solution {
    int index = 0;
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> toReturn = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if ((nums[i] + nums[j] + nums[k] == 0) && i != j && i != k && j != k) {
                        // System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                        int[] array = {nums[i], nums[j], nums[k]};
                        // printArray(array);
                        if(alreadyAdded(toReturn, array)) {
                            continue;
                        } else {
                            
                            List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());
                            toReturn.add(list);
                        }
                    }
                }
            }
        }
        
        
        return toReturn;
    }
    
    private void printArray(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");
    }
    
    private boolean alreadyAdded(List<List<Integer>> answers, int[] nums) {
        
        for (List<Integer> item: answers) {
            int[] array = item.stream().mapToInt(i -> i).toArray();
            if (areTheSame(array, nums)) return true;
        }
        return false;
    }
    private boolean areTheSame(int[] nums1, int[] nums2) {
        boolean result = false;
        for (index = 0; index < nums1.length; index++) {
            if (!IntStream.of(nums2).anyMatch(x -> x == nums1[index])) return false;
        }
        return true;
    }
}