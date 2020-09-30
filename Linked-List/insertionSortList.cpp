//Link :- https://www.interviewbit.com/problems/insertion-sort-list/

// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

ListNode* Solution::insertionSortList(ListNode* A) {
    if(!A || !A->next)
        return A;
    ListNode *sorted = NULL;
    ListNode *list = A;
    
    while(list)
    {
        ListNode* curr = list;
        list = list->next;
        
        if(!sorted || sorted->val >= curr->val)
        {
            curr->next = sorted;
            sorted = curr;
        }
        else
        {
            ListNode* temp = sorted;
            while (temp)
            {
                ListNode* s = temp;
                temp = temp->next;
                
                if (!s->next || s->next->val > curr->val)
                {
                    curr->next = s->next;
                    s->next = curr;
                    break;
                }
            }
        }
    }
    return sorted;
}
