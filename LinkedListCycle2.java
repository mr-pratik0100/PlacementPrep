public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode slow =head;
        ListNode fast =head;
        if(head ==null || head.next==null) return null;
        while(fast !=null){
            slow = slow.next;
            if(fast.next ==null) return null;
            if(fast.next.next==null) return null;
            fast =fast.next.next;
            if(slow ==fast) break;
        }
        ListNode temp = head;
        while(temp !=slow){
            temp =temp.next;

            slow =slow.next;
        }
        return slow;
    }
}
