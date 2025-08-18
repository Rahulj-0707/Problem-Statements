ERR_INVALID_AGE = -1

def CalculateTicket(age):
    if age < 0:
        return ERR_INVALID_AGE
    
    if age >= 0 and age <= 5:
        return 0
    elif age > 5 and age <= 18:
        return 700
    elif age > 18 and age <= 50:
        return 999
    elif age > 50:
        return 500


def main():
    age = int(input("Please enter your age : "))
    ticket_price = CalculateTicket(age)

    if ticket_price == ERR_INVALID_AGE:
        print("Invalid age entered!")
    else:
        print(f"Your ticket price is : {ticket_price}")


if __name__ == "__main__":
    main()
