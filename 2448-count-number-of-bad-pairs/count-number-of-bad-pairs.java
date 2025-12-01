class Solution {
    public long countBadPairs(int[] nums) 
    {
        long n = nums.length;
        long good = 0;
        long total = n*(n-1)/2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int val = i - nums[i];
            int prev = map.getOrDefault(val,0);
            good+=prev;
            map.put(val, map.getOrDefault(val,0)+1);
        }
        return total-good;
    }
}