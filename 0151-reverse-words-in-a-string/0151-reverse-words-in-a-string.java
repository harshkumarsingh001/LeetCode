class Solution {
    public String reverseWords(String s) {
        String[] words=s.split(" +");
        StringBuilder st= new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            st.append(words[i]);
            st.append(" ");

        }
        return st.toString().trim();
    }
}