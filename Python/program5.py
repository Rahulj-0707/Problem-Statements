def Display(fPerc):
    if fPerc < 0.0 or fPerc > 100.0:
        print("Unable to proceed as input is invalid")
        return

    if 0.0 <= fPerc < 35.0:
        print("You are fail")
    elif 35.0 <= fPerc < 50.0:
        print("Pass class")
    elif 50.0 <= fPerc < 60.0:
        print("Second class")
    elif 60.0 <= fPerc < 70.0:
        print("First class") 
    elif 70.0 <= fPerc <= 100.0:
        print("First class with distinction")


def main():
    print("Plase Enter the Percentage:")
    fValue = float(input())
    Display(fValue)


if __name__ == "__main__":
    main()
