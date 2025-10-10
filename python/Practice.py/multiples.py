import time

def find_sum(limit):
    total = 0
    for i in range(limit):
        if i % 3 == 0 or i % 5 == 0:
            total += i
    return total

def find_sum2(limit):
    return sum(i for i in range(limit) if i % 3 == 0 or i % 5 == 0)

if __name__ == "__main__":
    start_time = time.time()
    result = find_sum(1000)
    
    end_time = time.time()
    print(f"Sum of multiple of 3 and 5 below 1000: {result} and it takes {end_time - start_time} seconds")

    start_time = time.time()
    result2 = find_sum2(1000)
    end_time = time.time()
    print(f"Sum of multiple of 3 and 5 below 1000 (optimized): {result2} and it takes {end_time - start_time} seconds")
