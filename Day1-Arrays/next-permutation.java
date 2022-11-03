  public static void reverse(int startPointer,int[] nums){
      int pointer1=startPointer;
      int pointer2=nums.length-1;
      while(pointer1<pointer2){
          swap(pointer1++,pointer2--,nums);
      }
  }

  public static void swap(int i,int j, int[] nums){
      int temp=nums[i];
      nums[i]=nums[j];
      nums[j]=temp;
  }
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
