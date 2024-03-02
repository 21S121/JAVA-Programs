class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer>ans=new ArrayList<>();
        
        int maxrow=arr.length-1;
        int maxcol=arr[0].length-1;
        int minrow=0;
        int mincol=0;
        int tct=(maxrow+1)*(maxcol+1);
        int cnt=0;
        while(cnt<tct)
        {
            for(int r=minrow,c=mincol;c<=maxcol&&tct>cnt;c++,cnt++)//col vary mincol-----------maxcol  TOP
              ans.add(arr[r][c]);
            minrow++;
            for(int r=minrow,j=maxcol;r<=maxrow&&tct>cnt;r++,cnt++)//row vary minrow----------maxrow  RIGHT
              ans.add(arr[r][j]);
            maxcol--;
            for(int r=maxrow,c=maxcol;c>=mincol&&tct>cnt;c--,cnt++)//col vary maxcol-----------mincol bottom
              ans.add(arr[r][c]);
            maxrow--;
            for(int r=maxrow,c=mincol;r>=minrow&&tct>cnt;r--,cnt++)
              ans.add(arr[r][c]);
            mincol++;
        }
        return ans;
    }
  }