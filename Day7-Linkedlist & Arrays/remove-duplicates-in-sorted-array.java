  public static int removeDuplicatesInSortedArray(int[] arr){
      int store=0;
      for(int i=0;i<arr.length;i++){
          arr[store]=arr[i];
          while(i+1<arr.length && arr[store]==arr[i+1]){
              i++;
          }
          store++;
      }
      return store;
  }
