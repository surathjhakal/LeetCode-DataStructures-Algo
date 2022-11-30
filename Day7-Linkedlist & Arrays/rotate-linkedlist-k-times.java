  public static Node rotateLinkedList(Node head,int k){
      if(k==0 || head==null) return head;

      Node temp=head;
      int count=1;
      while(temp.next!=null){
          count++;
          temp=temp.next;
      }

      k=k%count;
      if(k==0) return head;
      temp.next=head;
      int end=count-k;
      Node tempMove=head;
      while(end>1){
          end--;
          tempMove=tempMove.next;
      }
      Node newHead=tempMove.next;
      tempMove.next=null;

      return newHead;
  }
