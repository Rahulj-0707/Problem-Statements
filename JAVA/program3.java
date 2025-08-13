import java.util.*;
class program3
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iOptain = 0;
        int iTotal = 0;
        float fPercentage = 0.0f;

        System.out.println("Enter the Optained Marks :");
        iOptain = sobj.nextInt();

        System.out.println("Enter the Total Marks :");
        iTotal = sobj.nextInt();

        fPercentage = ((float)iOptain / (float)iTotal) * 100;
        System.out.println("Percentage is :" + fPercentage);

    }
}