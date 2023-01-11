  public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
  {
      PriorityQueue<Integer> pq=new PriorityQueue<>();
      for(ArrayList<Integer> arr:kArrays){
          pq.addAll(arr);
      }

      ArrayList<Integer> ans=new ArrayList<>();
      while(!pq.isEmpty()){
          ans.add(pq.poll());
      }
      return ans;
  }
