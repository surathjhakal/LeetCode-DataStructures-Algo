  public static int[][] merge(int[][] intervals) {
      if(intervals.length<=1) return intervals;
      Arrays.sort(intervals, Comparator.comparingInt(arr->arr[0]));
      Stack<int[]> stack = new Stack();

      int startValue=intervals[0][0];
      int maxValue=intervals[0][1];
      for(int i=1;i<intervals.length;i++){
          if(maxValue>=intervals[i][0]){
              if(intervals[i][1]>maxValue){
                  maxValue=intervals[i][1];
              }
          }else{
              stack.add(new int[]{startValue,maxValue});
              startValue=intervals[i][0];
              maxValue=intervals[i][1];
          }
          if(i+1==intervals.length){
              stack.add(new int[]{startValue,maxValue});
          }
      }
      int[][] ans=new int[stack.size()][2];
      for(int i=ans.length-1;i>=0;i--){
          int []poparray = stack.pop();
          ans[i][0] = poparray[0];
          ans[i][1] = poparray[1];
      }
      return ans;
  }
