  public static int[] twoSum(int[] arr,int target){
      HashMap<Integer,Integer> hash=new HashMap<>();
      for(int i=0;i<arr.length;i++){
          int r=target-arr[i];
          if(hash.containsKey(r)){
              return new int[]{hash.get(r),i};
          }else{
              hash.put(arr[i],i);
          }
      }
      return new int[]{-1,-1};
  }
