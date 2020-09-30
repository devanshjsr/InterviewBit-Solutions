// https://www.interviewbit.com/problems/reverse-link-list-ii/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
ListNode* Solution::reverseBetween(ListNode* A, int B, int C) {
    if (!A)
        return NULL;
    if(B==C)
        return A;
    ListNode *temp = A, *current, *prev, *next, *start, *end;
    bool flag = false;
    if(B==1)
        flag = true;
    
    int i = 1;
    while(i<B)
    {
        start = temp; //(m-1)th node
        temp = temp->next;
        ++i;
    }
    current = next = temp;
    
    while(i<C)
    {
        temp = temp->next;
        ++i;
    }
    end = temp; //nth node
    prev = temp->next;
    ListNode *endplus = end->next;
    while(current != endplus)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    if(flag)
        A = prev;
    else
        start->next = prev;
    return A;
}
