import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
// 7
//2
// 1 7 4 3 4 8 7
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<Integer,Integer> map=new HashMap<>();
        int output=0;
        boolean gotOutput=false;
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();
        System.out.print("Enter the value of K: ");
        int k=sc.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
                if(map.get(arr[i])==k && !gotOutput){
                    output=arr[i];
                    gotOutput=true;
                }
            }
            else{
                map.put(arr[i],1);
            }
        }
        System.out.println("output"+output);









    }
}
