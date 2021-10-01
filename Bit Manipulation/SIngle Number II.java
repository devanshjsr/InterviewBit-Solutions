public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) 
    {
        //int[] arr=new int[64];
        
        int sum=0;
        
        for(int i=0;i<32;i++)
        {
            int c=0;
            
            for(int j=0;j<A.size();j++)
            {
                if((A.get(j)&(1<<i))>0)
                {
                    c++;
                }
            }
            
            if(c%3!=0)
            {
                sum=sum+(1<<i);
            }
        }
        
        

        return sum;

    }
}
