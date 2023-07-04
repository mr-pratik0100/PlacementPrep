class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(1);
        ListNode even =new ListNode(0);
        ListNode temp =head;
        ListNode tempo =odd;
        ListNode tempe =even;

        while(temp !=null){
            tempo.next =temp;
            temp =temp.next;
            tempo=tempo.next;

           
             tempe.next =temp;
              if(temp ==null) break;
            temp =temp.next;
            tempe=tempe.next;

        }
        odd=odd.next;
        even =even.next;
        tempo.next =even;
        return odd;
    }
}
