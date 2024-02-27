class Solution {
    public int maxProfit(int[] arr) {
       int bd=0;
       int sd=0;
       int profit=0;
       for(int i=1;i<arr.length;i++) 
       {
            if(arr[i]>=arr[i-1])
                sd++;
            else// dip now so sell
            {
                profit+=arr[sd]-arr[bd];
                bd=sd=i;
            }
            
       }
       profit+=arr[sd]-arr[bd];
            
        return profit;
    }
}