  public static double customPow(double x, int y) {
      double ans = 1.0;
      long n = y;
      if (n < 0) n = -1 * n;
      while (n > 0) {
          if (n % 2 == 1) {
              ans = ans * x;
              n = n - 1;
          } else {
              x = x * x;
              n = n / 2;
          }
      }
      if (y < 0) ans = (double)(1.0) / (double)(ans);
      return ans;
  }
