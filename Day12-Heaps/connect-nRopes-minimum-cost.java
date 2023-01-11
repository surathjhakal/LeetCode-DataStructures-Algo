  public static int connectRopes(int[] ropes) {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      int cost=0;
      for(int rope:ropes){
          pq.add(rope);
      }
      while(pq.size()>1){
          int newRope=pq.poll()+pq.poll();
          System.out.println(newRope);
          cost+=newRope;
          pq.add(newRope);
      }
      return cost;
  }
