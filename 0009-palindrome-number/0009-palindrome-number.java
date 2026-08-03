class Solution {
    public boolean isPalindrome(int x) {

        int ori = x;
        int rno = 0;
        int lastdigit;
     if(x==0){
                return true;
            }
        if (x < 0 || x % 10 == 0) {
            return false;
        }
        while (x != 0) {

            lastdigit = x % 10;
            rno = rno * 10 + lastdigit;
            x=x/10;

        }
        if (rno == ori) {
            return true;
        }
    return false;
}
}