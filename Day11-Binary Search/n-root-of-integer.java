  public static double power(double m, int n) {
      double ans = 1;
      while (n > 0) {
          if (n % 2 == 1) {
              ans *= m;
              n--;
          }
          m *= m;
          n /= 2;
      }
      return ans;
  }
  public static double findNthRootOfM(int n, int m){
      double low = 0;
      double high = m;
      while (low<=high) {
          double middle = (low + high) / 2;
          double ans = power(middle, n);
          ans=Math.round(ans * Math.pow(10, 6)) / Math.pow(10, 6);
          if (ans<m) {
              low = middle;
          } else if(ans>m) {
              high = middle;
          }else{
              return Math.round(middle * Math.pow(10, 6)) / Math.pow(10, 6);
          }
      }
      return -1;
  }
