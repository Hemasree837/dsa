import java.util.*;
public class removespace{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.toLowerCase();
        char ch=sc.next().charAt(0);
        //String str="Java language is fun";
       // char ch='a';
        String st=Character.toString(ch);
        String remove=str.replaceAll(st,"");
        System.out.print(str+"\n"+remove);
        }
    }
