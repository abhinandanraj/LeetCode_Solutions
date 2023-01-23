// Problem Link: https://leetcode.com/problems/reverse-linked-list/description/
// Submission Link: https://leetcode.com/problems/reverse-linked-list/submissions/883880519/

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
    public ListNode reverseList(ListNode head) {
        ListNode output = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = output;
            output = head;
            head = temp;
        }
        return output;
    }
}