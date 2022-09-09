package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of element is array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int mid = arr.length%2==0? (arr.length /2)-1: arr.length/2;
        int left = mid - 1, right = mid + 1;
        System.out.print( arr[mid]+" ");
        while (left > -1 && right < arr.length) {
            System.out.print(arr[right++] + " ");
            System.out.print(arr[left--] + " ");
        }
        if(n%2==0)
            System.out.print(arr[arr.length-1]);



    }
}
