# Converting degrees to Farenheit
Temp = int(input("What is the temperature at your place ? "))
Type = str(input("If it is in degrees type C and if its is in Farenheit type F. "))

if "C":
    Fahrenheit =(Temp * 9/5) + 32
    print(f"The temperature is: {Fahrenheit}F")
else if "F":
    Degrees = (Temp - 32) * 5/9
    print(f"The temperature is: {Degrees}C ")
else:
    print("Enter the correct symbol")