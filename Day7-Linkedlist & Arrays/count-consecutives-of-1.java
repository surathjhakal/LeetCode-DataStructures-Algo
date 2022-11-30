  public static int countConsecutive1s(int[] arr){
      int count=0;
      int maximum=0;
      for (int j : arr) {
          if (j == 1) count++;
          else count = 0;
          if (count > maximum) {
              maximum = count;
          }
      }
      return maximum;
  }
