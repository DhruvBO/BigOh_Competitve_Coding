
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
def makePattern(patternSize):
    for i in range(patternSize):
        for j in range(patternSize):
            if j==patternSize-i-1:
                print("/", end="")
            elif j==i:
                print("\\", end="")
            else:
                print('*', end="")
        print()



makePattern(10)