import java.util.*;
class Percentage
{
    public float Percentage(int iOptain, int iTotal)
    {
        float fPercentage = 0.0f;
        fPercentage = ((float)iOptain / (float)iTotal) * 100;
        return fPercentage;
    }
}
class program4
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue1 = 0, iValue2 = 0;
        float fRet = 0.0f;

        System.out.println("Enter the Optain Marks :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter the Total Marks :");
        iValue2 = sobj.nextInt();

        Percentage pobj = new Percentage();
        fRet = pobj.Percentage(iValue1, iValue2);

        System.out.println("Percentage is:"+fRet);
    }
}