package LinkedListDay1;

public class LinkedListImplcrud {

    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class MyLinkedList{
        Node head=null;
        Node tail=null;

      void  insertAtEnd(int data){
          Node temp =new Node(data);

          if(head==null){
              head=temp;
              tail=temp;
          }else{
              tail.next=temp;
              tail=temp;
          }
      }

      void display(){
          Node temp = head;
          while(temp !=null){
              System.out.println(temp.data);
              temp=temp.next;
          }
      }
      int  size(){
          int count=0;
          Node temp = head;
          while(temp !=null){
              count++;
              temp=temp.next;
          }
          return count;
      }

      public void insertAtStart(int data){
          Node temp =new Node(data);
         if(head==null){
             head=temp;
             tail=temp;
         }else {
             temp.next=head;
             head=temp;
         }
      }

      void insertAtAny(int index, int data){

          if(index==size()){
              insertAtEnd(data);
          }
          if(index==0){
              insertAtStart(data);
              return;
          }
          Node t=new Node(data);
         Node temp =head;
          for(int i=0;i<index-1;i++){
              temp=temp.next;
          }
          t.next=temp.next;
          temp.next=t;
      }

      void delete(int index){
          Node temp =head;
          if(index==0){
              head=head.next;
              return;
          }
          for(int i=0;i<index-1;i++){
              temp=temp.next;
          }
          temp.next=temp.next.next;
          tail=temp;
      }

    }


    public static void main(String[] args) {
        MyLinkedList l1 =new MyLinkedList();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtStart(100);
        l1.insertAtAny(1,500);
        l1.insertAtAny(0,1000);
        l1.insertAtAny(5,15);
        l1.delete(5);

        l1.display();
        System.out.println("size of nodes are "+l1.size());
    }
}
