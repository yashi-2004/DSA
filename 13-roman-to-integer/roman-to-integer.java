class Solution 
{
    public int romanToInt(String s) 
    {
        int rv[] = new int[128];   
        int total=0;
        rv['I']=1;
        rv['V']=5;
        rv['X']=10;
        rv['L']=50;
        rv['C']=100;
        rv['D']=500;
        rv['M']=1000;

        int n = s.length();
        for(int i=0;i<n;i++)
        {
            if(i+1<n && rv[s.charAt(i)] < rv[s.charAt(i+1)])
            {
                total += rv[s.charAt(i+1)] - rv[s.charAt(i)];
                i++;
            } 
            else
            {
                total += rv[s.charAt(i)];
            }
        }
        return total;
    }
}