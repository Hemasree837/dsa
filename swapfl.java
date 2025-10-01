import java.util.*;
public class swapfl{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        if(str.length()>1)
        {
            String swapped=str.substring(2,str.length()-2);
            System.out.println("Swapped:"+swapped);
        }
        else System.out.println(str);
    }
}