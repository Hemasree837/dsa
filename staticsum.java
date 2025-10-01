import java.util.Scanner;
public class staticsum{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter ");
    String input=sc.nextLine();
    String[] parts=input.split(",");
    int num1=Integer.parseInt(parts[0].trim());
    int num2=Integer.parseInt(parts[1].trim());
    System.out.println("First number "+num1);
    System.out.println("Second number "+num2);
    System.out.println(num1+num2);
    sc.close();
  }
}