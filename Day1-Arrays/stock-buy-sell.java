  public static int stockBuySell(int[] arr){
      int maxProfit=Integer.MIN_VALUE;
      int highest=arr.length-1;
      for(int i=highest-1;i>=0;i--){
          int p=arr[highest]-arr[i];
          if(p>maxProfit){
              maxProfit=p;
          }
          if(arr[i]>arr[highest]){
              highest=i;
          }
      }
      if(maxProfit<0){
          maxProfit=0;
      }
      return maxProfit;
  }
