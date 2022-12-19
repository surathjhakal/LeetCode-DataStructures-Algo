  public static void findCombinationSum1(int index,int target,int[] arr, List<Integer> ls,List<List<Integer>> ans){
      if(target==0){
          ans.add(new ArrayList<>(ls));
          return;
      }
      if(index==arr.length){
          return;
      }
      if(target<arr[index]){
          return;
      }
      ls.add(arr[index]);
      findCombinationSum1(index,target-arr[index],arr,ls,ans);
      ls.remove(ls.size()-1);
      findCombinationSum1(index+1,target,arr,ls,ans);
  }

  public static List<List<Integer>> combinationsSum1(int[] arr,int target){
      Arrays.sort(arr);
      List<List<Integer>> ans=new ArrayList<>();
      findCombinationSum1(0,target,arr,new ArrayList<>(),ans);
      return ans;
  }
