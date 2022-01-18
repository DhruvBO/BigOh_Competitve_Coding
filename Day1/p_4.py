'''
Write a program to find the smallest number divisible by all the numbers between 1 to 9

'''


def lcm(n1, n2):
    if n1 > n2:
        numerator   = n1
        denominator = n2
    else:
        numerator   = n2
        denominator = n1

    remainder = numerator % denominator

    while remainder != 0:
        numerator = denominator
        denominator = remainder
        remainder = numerator % denominator

    gcd = int(denominator)
    lcm = int(int(n1 * n2) / gcd)

    return lcm

num_lst = [1, 2, 3, 4, 5, 6, 7, 8, 9]
res = lcm(num_lst[0], num_lst[1])

for i in range(2, len(num_lst)):
    res = lcm(res, num_lst[i])

print("result:", res)





# def sm_num():
#     num_found = False
#     i = 1
#     divisor = [1, 2, 3, 4, 5, 6, 7, 8, 9]
#     while num_found != True:
#         curr = True
#         for j in range(len(divisor)):
#             if i % divisor[j] != 0:
#                 curr = False
#                 break
#
#         if curr == True:
#             num_found = True
#             return i
#         i += 1
#
# print(sm_num())
# print(2*3*4*5*6*7*8) = 40320