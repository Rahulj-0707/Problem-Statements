import java.util.*;
class program13
{
    public static void Display(int iNo)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Hello");
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iFreq = 0;
        System.out.println("Enter the Frequency : ");
        iFreq = sobj.nextInt();

        Display(iFreq);
    }
}