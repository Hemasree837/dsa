public class csforeach {
    public static void main(String args[])
    {
        String str="Welcome to my Java class";
        int count=0;
        String res="";
        for(int i:str.toCharArray()){
            if(i==' ')
            {
                count++;
            }
            else 
            {
                res+=i;
            }
        }
    }
}


