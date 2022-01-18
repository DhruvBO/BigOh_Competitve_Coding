'''

Find the largest number less than N whose each digit is prime number
'''
# check for optimisation

def largest_prime(N):
    for i in range(N-1, 1, -1):
        curr_prime = True
        a = i

        while a != 0:
            # counter+=1
            digit = a%10
            a = a//10

            if digit != 2 and digit != 5 and digit != 7:
                curr_prime = False
                break

        if curr_prime == True:
            return i

print(largest_prime(1000))

