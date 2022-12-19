  public static void combinationsArray(int index, int[] arr, List<Integer> ls,List<List<Integer>> ans){
      ans.add(new ArrayList<>(ls));
      for(int i=index;i<arr.length;i++){
          if(i!=index && arr[i]==arr[i-1])continue;
          ls.add(arr[i]);
          combinationsArray(i+1,arr,ls,ans);
          ls.remove(ls.size()-1);
      }
  }

  public static List<List<Integer>> subset2(int[] arr){
      Arrays.sort(arr);
      List<List<Integer>> ans=new ArrayList<>();
      combinationsArray(0,arr,new ArrayList<>(),ans);
      return ans;
  }
