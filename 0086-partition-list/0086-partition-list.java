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
    public ListNode partition(ListNode head, int x) {
      ListNode sh =new ListNode(-1);
      ListNode sm= sh ;

      ListNode gh =new ListNode(-1);
      ListNode gr= gh ;
      
      ListNode temp =head;
      while(temp !=null){
        if(temp.val<x){
            sm.next=temp;
            sm=sm.next;
        }else{
            gr.next=temp;
            gr=gr.next;
        }
         temp=temp.next;
      }
      gr.next=null;
      sm.next =gh.next;
      return sh.next;

    }
}