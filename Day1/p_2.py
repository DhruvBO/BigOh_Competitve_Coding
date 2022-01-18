'''
Write a program (without using inbuilt functions and not using Strings or array)
to swap first and last digits of any number
'''

'''
234 -> 432 , 
'''

def swap_fld(num):
    a = num
    fd = num%10
    ld = 0
    d_count = 1
    count = 0
    while num !=0:
        ld = num%10
        num = num // 10
        d_count *= 10
        count += 1
        print(ld)

    print(d_count,count, fd, ld)
    mid_d = a -  ld * ((d_count//10)) - fd

    res = fd * (d_count//10) + mid_d + ld

    print(res)

swap_fld(10009)
