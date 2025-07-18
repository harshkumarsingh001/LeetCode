class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int []ans = new int[arr.length];

        Stack<Integer> st =new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                st.push(i);
            }
            else{
                while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                    ans[st.peek()]=i-st.pop();
                }
                st.push(i);
            }
        }
       return ans;
    }
}