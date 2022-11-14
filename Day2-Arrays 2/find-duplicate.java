  public static int findDuplicate(int[] arr) {
      for(int i=1;i<arr.length+1;i++){
          while(arr[i-1]!=i){
              if(arr[i-1]==arr[arr[i-1]-1]){
                  return arr[i-1];
              }else{
                  int temp=arr[arr[i-1]-1];
                  arr[arr[i-1]-1]=arr[i-1];
                  arr[i-1]=temp;
              }
          }
      }
      return -1;
  }
