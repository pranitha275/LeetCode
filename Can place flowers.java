class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if(flowerbed.length<=1 && n==1){
        if(flowerbed[0]==0)
        {
            n--;
            flowerbed[0]=1;
        }
        }
        else if(n==0)
        {
            n=0;
        }
else{
        for(int i=0;i<flowerbed.length;i++)
        {
           
            if(i==0)
            {
                if(flowerbed[i]==0 && flowerbed[i+1]==0)
                {
                    n--;
                    flowerbed[i]=1;
                }
            }
            else if(i==flowerbed.length-1)
            {
                if(flowerbed[i]==0 && flowerbed[i-1]==0)
                {
                    n--;
                    flowerbed[i]=1;
                }
            }
            else
            {
                if((flowerbed[i-1] ==0 && flowerbed[i]==0 && flowerbed[i+1]==0) ){
                    n--;
                    flowerbed[i]=1;

                }
                
            }
            
        }
}
        if(n<=0)
        return true;
        else 
        return false;
        
       
    }
    
}