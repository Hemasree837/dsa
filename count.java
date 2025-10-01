import java.util.*;
public class count{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] word=str.trim().split(" ");
        System.out.println(word.length);
    }
}