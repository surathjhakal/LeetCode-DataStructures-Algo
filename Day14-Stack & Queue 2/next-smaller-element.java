  public static ArrayList<Integer> nextSmaller(ArrayList<Integer> A) {
      Stack<Integer> st=new Stack<>();
      ArrayList<Integer> ans=new ArrayList<>();
      for(Integer number: A){
          while(!st.isEmpty() && st.peek()>=number){
              st.pop();
          }
          if(st.isEmpty()){
              ans.add(-1);
          }else{
              ans.add(st.peek());
          }
          st.add(number);
      }
      return ans;
  }
