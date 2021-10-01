public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxProduct(final List<Integer> A) 
    {
        int max=Integer.MIN_VALUE;
        
        
        int msf=1;
        int misf=1;
        int f=-1;
        
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<A.size();i++)
        {
            if(A.get(i)>0)
            {
                msf=msf*A.get(i);
                misf=Math.min(misf*A.get(i),1);
                f=1;
            }
            else if(A.get(i)==0)
            {
                msf=1;
                misf=1;
                f=0;
            }
            else
            {
               // System.out.println(msf+" "+misf);
                
                int tmp=msf;
                msf=Math.max(1,misf*A.get(i));
                misf=Math.min(1,tmp*A.get(i));
                
               // System.out.println(msf+" "+misf);
                
            }
            
            if(msf>ans)
            {
                ans=msf;
            }
            
            if(A.get(i)>max)
            {
                max=A.get(i);
            }
        }
        
        if(f!=1 && ans==1)
        {
            return max;
        }
        else
        {
            return ans;
        }
        
    }
}
