import java.util.Scanner;

public class nestedIf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the value a: ");
        a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        b=sc.nextInt();
        System.out.print("Enter the value of c: ");
        c=sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(" a is greater");
            }
            else {
                System.out.println("c is greater");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println("b is greater ");
            }
            else {
                System.out.println("c is greater");
            }
        }

    }
}
