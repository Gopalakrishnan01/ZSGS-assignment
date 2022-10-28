import java.util.Arrays;
import java.util.Scanner;
// 15 -2 2 -8 1 7 10 23
public class EX3 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        int output=Integer.MIN_VALUE;
        int[] arr=new int[n];
        int[][] matrix=new int[n][n];
        System.out.print("Enter the elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){
                if(i==j){
                    matrix[i][j]=arr[i];
                }
                else{
                    matrix[i][j]=arr[j]+matrix[i][j-1];
                }
                if(matrix[i][j]==0 && output< j){
                    output=j;
                }

            }
        }
        System.out.println(output);



//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//        }


    }
}
