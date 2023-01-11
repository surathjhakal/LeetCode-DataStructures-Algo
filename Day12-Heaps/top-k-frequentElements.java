public int[] topKFrequent(int[] nums, int k) {
  HashMap<Integer,Integer> uniqueElements=new HashMap<>();
  for(int num:nums){
      if(uniqueElements.containsKey(num)){
          uniqueElements.put(num,uniqueElements.get(num)+1);
      }else{
          uniqueElements.put(num,1);
      }
  }

  PriorityQueue<FrequentPair> pq=new PriorityQueue<>(k,(a,b)->a.count-b.count);

  uniqueElements.forEach((key,value)->{
      if(pq.size()<k){
          pq.add(new FrequentPair(key,value));
      }else if(value>pq.peek().count){
          pq.poll();
          pq.add(new FrequentPair(key,value));
      }
  });

  int[] ans=new int[k];
  for(int i=0;i<k;i++){
      FrequentPair p=pq.poll();
      ans[i]=p.num;
  }
  return ans;
}
