class MedianFinder {

  PriorityQueue<Integer> maxPq=new PriorityQueue<>(Collections.reverseOrder());
  PriorityQueue<Integer> minPq=new PriorityQueue<>();


  public MedianFinder() {

  }

  public void addNum(int num) {
      if(maxPq.size()==0) {
          maxPq.add(num);
      }else if(maxPq.peek()>num){
          maxPq.add(num);
      }else{
          minPq.add(num);
      }

      if(maxPq.size()>minPq.size()+1){
          minPq.add(maxPq.poll());
      }else if(minPq.size()>maxPq.size()){
          maxPq.add(minPq.poll());
      }
      //System.out.println("Add:"+maxPq.peek()+"-"+minPq.peek());
  }

  public double findMedian() {
      //System.out.println(maxPq.peek()+"-"+minPq.peek());
      if((maxPq.size()+minPq.size())%2==0){
          return (maxPq.peek()+minPq.peek())/2.0;
      }
      return maxPq.peek();
  }
}
