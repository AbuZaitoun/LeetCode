# Definition for singly-linked list.
from typing import Optional 


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
        if head.next == None and n == 1:
            return []

        counter = 0
        myHead = head
        while myHead != None:
            counter += 1
            myHead = myHead.next
        iterateTo = counter - n
        myHead = head
        previous = myHead
        for i in range(iterateTo):
            previous = myHead
            myHead = myHead.next
        previous.next = myHead.next
        return head

sol = Solution()

