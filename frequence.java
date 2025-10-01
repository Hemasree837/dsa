import java.util.*;
public class frequence{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char target=sc.next().charAt(0);
        int count=0;
        for(char ch:str.toCharArray())
        {
            if(ch==target) count++;
        }
        System.out.println("frequency of"+target+":"+count);
    }
}