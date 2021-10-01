public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int hammingDistance(final List<Integer> A) 
    {
        long ans=0;
        int m=1000000007;
        
        int max=Integer.MIN_VALUE;
        
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>max)
            {
                max=A.get(i);
            }
        }
        
        int c=0;
        
        
        while(max>0)
        {
            c++;
            max=max/2;
        }
        
        long n=A.size();
                
                
        while(c>=0)
        {
             int cnt=0;
            
            for(int i=0;i<A.size();i++)
            {
                long v1=A.get(i);
                
                if((v1&(1L<<c))>0)
                {
                    cnt++;
                }
            }
            
            ans=(ans+((cnt)*(n-cnt)*2))%m;
            
            
            c--;
        }
        
        
        
        return (int)ans;
    }
}
