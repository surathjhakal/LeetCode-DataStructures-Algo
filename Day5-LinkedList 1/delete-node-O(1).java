  public static void deleteNode(Node node){
      if(node==null) return;
      node.value=node.next.value;
      node.next=node.next.next;
  }
