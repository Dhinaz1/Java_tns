import java.util.Arrays;   
class Main {
    static int counttheTriplets(int[] A, int N){
     int count = 0;
     Arrays.sort(A);
     for(int i = 0; i < N; i++){
       for(int j = i + 1; j < N; j++){
          for(int k = j + 1; k < N; k++){
              if(A[i] + A[j] == A[k]){
                    count++;
              }
          }
       }
     }
     return count; 
   }
 
	public static void main(String args[]) {
		// Your code goes here
		int[] A = {1, 2, 3, 4, 5};
		int N = 5;
		System.out.print(counttheTriplets(A, N));
	}
}