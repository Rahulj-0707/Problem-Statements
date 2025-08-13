#include<iostream>
using namespace std;

int main()
{
    int iTotal = 400;
    int iObtained = 320;

    float fPercentage = 0.0f;

    fPercentage = ((float)iObtained / (float)iTotal) * 100;
    cout<<"Percentage is : "<<fPercentage;

    return 0;
}