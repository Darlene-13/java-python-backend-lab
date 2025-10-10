from datetime import datetime

# Converting degrees to Farenheit
temp = float(input("What is the temperature at your place ? "))
temperature_type = str(input("If it is in degrees type C and if its is in Farenheit type F. "))
temperature_type.upper()

if temperature_type == "C":
    Fahrenheit =(temp * 9/5) + 32
    print(f"The temperature is: {Fahrenheit}F")
elif temperature_type == "F":
    Degrees = (temp - 32) * 5/9
    print(f"The temperature is: {Degrees}C ")
else:
    print("Enter the correct symbol")
    
# Using a function for the same thing
def temperature_conversion():
    # Converting degrees to Farenheit
    temp = float(input("What is the temperature at your place ? "))
    temperature_type = str(input("If it is in degrees type C and if its is in Farenheit type F. "))
    temperature_type = temperature_type.upper()

    if temperature_type == "C":
        Fahrenheit =(temp * 9/5) + 32
        print(f"The temperature is: {Fahrenheit}F")
    elif temperature_type == "F":
        Degrees = (temp - 32) * 5/9
        print(f"The temperature is: {Degrees}C ")
    else:
        print("Enter the correct symbol")


if __name__ == "__main__":
    temperature = temperature_conversion()


#Time conversion

def time_conversion():
    current_time = datetime.now().time()

    time_type = str(input("Enter HOURS to get total time in hours, MINUTES to get time in minutes and SECONDS to get time in seconds: "))
    time_type = time_type.upper()

    if time_type == "HOURS":
        total_hours = current_time.hour + current_time.minute/60 + current_time.second/3600
        print(f"Time in hours only is: {total_hours}")
    elif time_type == "MINUTES":
        total_minutes = current_time.hour * 60 + current_time.minute + (current_time.second/60)
        print(f"Total time in minutes is: {total_minutes}")
    elif time_type == "SECONDS":
        total_seconds = current_time.hour * 3600 + current_time.minute * 60 + current_time.second
        print(f"Total time in seconds: {total_seconds}")
    else:
        print("Enter the correct conversion type")


if __name__ == "__main__":
    time_conversion()




