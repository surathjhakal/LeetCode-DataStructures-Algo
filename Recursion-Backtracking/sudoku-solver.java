  public static boolean solveSudoku(char[][] board) {
      for (int i = 0; i < 9; i++) {
          for (int j = 0; j < 9; j++) {
              if (board[i][j] == '.') {

                  for (char c = '1'; c <= '9'; c++) {
                      if (isValid(board, i, j, c)) {
                          board[i][j] = c;

                          if (solveSudoku(board))
                              return true;
                          else
                              board[i][j] = '.';
                      }
                  }

                  return false;
              }
          }
      }
      return true;
  }

  public static boolean isSafe(int node, List < Integer > [] G, int[] color, int n, int col) {
      for (int it: G[node]) {
          if (color[it] == col) return false;
      }
      return true;
  }
  public static boolean solve(int node, List < Integer > [] G, int[] color, int n, int m) {
      if (node == n) return true;

      for (int i = 1; i <= m; i++) {
          if (isSafe(node, G, color, n, i)) {
              color[node] = i;
              if (solve(node + 1, G, color, n, m)) return true;
              color[node] = 0;
          }
      }
      return false;
  }
