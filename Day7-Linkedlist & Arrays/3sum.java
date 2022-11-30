  public static ArrayList<ArrayList<Integer>> threeSum(int[] arr){
      Arrays.sort(arr);
      int n=arr.length;
      ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
      for(int i=0;i<n-2;i++){
          if(i>0 && arr[i]==arr[i-1]) continue;
          int low=i+1,high=n-1,sum= -arr[i];
          while(low<high){
              int t=arr[low]+arr[high];
              if(t<sum) low++;
              else if(t>sum) high--;
              else{
                  ArrayList<Integer> temp=new ArrayList<>(Arrays.asList(arr[i],arr[low],arr[high]));
                  ans.add(temp);

                  while (low < high && arr[low] == arr[low + 1]) low++;
                  while (low < high && arr[high] == arr[high - 1]) high--;

                  low++;
                  high--;
              }
          }
      }
      return ans;
  }
