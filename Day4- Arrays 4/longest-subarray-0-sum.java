  public static int longestSubarrayWithZeroSum(int[] nums){
      HashMap<Integer,Integer> hash=new HashMap<>();
      int maxi=0;
      int sum=0;
      for(int i=0;i<nums.length;i++){
          sum+=nums[i];
          if(sum==0){
              maxi=i+1;
          }else{
              if(hash.get(sum)!=null){
                  maxi=Math.max(maxi,i-hash.get(sum));
              }else{
                  hash.put(sum,i);
              }
          }
      }
      return maxi;
  }
