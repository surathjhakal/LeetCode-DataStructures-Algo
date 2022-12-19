  public static void getCombinationsResult(int[] arr,int i,int n,int sum,ArrayList<Integer> sumset)     {
      if(i==n){
          sumset.add(sum);
          return;
      }
      getCombinationsResult(arr,i+1,n,sum+arr[i],sumset);
      getCombinationsResult(arr,0,n,sum,sumset);
  }

  public static ArrayList<Integer> sumSubset(int[] arr){
      ArrayList<Integer> sumset = new ArrayList<>();
      int sum = 0;
      int n = arr.length;
      getCombinationsResult(arr,0,n,sum,sumset);
      Collections.sort(sumset);
      return sumset;
  }
