# Definition for singly-linked list.
from locale import currency
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        node = ListNode()
        toReturn = ListNode()
        current = toReturn
        value = 0
        head = head.next

        while head != None:
            if head.val == 0:
                node = ListNode()
                node.val = value
                current.next = node
                current = current.next
                value = 0
            else:
                value += head.val

            head = head.next
        return toReturn.next