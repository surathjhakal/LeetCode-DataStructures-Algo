    public static ArrayList<ArrayList<Integer>> pascalTraingle(int n){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(n==0) return list;
        list.add(new ArrayList<Integer>(Arrays.asList(1)));
        for(int i=2;i<=n;i++){
            ArrayList<Integer> newList=new ArrayList<>();
            newList.add(1);
            for(int j=0;j<i-2;j++){
                int ans=list.get(i-2).get(j)+list.get(i-2).get(j+1);
                System.out.println(ans);
                newList.add(ans);
            }
            newList.add(1);
            list.add(newList);
        }
        return list;
    }
