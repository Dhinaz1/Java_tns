public class CentNum {
    public static void main(String args[]){
    int num,n=5;
    for(int i=0;i<n;i++){
        num=1;
        for(int j=n-i;j>1;j--){
            System.out.print(" ");
        }
        for(int j=0;j<=i;j++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }
    }
}