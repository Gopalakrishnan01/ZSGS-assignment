import java.util.Scanner;

public class nestedWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value: ");
        int n= scanner.nextInt();
        int i=0,j=0;
        while(i++<n){
            while(j++<n){
                System.out.print(j +" ");
            }
            j=0;
            System.out.println();

        }
    }
}
