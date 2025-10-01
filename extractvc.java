import java.util.*;
public class extractvc{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        word=word.trim();
        String vowels="AEIOUaeiou";
        String extractedv="";
        String extractedc="";
        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
         if(vowels.contains(Character.toString(ch))) extractedv+=ch;
         else extractedc+=ch;
        }
        System.out.println(extractedv);
        System.out.println(extractedc);
    }
}