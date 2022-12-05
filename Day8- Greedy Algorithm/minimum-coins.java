  public static int minCoins(int V){
      int[] totalCoins={1, 2, 5, 10, 20, 50, 100, 500, 1000};
      int count=0;
      for(int i=totalCoins.length-1;i>=0;i--){
          while(totalCoins[i]<=V){
              V-=totalCoins[i];
              count++;
          }
      }
      return count;
  }
