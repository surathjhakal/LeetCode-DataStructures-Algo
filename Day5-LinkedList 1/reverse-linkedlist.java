  public static Node reverseLinkedList(Node head){
      Node tempNext=head;
      Node prev=null;
      while(tempNext!=null){
          Node storeNext=tempNext.next;
          tempNext.next=prev;
          prev=tempNext;
          tempNext=storeNext;
      }
      return prev;
  }
