import java.util.*;
public class reverse
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println("Reversed String="+rev);
        if(str.trim().equals(rev.trim())) System.out.println("Palindrome");
        else System.out.println("Not a palindrome");
    }
}