class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo=1;
        int hi;
        int ans=0;
        int max =piles[0];

        for(int i=1;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        hi=max;

        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            double hr=0;
            for(int i=0;i<piles.length;i++){
                hr=hr+Math.ceil(piles[i]*1.0/mid);
            }
            if(hr<=h){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;
        
    }
}