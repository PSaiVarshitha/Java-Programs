class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode past=null;
        ListNode curr=head;
        ListNode future=null;

        while(curr != null){
            future=curr.next;
            curr.next=past;
            past=curr;
            curr=future;        
        }
        head = past;
        return head;
    }
}
