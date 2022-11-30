  public static int trapRainWater(int[] height){
      int n=height.length;
      int maxLeft=0,maxRight=0;
      int count=0;
      int left=0,right=n-1;
      while(left<=right){
          if(height[left]<=height[right]){
              if(height[left]>=maxLeft) maxLeft=height[left];
              else count+=maxLeft-height[left];
              left++;
          }else{
              if(height[right]>=maxRight) maxRight=height[right];
              else count+=maxRight-height[right];
              right--;
          }
      }
      return count;
  }
