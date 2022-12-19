    public static void findCombinationSum2(int index,int target,int[] arr, List<Integer> ls,HashSet<List<Integer>> ans){
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
        for(int i=index;i<arr.length;i++){
            if(i!=index && arr[i]==arr[i-1]) continue;
            ls.add(arr[i]);
            findCombinationSum2(i+1,target-arr[i],arr,ls,ans);
            ls.remove(ls.size()-1);
        }
    }

    public static List<List<Integer>> combinationsSum2(int[] arr,int target){// HELLO ME TAMANNA  HERE HEH
        Arrays.sort(arr);
        HashSet<List<Integer>> ans=new HashSet<>();
        findCombinationSum2(0,target,arr,new ArrayList<>(),ans);
        List<List<Integer>> newAns=new ArrayList<>();
        for(List<Integer> list:ans){
            newAns.add(new ArrayList<>(list));
        }
        return newAns;
    }
