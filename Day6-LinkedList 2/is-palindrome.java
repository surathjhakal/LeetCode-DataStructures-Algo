  public static boolean isPalindrome(Node head) {
      if(head==null||head.next==null) return true;

      Node slow = head;
      Node fast = head;

      while(fast.next!=null&&fast.next.next!=null) {
          slow = slow.next;
          fast = fast.next.next;
      }

      Node midPoint=reverseLinkedList(slow.next);
      Node tempMid=midPoint;
      Node dummy = head;

      while(tempMid!=null) {
          if(dummy.value != tempMid.value) break;
          dummy = dummy.next;
          tempMid = tempMid.next;
      }
      reverseLinkedList(midPoint);
      return tempMid == null;
  }
