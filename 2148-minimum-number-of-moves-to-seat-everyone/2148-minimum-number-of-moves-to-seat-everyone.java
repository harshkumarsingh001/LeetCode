class Solution {
    public int findMax(int arr[]){
       int max =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           max=Math.max(arr[i],max); 
        }
        return max;
    }


    public int minMovesToSeat(int[] seats, int[] students) {
       int maxSeat =findMax(seats);
       int maxStudent =findMax(students);

       int seatCount[] =new int [maxSeat+1];
       int studentCount[] =new int [maxStudent+1];
       int totalStudents =students.length;

       for(int i=0;i<totalStudents;i++){
        seatCount[seats[i]]++;
        studentCount[students[i]]++;
       }
       int moves =0;
       int i=0;
       int j=0;
       while(totalStudents >0){

        while(seatCount[i]==0){
             i++;
        }
         while(studentCount[j]==0){
             j++;
        }
        moves+=Math.abs(i-j);
        seatCount[i]--;
        studentCount[j]--;
        totalStudents--;
       }

     return moves;
    }
}