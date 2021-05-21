// https://leetcode.com/problems/intersection-of-two-linked-lists
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> map = new ArrayList<>();
        while(headA != null) {
            map.add(headA);
            headA = headA.next; 
        }
        while(headB != null) {
            if(map.contains(headB)){
                return headB;
            } else {
                headB = headB.next;
            }
        }
        return null;
    }
}