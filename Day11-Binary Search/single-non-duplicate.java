  public static int singleNonDuplicate(int[] nums) {
      int low=0,high=nums.length-1;
      while(low<=high){
          int mid=low+(high-low)/2;
          boolean checkEven=mid%2==0;
          //System.out.println(low+"-"+mid+"-"+high);
          if((((mid - 1) < 0) || (nums[mid - 1] != nums[mid])) && (((mid + 1) >= nums.length) || (nums[mid + 1] != nums[mid]))){
              return nums[mid];
          }else if((checkEven && (mid+1<nums.length && nums[mid]==nums[mid+1])) || (!checkEven && (nums[mid-1]==nums[mid]))){
              low=mid+1;
          }else{
              high=mid-1;
          }
      }
      return -1;
  }
