  public static List<List<Integer>> fourSum(int[] arr,int target){
      Arrays.sort(arr);
      List<List<Integer>> list=new ArrayList<>();
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              int f=j+1;
              int l= arr.length-1;
              while(f<l){
                  long r=target-((long)arr[i]+(long)arr[j]);
                  long v=(long)arr[f]+(long)arr[l];
                  if(v<r){
                      f++;
                  }else if(v>r){
                      l--;
                  }else{
                      list.add(new ArrayList<>(Arrays.asList(arr[i],arr[j],arr[f],arr[l])));
                      f++;
                      l--;
                  }
              }
          }
      }
      List<List<Integer>> newList=new ArrayList<>();
      for (List<Integer> element : list) {
          if (!newList.contains(element)) {
              newList.add(element);
          }
      }
      return newList;
  }
