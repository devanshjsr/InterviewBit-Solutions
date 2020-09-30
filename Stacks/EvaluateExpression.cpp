int solve(int x, int y, char c){
    if(c=='+')  return x + y;
    if(c=='-')  return x - y;
    if(c=='*')  return x * y;
    return x / y;
}
int Solution::evalRPN(vector<string> &A) {
    stack<int> st;
    for(int i=0; i<A.size(); i++){
        if(A[i] == "+" || A[i] == "-" || A[i] == "*" || A[i] == "/"){
            int x = st.top();
            st.pop();
            int y = st.top();
            st.pop();
            int z = solve(y,x,A[i].at(0));
            st.push(z);
            // cout<<x<<" "<<y<<" "<<z<<endl;
        }else{
            st.push(stod(A[i]));
        }
    }
    return st.top();
}
