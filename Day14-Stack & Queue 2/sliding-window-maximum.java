  public static int[] maxSlidingWindow(int[] nums, int k) {
      Deque<Integer> maxi=new ArrayDeque<>();
      int[] ans=new int[nums.length-k+1];
      for(int i=0;i<nums.length;i++){
          while(!maxi.isEmpty() && maxi.peekFirst()< i-k+1){
              maxi.pollFirst();
          }

          while(!maxi.isEmpty() && nums[maxi.peekLast()]<nums[i]){
              maxi.pollLast();
          }

          maxi.addLast(i);
          if(i-k+1>=0){
              ans[i-k+1]=nums[maxi.peekFirst()];
          }
      }
      return ans;
  }
