import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        System.out.print("Enter the elements: ");
        int[] arr=new  int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        stack.push(arr[n-1]);
        for(int i=n-2;i>=0;i--){
            if(stack.peek()<arr[i]){
                stack.push(arr[i]);
            }
        }
        System.out.println("output");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }




    }
}
