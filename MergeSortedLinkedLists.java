// https://leetcode.com/problems/merge-two-sorted-lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode toReturn = null;
        ListNode pointer = null;
        while(l1 != null || l2 != null) {
            if(l1 == null) {
                if(toReturn == null) {
                    toReturn = l2;
                    break;
                }
                pointer.next = l2;
                pointer = pointer.next;
                break;
            } else if (l2 == null) {
                if(toReturn == null){
                    toReturn = l1;
                    break;
                }
                pointer.next = l1;
                pointer = pointer.next;
                break;
            }
            if(l1.val < l2.val) {
                if(toReturn == null) {
                    toReturn = l1;
                    pointer = toReturn;
                }
                else {
                    pointer.next = l1;
                    pointer = pointer.next;
                }
                l1 = l1.next;
            } else {
                if(toReturn == null) {
                    toReturn = l2;
                    pointer = toReturn;
                }
                else {
                    pointer.next = l2;
                    pointer = pointer.next;
                }
                l2 = l2.next;
            }
        }
        
        return toReturn;
    }
}