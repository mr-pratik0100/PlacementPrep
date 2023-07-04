class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode before =null;
        ListNode after =null;

        while(current !=null){
            after =current.next;
            current.next =before;
            before =current;
            current =after;
        }
        return before;
    }
}
