//https://www.interviewbit.com/problems/palindrome-integer/

int Solution::isPalindrome(int A) {
    if(A<0) return 0;
    if(A<10)    return 1;
    string s = to_string(A);
    string ss = to_string(A);
    reverse(s.begin(),s.end());
    if(s == ss) return 1;
    return 0;
}
