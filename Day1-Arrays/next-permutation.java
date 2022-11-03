  public static void nextPermutation(int[] nums){
      if(nums == null || nums.length <= 1) return;
      int i = nums.length - 2;
      while(i >= 0 && nums[i] >= nums[i + 1]) i--;
      if(i >= 0) {
          int j =nums.length - 1;
          while(nums[j] <= nums[i]) j--;
          swap(i, j,nums);
      }
      reverse(i+1,nums);
  }
