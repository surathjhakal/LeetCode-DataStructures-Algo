  public static void kLargest(int a[], int n, int k)
  {
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

      for (int i = 0; i < n; ++i) {
          pq.add(a[i]);
          if (pq.size() > k) {
              pq.poll();
          }
      }

      while (!pq.isEmpty()) {
          System.out.print(pq.peek() + " ");
          pq.poll();
      }
      System.out.println();
  }

  public static void kSmallest(int a[], int n, int k)
  {
      PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
      for (int i = 0; i < n; ++i) {
          pq.add(a[i]);
          if (pq.size() > k) {
              pq.poll();
          }
      }
      while (!pq.isEmpty()) {
          System.out.print(pq.peek() + " ");
          pq.poll();
      }
  }
