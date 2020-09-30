public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) 
    {
        int sl=Integer.MAX_VALUE;
        String min="";
        
        for(int i=0;i<A.size();i++)
        {
            int l=A.get(i).length();
            
            if(l<sl)
            {
                sl=l;
                min=A.get(i);
            }
        }
        
        StringBuffer ans=new StringBuffer();
        
        
        for(int i=0;i<min.length();i++)
        {
            int f=1;
            char ch=min.charAt(i);
            
            for(int j=0;j<A.size();j++)
            {
                if(A.get(j).charAt(i)!=ch)
                {
                    f=0;
                    break;
                }
            }
            
            if(f==0)
            {
                break;
            }
            else
            {
                ans.append(String.valueOf(ch));
            }
        }
        
        return ans.toString();
        
        
    }
}
