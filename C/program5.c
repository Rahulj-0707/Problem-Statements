#include<stdio.h>

void DisplayClass(float fPerc)
{
    if((fPerc < 0.0f) || (fPerc > 100.0f))
    {
        printf("Unable to proceeed as input is invalid\n");
        return;
    }

    if((fPerc >= 0.0f) && (fPerc < 35.0f))
    {
        printf("You are fail\n");
    }
    else if((fPerc >= 35.0f) && (fPerc < 50.0f))
    {
        printf("Pass class\n");
    }
    else if((fPerc >= 50.0f) && (fPerc < 60.0f))
    {
        printf("Second class\n");
    }
    else if((fPerc >= 60.0f) && (fPerc < 70.0f))
    {
        printf("First class\n");
    }
    else if((fPerc >= 70.0f) && (fPerc <= 100.0f))
    {
        printf("First clas with distinction\n");
    }
}

int main()
{
    float fValue = 0.0f;

    printf("Please enter your percentage : \n");
    scanf("%f",&fValue);

    DisplayClass(fValue);

    return 0;
}