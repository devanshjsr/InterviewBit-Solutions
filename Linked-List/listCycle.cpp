// https://www.interviewbit.com/problems/list-cycle/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
ListNode* Solution::detectCycle(ListNode* A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details

    ListNode*slow=A;
    ListNode*fast=A;
    int count=0;
    while(fast && fast->next){
        fast=fast->next->next;
        slow=slow->next;
        if(fast==slow){
            count=1;
            break;
        }
    }
    if(count==0)return NULL;
    if(count==1){
        ListNode* f=A;
        while(f!=slow){
            f=f->next;
            slow=slow->next;
        }
        return f;
    }
}
