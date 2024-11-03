class Solution {
    public boolean isAnagram(String s, String t) {
        int s1=s.length();
        int t1=t.length();
        if(s1!=t1){
            return false;
        }
        else{
            int count[]=new int[26];
            for(int i=0;i<s1;i++){
                count[s.charAt(i)-'a']++;

            }
             
            for(int i=0;i<t1;i++){
                count[t.charAt(i)-'a']--;
                
            }
            for(int i=0;i<count.length;i++){
                if(count[i]!=0){
                    return false;
                }
            }
            return true;
        }
    }
}