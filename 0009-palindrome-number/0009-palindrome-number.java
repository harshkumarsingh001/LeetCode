class Solution {
    public boolean isPalindrome(int x) {
        int number = x;
    if(x==0)
        return true  ; 
    if(x<0 || x % 10 == 0)
        return false ;
    int reverse = 0;
    while(x != 0){
        int digit = x % 10;
        reverse = reverse * 10 + digit;
        x /= 10;

    }
    if(number==reverse){
        return true;
    }else{
        return false;
    }
    }
}