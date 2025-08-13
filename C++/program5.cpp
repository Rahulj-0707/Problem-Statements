#include <iostream>
using namespace std;

class Percentage
{
public:
    void Display(float fPercentage)
    {
        if ((fPercentage < 0.0f) || (fPercentage > 100.0f))
        {
            cout << "Unable to proceed as input is invalid :" << endl;
        }

        if ((fPercentage >= 0.0f) && (fPercentage < 35.0f))
        {
            cout << "You failed in the exam :" << endl;
        }
        else if ((fPercentage >= 35.0f) && (fPercentage < 50.0f))
        {
            cout << "Pass Class" << endl;
        }
        else if ((fPercentage >= 50.0f) && (fPercentage < 60.0f))
        {
            cout << "Second Class" << endl;
        }
        else if ((fPercentage >= 60.0f) && (fPercentage < 70.0f))
        {
            cout << "First Class" << endl;
        }
        else if ((fPercentage >= 70.0f) && (fPercentage <= 100.0f))
        {
            cout << "First class with Distinction" << endl;
        }
    }
};

int main()

{
    float fValue = 0.0f;

    cout << "Enter the Percentage :" << endl;
    cin >> fValue;

    Percentage pobj;
    pobj.Display(fValue);
    
    return 0;
}
