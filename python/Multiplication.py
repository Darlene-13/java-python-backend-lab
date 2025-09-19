print("Hey buddy welcome to the multiplication table")

num = int(input("Enter a random number: "))

print(f"The Multiplication Table of {num}")

for i in range (num + 1):
    result = num * i
    print(f"{num} x {i} = {result}")