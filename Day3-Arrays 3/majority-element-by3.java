  public static ArrayList<Integer> majorityElementNBy3(int[] nums){
      int num1=-1,num2=-1,c1=0,c2=0;
      for(int num:nums){
          if(num==num1){
              c1++;
          }else if(num==num2){
              c2++;
          } else if (c1 == 0) {
              num1=num;
              c1=1;
          }else if(c2==0){
              num2=num;
              c2=1;
          }else{
              c1--;
              c2--;
          }
      }
      ArrayList<Integer> ans=new ArrayList<>(2);
      int num1Count=0,num2Count=0;
      for(int num:nums){
          if(num==num1) num1Count++;
          else if(num==num2) num2Count++;
      }
      if(num1Count>nums.length/3) ans.add(num1);
      if(num2Count>nums.length/3) ans.add(num2);
      return ans;
  }
