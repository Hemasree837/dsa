public class array2{
    public static void main(String args[])
    {
        int []arr={3,5,6,8,7,4,3,6,2};
        int sumEven=0;
        int sumOdd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                sumEven+=arr[i];
            }
            else sumOdd+=arr[i];
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);
    }
}
