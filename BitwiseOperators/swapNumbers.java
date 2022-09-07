import java.util.Scanner;

public class swapNumbers {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("Enter the value of a:");
        a=sc.nextInt();
        System.out.print("Enter the value of b:");
        b=sc.nextInt();

        System.out.println("Before swapping:"+a+" "+b);

        a^=b;
        b^=a;
        a^=b;

        System.out.println("After swapping: "+a+" "+b);

    }
}
