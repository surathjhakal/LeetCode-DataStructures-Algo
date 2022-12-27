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

  public static boolean graphColoring(List < Integer > [] G, int[] color, int i, int C) {
      // Your code here
      int n = G.length;
      return solve(i, G, color, n, C);
  }
