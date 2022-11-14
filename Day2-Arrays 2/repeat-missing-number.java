  public static int[] findDuplicateMissing(int[] arr){
      int duplicate=-1;
      int missing=-1;
      for(int i=1;i<arr.length+1;i++){
          while(arr[i-1]!=i){
              if(arr[i-1]==arr[arr[i-1]-1]){
                  duplicate=arr[i-1];
                  missing=i;
                  break;
              }else{
                  int temp=arr[arr[i-1]-1];
                  arr[arr[i-1]-1]=arr[i-1];
                  arr[i-1]=temp;
              }
          }
      }
      return new int[]{duplicate,missing};
  }
