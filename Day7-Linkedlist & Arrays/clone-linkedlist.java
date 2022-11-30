  public static Node cloneList(Node head){
      Node list=new Node(0);
      Node storeClone=list;
      Node temp=head;

      while(temp!=null){
          Node TN=new Node(temp.value);
          list.next=TN;
          list=list.next;
          temp=temp.next;
      }

      Node tempClone=storeClone.next;
      temp=head;
      while(temp!=null){
          Node storeTempNext=temp.next;
          Node storeCloneNext=tempClone.next;
          temp.next=tempClone;
          tempClone.next=storeTempNext;
          tempClone=storeCloneNext;
          temp=storeTempNext;
      }
      temp=head;
      while(temp!=null && temp.next!=null){
          if(temp.random!=null){
              temp.next.random=temp.random.next;
          }else{
              temp.next.random=null;
          }
          temp=temp.next.next;
      }
      temp=head;
      Node cloneTemp=storeClone;
      while(temp!=null){
          Node storeTempClone=temp.next;
          temp.next=temp.next.next;
          cloneTemp.next=storeTempClone;
          cloneTemp=cloneTemp.next;
          cloneTemp.next=null;
          temp=temp.next;
      }
      return storeClone.next;
  }
