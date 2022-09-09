package Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class sortingBasedWeights {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of value in array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        int[][] weights=new int[n][2];
        int row=0;
        for(var item:arr){
            int weight=0;
            for(int i=1;i<item/2;i++)
                if(i*i==item)
                    weight+=5;

            if(item%4==0&&item%6==0)
                weight+=4;

            if(item%2==0)
                weight+=3;
            weights[row][0]=item;
            weights[row++][1]=weight;

        }
        Arrays.sort(weights, Comparator.comparingInt(a->a[1]));
        for(int i=n-1;i>=0;i--){
            System.out.println(weights[i][0]+" "+weights[i][1]);
        }


    }
}
