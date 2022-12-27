 public static void solveWordBreak(int index, String s, List<String> wordDict, List<String> tempS , List<String> ans){
      if(index==s.length()){
          ans.add(String.join(" ",tempS));
          return;
      }
      StringBuilder t=new StringBuilder();
      for(int i=index;i<s.length();i++){
          t.append(s.charAt(i));
          if(wordDict.contains(t.toString())){
              tempS.add(t.toString());
              solveWordBreak(i+1,s,wordDict,tempS,ans);
              tempS.remove(tempS.size()-1);
          }
      }
  }

  public static List<String> wordBreak(String s,List<String> wordDict){
      List<String> ans= new ArrayList<>();
      List<String> tempS=new ArrayList<>();
      solveWordBreak(0,s,wordDict,tempS,ans);
      return ans;
  }
