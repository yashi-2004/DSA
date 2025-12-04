class Solution {
    public int[] pivotArray(int[] nums, int pivot) 
    {
        int l=0, g=0, p=0;
        for(int num:nums)
        {
            if(num<pivot)
            {
                l++;
            }
            else if(num>pivot)
            {
                g++;
            }
            else
            {
                p++;
            }
        }
        int i=0;
        int j=l;
        int k=l+p;
        int res[] = new int[nums.length];
        for(int num:nums)
        {
            if(num<pivot)
            {
                res[i] = num;
                i++;
            }
            else if(num>pivot)
            {
                res[k] = num;
                k++;
            }
            else
            {
                res[j] = num;
                j++;
            }
        }
        return res;
    }
}