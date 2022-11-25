  public static int longestSubstringWithoutRepeatingCharacters(String s){
      HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();
      int left=0,right=0;
      int count=0;
      int n=s.length();
      while(right<n){
          if(mpp.containsKey(s.charAt(right))){
              int val=mpp.get(s.charAt(right));
              if(val>=left){
                  left=mpp.get(s.charAt(right))+1;
              }
          }
          mpp.put(s.charAt(right),right);
          count=Math.max(count,right-left+1);
          right++;
      }
      return count;
  }
