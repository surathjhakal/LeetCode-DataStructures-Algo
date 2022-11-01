public static void setMatrixZero(int[][] arr){
        int rowLength=arr.length;
        int colLength=arr[0].length;
        boolean row0=false;
        boolean col0=false;

        // To Find if row0 & col0 have any zero or not
        for(int i=0;i<colLength;i++){
            if(arr[0][i]==0){
                row0=true;
            }
        }
        for(int i=0;i<rowLength;i++){
            if(arr[i][0]==0){
                col0=true;
            }
        }

        // Check and the position top & left side of array with 0
        for(int i=1;i<rowLength;i++){
            for(int j=1;j<colLength;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        // Iterating through top side & if any zeros present then mark that column with 0
        for(int i=1;i<colLength;i++){
            if(arr[0][i]==0){
                for(int j=1;j<rowLength;j++){
                    if(arr[j][i]!=0){
                        arr[j][i]=0;
                    }
                }
            }
        }
        // Iterating through left side & if any zeros present then mark that row with 0
        for(int i=1;i<rowLength;i++){
            if(arr[i][0]==0){
                for(int j=1;j<colLength;j++){
                    if(arr[i][j]!=0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        // Mark Col0 & row0 to 0 if they are true
        if(row0){
            for(int i=0;i<colLength;i++){
                if(arr[0][i]!=0){
                    arr[0][i]=0;
                }
            }
        }
        if(col0){
            for(int i=0;i<rowLength;i++){
                if(arr[i][0]!=0){
                    arr[i][0]=0;
                }
            }
        }
    }
