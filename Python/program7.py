ERR_INVALID_AGE = -1

def CalculateTicket(age):
    if age < 0:
        return ERR_INVALID_AGE

    if 0 <= age <= 5:
        return 0
    elif 5 < age <= 18:
        return 700
    elif 18 < age <= 50:
        return 999
    elif age > 50:
        return 500


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
