import java.util.*;
public class countvowels{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String word=sc.nextLine();
        word=word.trim();
        String vowels="AEIOUaeiou";
        int vowelsCount=0;
        int consonentsCount=0;
        for(int i=0;i<word.length();i++)
        {
         if(vowels.contains(Character.toString(word.charAt(i)))) vowelsCount++;
         else consonentsCount++;
        }
        System.out.println( vowelsCount);
        System.out.println(consonentsCount);
    }
}