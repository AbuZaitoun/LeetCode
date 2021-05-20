// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode pointer = head;
        while(pointer != null && pointer.next != null) {
            ListNode other = pointer.next;
            if(pointer.val == other.val) {
                pointer.next = other.next;
                other = other.next;
            } else {
                pointer = other;
            }
        }
        return head;
    }
}