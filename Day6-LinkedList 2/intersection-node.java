  public static Node intersectionNode(Node head1,Node head2){
      Node storeh1=head1;
      Node storeh2=head2;
      while(storeh1!=storeh2){
          storeh1 = storeh1 == null? head2:storeh1.next;
          storeh2 = storeh2 == null? head1:storeh2.next;
      }
      return storeh1;
  }
