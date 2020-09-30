# https://www.interviewbit.com/problems/length-of-last-word/

class Solution:
    # @param A : string
    # @return an integer
    def lengthOfLastWord(self, A):
        return len(A.strip().split(' ')[-1])
