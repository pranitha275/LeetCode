class Solution {
    public int[] countBits(int n) {
        int arr[]=new int[n+1];
        String p;
        
        for(int i=0;i<=n;i++)
        {
            p=Integer.toBinaryString(i);
            int c=0;
            for(int j=0;j<p.length();j++)
            {
                if(p.charAt(j)=='1')
                c++;
            }
            arr[i]=c;
            
        }
        return arr;
    }
}