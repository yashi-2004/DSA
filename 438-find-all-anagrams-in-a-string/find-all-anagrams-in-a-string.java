class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        int n = s.length();
        int m = p.length();
        List<Integer> list = new ArrayList<>();
        if(m>n) return list;
        int sc[] = new int[26];
        int pc[] = new int[26];

        for(int i=0;i<m;i++)
        {
            int si = s.charAt(i)-'a';
            int pi = p.charAt(i)-'a';

            sc[si]++;
            pc[pi]++;
        }

        if(Arrays.equals(sc,pc))
        {
            list.add(0);
        }
        for(int i=1;i<=n-m;i++)
        {
            int prev = s.charAt(i-1)-'a';
            int next = s.charAt(i+m-1)-'a';
            sc[prev]--;
            sc[next]++;
            if(Arrays.equals(sc,pc))
            {
                list.add(i);
            }
        }
        return list;
    }
}