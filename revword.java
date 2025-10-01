import java.util.*;
public class revword{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        String[] words=str.split(" ");
        String revs="";
        for(String word:words)
        {
            String revw="";
            for(int i=word.length()-1;i>=0;i--)
            {
                revw+=word.charAt(i);
            }
            revs+=revw+" ";
        }
        System.out.println(revs.trim());
        sc.close();
    }
}