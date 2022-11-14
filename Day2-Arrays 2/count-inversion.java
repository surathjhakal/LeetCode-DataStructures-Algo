  public static int countInversion(int[] arr){
      if(arr.length==1){
          return 0;
      }
      int mid=arr.length/2;
      int[] leftArr=Arrays.copyOfRange(arr, 0, mid);
      int[] rightArr=Arrays.copyOfRange(arr, mid, arr.length);
      int countleft=countInversion(leftArr);
      int countRight=countInversion(rightArr);

      int tempCount=0;
      for(int i=0;i<leftArr.length;i++){
          for(int j=0;j<rightArr.length;j++){
              if(leftArr[i]>rightArr[j]){
                  tempCount++;
              }
          }
      }
      int totalCount=countleft+countRight+tempCount;
      return totalCount;
  }
