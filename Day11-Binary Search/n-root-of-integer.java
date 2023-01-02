  public static double findNthRootOfM(int n, int m){
      double s=0;
      double l=m;
      while(s<=l){
          System.out.println(s+"-"+l);
          double mid=(l+s)/2.0;
          int count=n;
          double ans=1.0;
          while(count>0 && ans<=m){
              ans*=mid;
              count--;
          }
          System.out.println(count+"-"+ans);
//            ans=Math.round(ans*1000000)/1000000.0;
          if(count==0 && ans==m) return Math.round(mid*1000000)/1000000.0;
          if(ans<m){
              s=mid;
          }else{
              l=mid;
          }

      }
      return -1;
  }
