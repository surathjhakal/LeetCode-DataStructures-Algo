  public static int countNumbers(int target,ArrayList<Integer> arr){
      int low=0,high=arr.size()-1;
      int count=0;
      while(low<=high){
          int mid=low+(high-low)/2;
          if(target>arr.get(mid)) {
              count=mid+1;
              low=mid+1;
          }else{
              high=mid-1;
          }
      }
      return count;
  }
  public int findMedian(ArrayList<ArrayList<Integer>> arr) {
      int n = arr.size(), m = arr.get(0).size();
      int low=1,high=Integer.MAX_VALUE;
      int ans=0;
      while(low<=high){
          int mid=low+(high-low)/2;
          int count=0;
          for (ArrayList<Integer> integers : arr) {
              count += countNumbers(mid, integers);
          }
          if(count <= (n*m)/2){
              ans = mid;
              low = mid + 1;
          }else high = mid - 1;
      }
      return ans;
  }
