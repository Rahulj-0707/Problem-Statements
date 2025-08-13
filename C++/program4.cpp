#include <iostream>
using namespace std;

class Percentage 
{
public:
    float calculatePercentage(int iObtain, int iTotal) 
    {
        float fPercentage = ((float)iObtain / (float)iTotal) * 100;
        return fPercentage;
    }
};

int main() {
    int iValue1 = 0, iValue2 = 0;
    float fRet = 0.0f;

    cout << "Enter the Obtain Marks: ";
    cin >> iValue1;

    cout << "Enter the Total Marks: ";
    cin >> iValue2;

    Percentage pobj;
    fRet = pobj.calculatePercentage(iValue1, iValue2);

    cout << "Percentage is: " << fRet<<"%";

    return 0;
}
