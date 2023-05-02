  public String longestPalindrome(String s) {
      String ans="";
      int n=s.length();
      if(n<=1) return s.charAt(0)+"";
      for(int times=1;times<=2;times++){
          for(int i=0;i<n;i++){
              int left=i;
              int right=times==1?i:i+1;
              while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                  left--;right++;
              }
              if(ans.length()<right-left-1){
                  ans=s.substring(left+1,right);
              }
          }
      }
      return ans;
  }
