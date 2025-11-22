public class countspace {
    public static void main(String args[])
    {
        String str="Welcome to my Java class";
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
            {
                count++;
            }
        }
        System.out.println("The count of spaces "+count);
        String newstr=" ";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                newstr+=str.charAt(i);
            }
        }
        System.out.println(newstr);
    }
}

/**
 * The count of spaces 4
 WelcometomyJavaclass
 */


