'''
Write a program to find the smallest number divisible by all the numbers between 1 to 9.

'''

def smallestDivisibleByNums(firstNum, secondNum):
    if firstNum > secondNum:
        numerator = firstNum
        denominator = secondNum

    else:
        numerator = secondNum
        denominator = firstNum

    remainder = numerator % denominator
    while remainder != 0:
        numerator = denominator
        denominator = remainder
        remainder = numerator % denominator

    gcd = denominator
    lcm = ((firstNum * secondNum) // (gcd))

    return lcm

nums = [1, 2, 3, 4, 5, 6, 7, 8, 9]
result = smallestDivisibleByNums(nums[0], nums[1])

for i in range(len(nums)):
    result = smallestDivisibleByNums(result, nums[i])

print(result)






