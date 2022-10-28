import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
// 1 2 5 4 0
//  2 4 5 0 1
public class Ex4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        Set<Integer> set=new HashSet<>();
        int[] arrayA=new int[n];
        int[] arrayB=new int[n];
        System.out.print("Enter the Elements of arrayA : ");
        for(int i=0;i<n;i++){
            arrayA[i]=sc.nextInt();
            set.add(arrayA[i]);
        }

        System.out.print("Enter the Elements of arrayB : ");

        for(int i=0;i<n;i++){
            arrayB[i]=sc.nextInt();
            set.add(arrayB[i]);
        }

        System.out.println(set.size()==n?"Equal":"Not Equal");

    }


}
