  public static boolean isPossible(int[] arr, int n, int cows, int minDist) {
      int cntCows = 1;
      int lastPlacedCow = arr[0];
      for (int i = 1; i < n; i++) {
          if (arr[i] - lastPlacedCow >= minDist) {
              cntCows++;
              lastPlacedCow = arr[i];
          }
      }
      return cntCows >= cows;
  }
  public static int aggressiveCows(int[] arr,int n,int cows) {
      Arrays.sort(arr);
      int low = 1, high = arr[n - 1] - arr[0];
      while (low <= high) {
          int mid = (low + high) >> 1;
          if (isPossible(arr, n, cows, mid)) {
              low = mid + 1;
          } else {
              high = mid - 1;
          }
      }
      return high;
  }
