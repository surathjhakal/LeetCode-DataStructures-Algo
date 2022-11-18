  public static void sortMerge(int[] arr,int low,int mid, int high){
      int[] newArr=new int[high-low+1];
      int newListCount=0;
      int newLow=low,newHigh=mid+1;
      while(newLow<=mid && newHigh<=high){
          if(arr[newLow]>arr[newHigh]){
              newArr[newListCount]=arr[newHigh];
              newHigh++;
          }else{
              newArr[newListCount]=arr[newLow];
              newLow++;
          }
          newListCount++;
      }
      while(newLow<=mid){
          newArr[newListCount]=arr[newLow];
          newListCount++;
          newLow++;
      }
      while(newHigh<=high){
          newArr[newListCount]=arr[newHigh];
          newListCount++;
          newHigh++;
      }
      if (high + 1 - low >= 0) System.arraycopy(newArr, 0, arr, low, high + 1 - low);
  }

  public static int getCount(int[] arr,int low,int mid, int high){
      int tempCount=0;
      int left=low,right=mid+1;
      while(left<=mid && right<=high){
          if(arr[left]>(long)arr[right]*2){
              tempCount++;
              right++;
          }else{
              left++;
              if(left<=mid){
                  tempCount+=(right-mid-1);
              }
          };
      }
      if(left<mid){
          tempCount+=(mid-left)*(right-mid-1);
      }
      return tempCount;
  }

  public static int mergeSort(int[] arr,int low,int high){
      if(high<=low){
          return 0;
      }
      int mid=(low+high)/2;
      int leftCount=mergeSort(arr,low,mid);
      int rightCount=mergeSort(arr, mid+1, high);

      int tempCount=leftCount+rightCount;
      tempCount+=getCount(arr,low,mid,high);
      sortMerge(arr,low,mid,high);
      return tempCount;
  }

  public static int countReversePair(int[] arr){
        return mergeSort(arr,0,arr.length-1);
    }
