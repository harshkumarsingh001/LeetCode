class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count =0;
        for(char ch:s.toCharArray())
           if(ch=='1') count++;
        int len =s.length();
        char[] arr =new char[len];

        for(int i=0;i<len;i++)
           arr[i]='0';

        arr[len -1]='1';
        count--;

        int i=0;
        while(count-- >0)
          arr[i++]='1';    

        return new String(arr);    
    }
}