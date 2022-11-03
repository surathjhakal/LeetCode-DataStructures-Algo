  public static int maximumSubarray(int[] arr){
      int maximum=Integer.MIN_VALUE;
      int total=0;
      for(int num:arr){
          total+=num;
          if(total>maximum){
              maximum=total;
          }
          if(total<0){
              total=0;
          }
      }
      return maximum;
  }
