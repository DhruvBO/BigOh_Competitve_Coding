'''

Find the largest number less than N whose each digit is prime number
'''
# check for optimisation

def largestPrime(N):
    for i in range(N-1, 1, -1):
        currPrime = True
        a = i

        while a != 0:
            # counter+=1
            digit = a%10
            a = a//10

            if digit != 2 and digit != 5 and digit != 7:
                currPrime = False
                break

        if currPrime == True:
            return i

print(largestPrime(1000))

