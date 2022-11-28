  public static Node findMiddleElement(Node head){
      Node firstNode=head;
      Node secondNode=head;

      while(secondNode!=null && secondNode.next!=null){
          firstNode=firstNode.next;
          secondNode=secondNode.next.next;
      }
      return firstNode;
  }
