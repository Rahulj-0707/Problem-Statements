import java.util.*;
class program12
{
    public static void Display(int iNo)
    {
        int i = 0;
        for(i = 0; i <= 5; i++)
        {
            System.out.println(iNo);
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0;
        System.out.println("Enter the number:");
        iValue = sobj.nextInt();

        Display(iValue);
    }

}