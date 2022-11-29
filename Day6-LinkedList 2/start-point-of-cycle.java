  public static Node startPoint(Node head){
      if(head == null||head.next == null) return null;

      Node fast = head;
      Node slow = head;
      Node entry = head;

      while(fast.next != null&&fast.next.next != null) {
          slow = slow.next;
          fast = fast.next.next;

          if(slow == fast) {
              while(slow != entry) {
                  slow = slow.next;
                  entry = entry.next;
              }
              return slow;
          }
      }
      return null;
  }
