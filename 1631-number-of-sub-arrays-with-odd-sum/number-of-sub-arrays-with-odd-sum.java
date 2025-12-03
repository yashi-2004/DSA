class Solution {
    public int numOfSubarrays(int[] arr) {
        int mod = 1000000007;
        int evenC=1;
        int odd =0;
        int prefix = 0;
        int res =0;

        for(int num:arr)
        {
            prefix+=num;
            if(prefix%2==0)
            {
                res+=odd;
                evenC++;
            }
            else
            {
                res+=evenC;
                odd++;
            }
            res=res%mod;


        }
        return res;
    }
}