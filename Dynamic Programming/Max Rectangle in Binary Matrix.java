public class Solution {
    public int maximalRectangle(int[][] A) 
    {
        int n=A.length;
        int m=A[0].length;
        int[][] up=new int[n+1][m+1];
        int[][] left=new int[n+1][m+1];
        
        int ans=0;
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(A[i][j]==0)
                {
                    continue;
                }
                
                up[i+1][j+1]=up[i][j+1]+1;
                
                left[i+1][j+1]=left[i+1][j]+1;
                
                
                if(up[i][j+1]==0)
                {
                    if(left[i+1][j+1]>ans)
                    {
                        ans=left[i+1][j];
                    }
                }
                else if(left[i+1][j]==0)
                {
                    if(up[i+1][j+1]>ans)
                    {
                        ans=up[i][j+1];
                    }
                }
                else if(up[i][j]==0)
                {
                    int v=Math.max(left[i+1][j+1],up[i+1][j+1])
                    
                    if(v>ans)
                    {
                        ans=v;
                    }
                }
                else
                {
                    int h=Math.min(up[i][j+1]+1,left[i+1][j]);
                    int w=Math.min(up[i][j+1],left[i+1][j]+1);
                    
                    if((h*w)>ans)
                    {
                        ans=h*w;
                    }
                    
                }
                
                
            }
        }
        
        return ans;
    }
}
