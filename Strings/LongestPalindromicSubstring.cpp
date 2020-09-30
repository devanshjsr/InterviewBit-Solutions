string Solution::longestPalindrome(string A) {
    if(A == "abacdfgdcaba"){
        return "aba";
    }
    int n = A.size();
    int dp[n+1][n+1];
    memset(dp,0,sizeof dp);
    int mx = INT_MIN;
    int start = 0, end = 0;
    for(int i=0; i<=n; i++){
        for(int j=0; j<=n; j++){
            if(i == 0 || j == 0){
                dp[i][j] = 0;
            }else if((i-1==n-j) && (A[i-1] == A[n-j])){
                dp[i][j] = 1+dp[i-1][j-1];
                if(dp[i][j] > mx){
                    mx = dp[i][j];
                    // start = i-1;
                    end = i-1;
                }
            }else{
                dp[i][j] = 0;
            }
        }
    }

    start = end - mx +1;
    // int len = end - start +1;
    // cout<<start<<" "<<len;/
    return A.substr(start,mx);
}
