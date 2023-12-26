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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode nodeSlow = null, nodeFast = head.next;
        ListNode temp = head;
        temp.next = nodeFast.next;
        nodeFast.next = temp;
        head = nodeFast;
        nodeFast = nodeFast.next;
        nodeSlow = head;
        while(nodeFast.next!=null){
            nodeSlow = nodeSlow.next;
            nodeFast = nodeFast.next;

            if(nodeFast.next!=null) {
                nodeSlow.next = nodeFast.next;
                temp = nodeFast.next.next;
                nodeSlow.next.next = nodeFast;
                nodeFast.next = temp;
                nodeSlow = nodeSlow.next;
            }
        }
        return head;
    }
}