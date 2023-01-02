  public static boolean isPossible(ArrayList<Integer> A,int target,int students){
      int studentCount=1;
      int total=0;
      for(int bookPages:A){
          if(total+bookPages>target){
              studentCount+=1;
              total=bookPages;
              if(studentCount>students) return false;
          }else{
              total+=bookPages;
          }
      }
      return studentCount <= students;
  }

  public static int books(ArrayList<Integer> A, int B) {
      if(B>A.size()) return -1;
      int low=A.get(0);
      int high=0;
      for (Integer integer : A) {
          high += integer;
          low=Math.max(low,integer);
      }
      int ans=-1;
      while(low<=high){
          int mid=low+(high-low)/2;
          System.out.println(mid);
          if(isPossible(A,mid,B)){
              ans=mid;
              high=mid-1;
          }else{
              low=mid+1;
          }
      }
      return ans;
  }
