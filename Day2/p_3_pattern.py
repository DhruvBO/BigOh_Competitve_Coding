
'''
iii) Write a program to print the below pattern:
    \*****/
    *\***/*
    **\*/**
    ***/***
    **/*\**
    */***\*
    /*****\

'''
def makePattern(pattern_size):
    for i in range(pattern_size):
        for j in range(pattern_size):
            if j==pattern_size-i-1:
                print("/", end="")
            elif j==i:
                print("\\", end="")
            else:
                print('*', end="")
        print()



makePattern(7)