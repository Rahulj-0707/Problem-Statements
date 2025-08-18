ERR_INVALID_AGE = -1

def CalculateTicket(age):
    price = 0

    if age < 0:
        return ERR_INVALID_AGE

    if 0 <= age <= 5:
        price = 0
    elif 5 < age <= 18:
        price = 700
    elif 18 < age <= 50:
        price = 999
    elif age > 50:
        price = 500

    return price


def main():
    try:
        age = int(input("Please enter your age : "))
        ticket_price = CalculateTicket(age)

        if ticket_price == ERR_INVALID_AGE:
            print("Unable to calculate the ticket price as age is invalid")
        else:
            print(f"Your ticket price is : {ticket_price}")
    except ValueError:
        print("Invalid input! Please enter a valid number for age.")


if __name__ == "__main__":
    main()
