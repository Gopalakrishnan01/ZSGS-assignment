import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int val=sc.nextInt();
        if((val&1)==1)
            System.out.println("The number is Odd");
        else
            System.out.println("The number is even");

    }
}
