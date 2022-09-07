import java.util.Scanner;

public class duplicateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] input=new int[n];
        int i;
        for(i=0;i<n;i++)
            input[i]= sc.nextInt();

        int duplicate = 0;
        for(i = 0; i < n;i++){
            duplicate ^= input[i];
        }
        System.out.print(duplicate);
    }

}
