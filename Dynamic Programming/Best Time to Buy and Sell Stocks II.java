public class Solution 
{
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxProfit(final int[] A) 
    {
        ArrayDeque<Integer> st=new ArrayDeque<>();
        
        int n=A.length;
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            if(st.isEmpty())
            {
                st.push(A[i]);
            }
            else if(A[i]>=st.peek())
            {
                st.push(A[i]);
            }
            else
            {
                int sp=st.peek();
                int cp=st.peek();
                
                while(st.isEmpty()==false && st.peek()>A[i])
                {
                    cp=st.poll();
                }
                
                ans+=(sp-cp);
                st.push(A[i]);
            }
        }
        
        if(st.isEmpty())
        {
            return ans;
        }
        else
        {
            int sp=st.peek();
            int cp=st.peek();
            
            while(st.isEmpty()==false)
            {
                cp=st.poll();
            }
            
            ans+=(sp-cp);
            
        }
        
        return ans;
    }
}
