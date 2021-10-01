public class Solution {
    public int minPathSum(ArrayList<ArrayList<Integer>> A) 
    {
        int n=A.size();
        int m=A.get(0).size();
        
        for(int i=1;i<m;i++)
        {
            int v=A.get(0).get(i);
            A.get(0).set(i,v+A.get(0).get(i-1));
        }
        
        for(int i=1;i<n;i++)
        {
            int v=A.get(i).get(0);
            A.get(i).set(0,v+A.get(i-1).get(0));
        }
        
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                int v1=A.get(i).get(j-1);
                int v2=A.get(i-1).get(j);
                int v=A.get(i).get(j);
                
                if(v1<v2)
                {
                    A.get(i).set(j,v1+v);
                }
                else
                {
                    A.get(i).set(j,v2+v);
                }
            
            }
        }
        
        return A.get(n-1).get(m-1);
    }
}
