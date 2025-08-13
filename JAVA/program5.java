import java.util.*;
class Percentage
{
    public void Display(float fPercentage)
    {
        if((fPercentage < 0.0f) || (fPercentage > 100.0f))
        {
            System.out.println("Unable to proceed as input is invalid :");
        }

        if((fPercentage >= 0.0f) && (fPercentage < 35.0f))
        {
            System.out.println("You failed in the exam :");
        }

        else if((fPercentage >= 35.0f) && (fPercentage < 50.0f))
        {
            System.out.println("Pass Calss");
        }

        else if((fPercentage >= 50.0f) && (fPercentage < 60.0f))
        {
            System.out.println("Second Calss");
        }

        else if((fPercentage >= 60.0f) && (fPercentage < 70.0f))
        {
            System.out.println("First Class");
        }

        else if((fPercentage >= 70.0f) && (fPercentage <= 100))
        {
            System.out.println("First class with Distinction");
        }
    }
}

class program5
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        float fValue = 0.0f;

        System.out.println("Enter the Percentage :");
        fValue = sobj.nextFloat();

        Percentage pobj = new Percentage();
        pobj.Display(fValue);
    }
}