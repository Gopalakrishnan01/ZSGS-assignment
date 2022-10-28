


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 1 2 5 4 0
//  2 4 5 0 1
public class Ex4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        Map<Integer,Integer> mapA=new HashMap<>();
        Map<Integer,Integer> mapB=new HashMap<>();

        int[] arrayA=new int[n];
        int[] arrayB=new int[n];
        System.out.print("Enter the Elements of arrayA : ");
        for(int i=0;i<n;i++){
            arrayA[i]=sc.nextInt();
            if(mapA.containsKey(arrayA[i])){
                mapA.put(arrayA[i],mapA.get(arrayA[i])+1);
            }else{
               mapA.put(arrayA[i],1);
            }
        }

        System.out.print("Enter the Elements of arrayB : ");

        for(int i=0;i<n;i++){
            arrayB[i]=sc.nextInt();
            if(mapB.containsKey(arrayB[i])){
                mapB.put(arrayB[i],mapB.get(arrayB[i])-1);
            }
            else{
                mapB.put(arrayB[i],1);
            }
        }

        System.out.println(mapA.equals(mapB)?"Equal":"Not Equal");

    }


}
