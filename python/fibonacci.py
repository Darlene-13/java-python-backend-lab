import time

def fibonnaci_seq(limit):
    prev_num = 0
    curr_num = 1
    flist = [prev_num]
    even_sum = 0

    while (curr_num <= limit):
        flist.append(curr_num)


        if curr_num % 2 == 0:
            even_sum += curr_num

        next_num = curr_num + prev_num
        prev_num = curr_num
        curr_num = next_num
    return flist, even_sum
        

def fibonacci_sequence(limit):
    a, b = 0, 1
    flist1 = [a]
    even_sum1= 0

    while b <= limit:
        flist1.append(b)
        even_sum1 += b if b % 2 == 0 else 0
        a, b = b, a + b
    return flist1, even_sum1


if __name__ == "__main__":
    start_time = time.time()
    flist, even_count = fibonnaci_seq(4 * 10**6 )
    end_time = time.time()
    print(f"This is our list {flist} ")
    print(f"Our total is {even_count}")
    print(f"Our function too {end_time - start_time} to run")

    start_time = time.time()
    flist1, even_sum1 = fibonacci_sequence( 4 * 10**6)
    end_time = time.time()

    print(f"This is our new list {flist1}")
    print(f"Our sum is {even_sum1} and it took {end_time - start_time} to execute")




    


