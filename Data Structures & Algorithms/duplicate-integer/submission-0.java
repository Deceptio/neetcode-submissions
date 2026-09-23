class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seeNums = new HashSet<>();

        for (int num : nums) {
            if (!seeNums.add(num)) {return true;}
        }

        return false;
        
    }
}