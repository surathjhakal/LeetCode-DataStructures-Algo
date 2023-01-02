  public static int getPivot(int[] arr){
      int start=0,end=arr.length-1;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(mid+1>=arr.length || arr[mid]>arr[mid+1])return mid;
          else if(arr[start]>arr[mid]) end=mid-1;
          else start=mid+1;
      }
      return -1;
  }

  public static int binarySearch(int[] arr, int target, int low,int high){
      int start=low;
      int end=high;
      while(start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]==target) return mid;
          else if(arr[mid]<target) start=mid+1;
          else end=mid-1;
      }
      return -1;
  }

  public static int search(int[] arr,int target){
      int pivot=getPivot(arr);
      if(target>=arr[0] && target<=arr[pivot]){
          return binarySearch(arr,target,0,pivot);
      }
      return binarySearch(arr,target,pivot, arr.length-1);
  }
