  public static Node reverseListInGroupsOfK(Node head,int k){
      if(head==null) return head;
      Node returnPointNode=head;
      Node prev=null;
      Node curr=head;
      Node startPoint=head;
      int count=1;
      while(curr!=null){
          Node next=curr.next;
          if(count%k==0) {
              reverseLinkedList2(startPoint, next);
              printLinkedList(curr);
              if (prev == null) {
                  returnPointNode = curr;
              } else {
                  prev.next = curr;
              }
              startPoint.next = next;
              prev=startPoint;
              startPoint=next;
          }
          curr=next;
          count++;
      }
      return returnPointNode;
  }
