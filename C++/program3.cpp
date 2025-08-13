#include<iostream>
using namespace std;

int main()
{
    int iOptain = 0;
    int iTotal = 0;
    float fPercentage = 0.0f;

    cout<<"Enter Total Number of Marks : ";
    cin>>iTotal;

    cout<<"Enter Optained Number of Marks :";
    cin>>iOptain;

    fPercentage = ((float)iOptain / (float)iTotal) * 100;
    cout<<"Percentage is :" <<+fPercentage;

    return 0;
}