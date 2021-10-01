public class Solution {
    public int solve(String A) 
    {
        int[][] dp=new int[A.length()+1][A.length()+1];
        int n=A.length();
        StringBuffer sb=new StringBuffer();
        sb.append(A);
        sb.reverse();
        String B=sb.toString();
        
        
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>=0;j--)
            {
                if(i==0 || j==0)
                {
                    dp[i][j]=0;
                }
                else if(A.charAt(i-1)==B.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return dp[n][n];
    }
}
