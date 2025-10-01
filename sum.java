import java.util.*;
import java.lang.*;
public class sum{
     public static void main(String args[])
     {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String line=sc.nextLine();
            String[] numbers=line.trim().split(" ");
            int n=numbers.length;
            int arr[]=new int[n];
            int sum=0;
            int index=0;
            for(String num:numbers)
            {
                //int value=Integer.parseInt(num);
                arr[index]=Integer.parseInt(num);
                sum+=arr[index];
                index++;
            }
            System.out.println(Arrays.toString(arr));
            System.out.println(sum);
        }
     }
}
