  public static Node mergeSortedLinkedList(Node l1,Node l2){
      if(l1==null) return l2;
      if(l2==null) return l1;

      if(l1.value>l2.value){
          Node tempNode=l1;
          l1=l2;
          l2=tempNode;
      }
      Node ans=l1;
      while(l2 != null){
          Node tmp=null;
          while(l1!=null && l1.value<=l2.value){
              tmp=l1;
              l1=l1.next;
          }
          tmp.next=l2;

          Node temp=l1;
          l1=l2;
          l2=temp;
      }
      return ans;
  }
