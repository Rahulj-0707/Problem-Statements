import java.util.*;
class CalculateTicket
{
    public static final int ERR_INVALID_AGE = -1;

    public int TicketPrice( int iAge)
    {
        int iPrice = 0;

        if(iAge < 0)
        {
            return ERR_INVALID_AGE;
        }

        else if((iAge >= 0) && (iAge <= 5))
        {
            iPrice = 0;
        }

        else if((iAge > 5) &&(iAge <= 18))
        {
            iPrice = 700;
        }

        else if((iAge > 18) && (iAge <= 50))
        {
            iPrice = 999;
        }

        else if(iAge > 50)
        {
            iPrice = 500;
        }

        return iPrice;

    }
}

class program8
{
    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);

        int iValue = 0, iRet = 0;

        System.out.println("Enter your age :");
        iValue = sobj.nextInt();

        CalculateTicket cobj = new CalculateTicket();
        iRet = cobj.TicketPrice(iValue);

        if(iRet == cobj.ERR_INVALID_AGE)
        {
            System.out.println("Unable to count ticket price because your age is invalid:");
        }
        else
        {
            System.out.println("Your ticket price is : "+ iRet);
        }

    }
}