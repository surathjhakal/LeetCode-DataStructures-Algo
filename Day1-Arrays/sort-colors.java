  public static void swap(int i,int j, int[] nums){
      int temp=nums[i];
      nums[i]=nums[j];
      nums[j]=temp;
  }  
  public static void sortColors(int[] arr){
      int low=0;
      int mid=0;
      int high=arr.length-1;
      while(mid<=high){
          if(arr[mid]==0){
              swap(low++,mid++,arr);
          }else if(arr[mid]==1){
              mid++;
          }else{
              swap(mid,high--,arr);
          }
      }
  }
