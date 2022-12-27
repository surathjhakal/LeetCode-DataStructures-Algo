  public static void solveMaze(int n,int row,int col,int[][] m,StringBuilder s ,ArrayList<String> ans){
      if(row==n-1 && col==n-1){
          ans.add(s.toString());
          return;
      }
      // Right
      if(col+1<n && m[row][col+1]!=0 && m[row][col+1]!=-1){
          s.append("R");
          m[row][col]=-1;
          solveMaze(n,row,col+1,m,s,ans);
          s.deleteCharAt(s.length()-1);
          m[row][col]=1;
      }

      // Down
      if(row+1<n && m[row+1][col]!=0 && m[row+1][col]!=-1){
          s.append("D");
          m[row][col]=-1;
          solveMaze(n,row+1,col,m,s,ans);
          s.deleteCharAt(s.length()-1);
          m[row][col]=1;
      }

      // Left
      if(col-1>=0 && m[row][col-1]!=0 && m[row][col-1]!=-1){
          s.append("L");
          m[row][col]=-1;
          solveMaze(n,row,col-1,m,s,ans);
          s.deleteCharAt(s.length()-1);
          m[row][col]=1;
      }

      // Up
      if(row-1>=0 && m[row-1][col]!=0 && m[row-1][col]!=-1){
          s.append("U");
          m[row][col]=-1;
          solveMaze(n,row-1,col,m,s,ans);
          s.deleteCharAt(s.length()-1);
          m[row][col]=1;
      }
  }

  public static ArrayList<String> Maze(int n,int[][] m){
      ArrayList<String> ans= new ArrayList<>();
      StringBuilder s=new StringBuilder();
      solveMaze(n,0,0,m,s,ans);
      return ans;
  }
