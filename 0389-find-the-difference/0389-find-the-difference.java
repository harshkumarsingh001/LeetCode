class Solution {
    public char findTheDifference(String s, String t) {
       int  sums=0;
        int sumt=0;
         for (int i = 0; i < s.length(); i++){
             char character = s.charAt(i);
            int asciiValue = (int) character;
            sums=sums+asciiValue;
        }
          for (int i = 0; i < t.length(); i++){
             char character = t.charAt(i);
            int asciiValue = (int) character;
            sumt=sumt+asciiValue;
            
    }
    
    int diff=sumt-sums;
     return (char) diff;
    }
}