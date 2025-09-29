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