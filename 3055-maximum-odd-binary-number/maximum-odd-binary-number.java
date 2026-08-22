class Solution {
    public String maximumOddBinaryNumber(String s) 
    {
        int n = s.length();
        char arr[] = s.toCharArray();

        int ones = 0;

        for(char c : arr)
        {
            if(c == '1')
                ones++;
        }

        int l = 0;

        // Put all 1s except one at the front
        for(int i = 0; i < ones - 1; i++)
        {
            arr[l++] = '1';
        }

        // Put 0s in the middle
        while(l < n - 1)
        {
            arr[l++] = '0';
        }

        // Reserve one 1 at the end
        arr[n - 1] = '1';

        return new String(arr);
    }
}