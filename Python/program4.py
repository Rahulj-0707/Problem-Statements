def Calculate(iValue1, iValue2):
    Percentage = 0
    Percentage = (iValue2 / iValue1) * 100

    return Percentage

def main():
    print("Enter Total Number of Marks :")
    Total = int(input())

    print("Enter the Number of Optain Marks:")
    Optain = int(input())

    fRet = 0

    fRet = Calculate(Total, Optain)
    print(f"Percentage is:{fRet}%")

if __name__ == "__main__":
    main()
