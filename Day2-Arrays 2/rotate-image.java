  public static void rotate(int[][] arr){
      for (int i = 0; i < arr.length; i++) {
          for (int j = i; j < arr[0].length; j++) {
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp;
          }
      }

      for (int i = 0; i < arr.length; i++) {
          int start=0;
          int last=arr[0].length-1;

          while(start<last){
              int temp = arr[i][start];
              arr[i][start] = arr[i][last];
              arr[i][last] = temp;
              start++;
              last--;
          }
      }
  }
