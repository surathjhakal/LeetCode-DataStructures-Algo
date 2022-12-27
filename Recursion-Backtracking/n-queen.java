  public static void recurQueens(int n,boolean[][] board,int row,List<List<String>> ans){
      if(row>=n){
          List<String> temp=new ArrayList<>();
          for(boolean[] r:board){
              StringBuilder s=new StringBuilder();
              for(boolean c:r){
                  s.append(c?"Q":".");
              }
              temp.add(s.toString());
          }
          ans.add(new ArrayList<>(temp));
          return;
      }
      for(int col=0;col<n;col++){
          if(!board[row][col] && checkTop(board,row-1,col) && checkLeftDiagonal(board,row-1,col-1) && checkRightDiagonal(board,row-1,col+1)){
              board[row][col]=true;
              recurQueens(n,board,row+1,ans);
              board[row][col]=false;
          }
      }

  }

  public static boolean checkTop(boolean[][] board,int row,int col){
      while(row>=0){
          if(board[row--][col]) return false;
      }
      return true;
  }

  public static boolean checkLeftDiagonal(boolean[][] board,int row,int col){
      while(row>=0 && col>=0){
          if(board[row--][col--]) return false;
      }
      return true;
  }

  public static boolean checkRightDiagonal(boolean[][] board,int row,int col){
      while(row>=0 && col<board.length){
          if(board[row--][col++]) return false;
      }
      return true;
  }

  public static List<List<String>> nQueens(int n){
      boolean[][] board=new boolean[n][n];
      List<List<String>> ans=new ArrayList<>();
      recurQueens(n,board,0,ans);
      return ans;
  }
