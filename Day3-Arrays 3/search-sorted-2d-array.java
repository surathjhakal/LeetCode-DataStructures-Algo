  public static boolean binarySearch(int[] arr,int target){
      int start=0;
      int end=arr.length;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(target<arr[mid]){
              end=mid-1;
          }else if(target>arr[mid]){
              start=mid+1;
          }else{
              return true;
          }
      }
      return false;
  }
  public static boolean searchSorted2dArray(int[][] arr,int target){
      int start=0;
      int end=arr.length-1;
      int m=arr[0].length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(target<arr[mid][0]){
              end=mid-1;
          }else if(target>arr[mid][m]){
              start=mid+1;
          }else{
              return binarySearch(arr[mid],target);
          }
      }
      return false;
  }
