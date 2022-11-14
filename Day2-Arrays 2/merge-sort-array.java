  public static void customSort(int[] arr){
      for(int i=0;i< arr.length-1;i++){
          if(arr[i]>arr[i+1]){
              int temp=arr[i];
              arr[i]=arr[i+1];
              arr[i+1]=temp;
          }else{
              break;
          }
      }
  }
  public static void merge(int[] arr1, int m, int[] arr2, int n) {
      if(m+n<=0) return;
      if(m==0){
          for(int i=0;i<arr2.length;i++) {     
              arr1[i] = arr2[i];     
          }
          return;
      }
      if(n==0){
          return;
      }
      int f1=0;
      while(f1<m){
          if(arr1[f1]<=arr2[0]){
              f1++;
          } else {
              int temp=arr1[f1];
              arr1[f1]=arr2[0];
              arr2[0]=temp;
              f1++;
              customSort(arr2);
          }
      }
      for(int i=m;i<m+n;i++){
          arr1[i]=arr2[i-m];
      }
  }
