import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n=sc.nextInt();

        while(n-- >0){

            String str=sc.next();
            int len=str.length();
            int iterator=0;
            int count=0;
            int subStringLength=(len*(len+1))/2;
            String[] subStrings=new String[subStringLength];
            for(int i=0;i<len;i++){
                String s=""+str.charAt(i);
                subStrings[iterator++]=s;
                System.out.println(s);
                for(int j=i+1;j<len;j++){
                    s+=str.charAt(j);

                    char[] temp=s.toCharArray();
                    Arrays.sort(temp);
                    subStrings[iterator++]=new String(temp);
                }
            }

            for(int i=0;i<subStringLength;i++){

                for(int j=i+1;j<subStringLength;j++){

                    if(subStrings[i].equals(subStrings[j]))
                        count++;
                }
            }

            System.out.println(count);



        }

    }
}
