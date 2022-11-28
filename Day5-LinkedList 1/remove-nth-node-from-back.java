  public static Node removeNode(Node head,int n){
      Node ans=new Node(0);
      ans.next=head;
      Node slow=ans;
      Node fast=ans;

      for(int i=1;i<=n;i++){
          fast=fast.next;
      }
      while(fast.next!=null){
          fast=fast.next;
          slow=slow.next;
      }
      slow.next=slow.next.next;
      return ans.next;
  }
