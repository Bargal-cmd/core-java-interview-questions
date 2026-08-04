class Solution {
    public int reverse(int x) {
        int revInt=0 ;
        int original =x;
      
      
        x=Math.abs(x);
        while(x>0){
            int lastdigit = x%10;
              if (revInt > Integer.MAX_VALUE / 10 || (revInt == Integer.MAX_VALUE / 10 && lastdigit > 7)) {
                return 0;
            }
      
            if (revInt < Integer.MIN_VALUE / 10 || (revInt == Integer.MIN_VALUE / 10 && lastdigit < -8)) {
                return 0;
            }
            revInt = (10*revInt)+lastdigit;
            x =x/10;
        }
       
         if(original<0){
              return (-revInt);
        }else return revInt;
    }
}