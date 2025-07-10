class Solution {
    public boolean areOccurrencesEqual(String s) {
      int [] freq =new int [26];

      for(int i=0;i<s.length();i++){

         int idx=s.charAt(i)-'a';
         freq[idx]++;
      }  
      int temp=0;
      for(int i=0;i<26;i++){

         if(freq[i] !=0){
            temp=freq[i];
            break;
         }
      }
      for(int i=0;i<26;i++){
        if(!(freq[i]==0 || freq[i]==temp)){
            return false;
        }
      }
      return true;
    }
}