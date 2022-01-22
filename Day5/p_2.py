'''

2. Write a program to print all the possible combinations according to the input values.
Example :
Given Values
'1' : ['Z', 'Y', 'A'],
'2' : ['B', 'O'],
'12' : ['L']
'3' : ['U', 'P']


Input : 123
Output : [ZBU, ZBP, ZOU, ZOP, YBU, YBP, YOU, YOP, ABU, ABP, AOU, AOP, LU, LP]

'''

def isElementPresent(combList):
    pass

def Combination(dic, inp):
    # string input combination
    resList = []
    combList = []
    inpList = []
    for i in range(len(inp)):
            inpList.append(inp[i])

    # combination
    i  = 0
    j, k = 0, 0
    while i < len(inpList)-1: # '1'
        k, m = 0, 0
        if i == 0:
            while k < len(dic[inpList[i]]): # len = 3
                j, n = 0, 0
                while j < len(dic[inpList[i+1]]):  # len = 2
                    combList.append(dic[inpList[i]][m] + dic[inpList[i+1]][n])
                    n += 1
                    j+= 1

                m += 1
                k += 1


        else:
            k = 0
            while k < len(combList): # len = 3
                j, n = 0, 0
                while j < len(dic[inpList[i+1]]):  # len = 2
                    resList.append((combList[k] + dic[inpList[i+1]][n]))
                    if n == len(dic[inpList[i+1]]) - 1:
                        n = 0
                    else:
                        n += 1
                    j += 1
                m += 1
                k += 1
        i += 1

    print(resList)
    print(combList)









inpDict = {'1': ['Z', 'Y', 'A'],
           '2': ['B', 'O'],
          '12': ['L'],
           '3': ['U', 'P']
           }

comb = '123'
Combination(inpDict, comb)



