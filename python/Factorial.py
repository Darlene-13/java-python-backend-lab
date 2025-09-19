print("Welcome to the Number World!")

num = int(input("Enter any number to get the factorials: "))
factorial = 1
for i in range (1 , num + 1):
    factorial = factorial * i
    print(f"The factorial of {num} : 1 x {i} = {factorial}")
