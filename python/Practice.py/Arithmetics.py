import math
# Finding the square root and cube root
num1 = int(input("First number: "))
num2 = int(input("Second number: "))

result0 = num1 % num2
# Modulo
print(f"The modulo is: {result0}")
#Square root
result = math.sqrt(num1)
result1 = math.sqrt(num2)

result2 = num1**0.5
result3 = num2**0.5
print(f"The square root of the first number is: {result} or {result2} and for the second number is: {result1} or {result3}")

# Cube root
result4 = math.floor(math.pow(num1, 1/3))
result5 = math.pow(num2, 1/3)
result6 = num1**1/3
result7 = num2**1/3
print(f"The cube root for the first number is: {result4} or {result5} amd the cube root for the second number is: {result6} or {result7}")

# Even or Odd
if num1 % 2 == 0:
    print(f"{num1} is even")
else:
    print(f"{num1} is odd")

# Positive or negative
if num1 >= 0:
    print("The number is positive")
else:
    print("The number is negative")

# Swap two numbers
print(f"Before swapping the numbers are: {num1} and {num2}")
num1, num2 = num2, num1
print(f"After swapping the numbers are: {num1} and {num2}")

#Largest of the two numbers
if num1 > num2:
    print(f"{num1} is greater than {num2}")
else: print(f"{num2} is greater than {num1}")