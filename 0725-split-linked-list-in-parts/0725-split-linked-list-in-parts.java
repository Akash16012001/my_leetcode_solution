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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        int partSize = size / k;
        int extra = size % k;
        int i = 0;
        temp = head;
        ListNode prev = null;
        while(temp != null && i < k){
            ans[i] = temp;
            for(int j = 0; j < partSize + (extra > 0 ? 1 : 0); j++){
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            i++;
            extra--;
        }
        return ans;
    }
}