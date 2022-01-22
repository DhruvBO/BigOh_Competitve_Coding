'''

1. Write a method void printArray(int[][]arr)
Prints array elements clock wise and anti-clockwise alternatively.
Input :
 1 2 3
 4 5 6
 7 8 9
Output :
1 2 3 6 9 8 7 4 5
3 2 1 4 7 8 9 6 5

'''

'''

1. Write a method void printArray(int[][]arr)
Prints array elements clock wise and anti-clockwise alternatively.
Input :
 1 2 3
 4 5 6
 7 8 9
Output :
1 2 3 6 9 8 7 4 5
3 2 1 4 7 8 9 6 5

'''

def printArrayClockwise(arr):
    s = 0
    h, v = 1, 0
    hd, vd = "lr", "" # lr-> left to right ,  tb - > top to bottom, similarly rl and bt
    m, n = 0, 0
    wayLenRow = len(arr) - 1
    wayLenCol = len(arr[0]) - 1
    while s < (len(arr)* len(arr[0])) :
            i = 0
            k = 0
        # if wayLenRow == len(arr)-1:
            while i <= wayLenRow and k <= wayLenCol:
                if h == 1: # horizontal direction
                    if hd == "lr":
                        while n <= wayLenCol:
                            print(arr[m][n], end=" ")
                            n += 1
                            s += 1
                        n -= 1
                        m += 1
                        vd = "tb"

                    else:
                        j = wayLenCol
                        while j > 0:
                            print(arr[m][n], end=" ")
                            n -= 1
                            j -= 1
                            s += 1
                        n += 1
                        m -= 1
                        vd = "bt"
                    h = 0

                elif h == 0: # vertical direction
                    if vd == "tb":
                        while m <= wayLenRow  :
                            print(arr[m][n], end=" ")
                            m += 1
                            s += 1
                        m -= 1
                        n -= 1
                        hd = "rl"

                    else:
                        j = wayLenRow
                        while j > 0:
                            print(arr[m][n], end=" ")
                            n += 1
                            j -= 1
                            s += 1
                        # n -= 1


                        hd = "lr"
                    h = 1
                i += 1
                k += 1
            wayLenRow -= 1
            wayLenCol -= 1


def  printArrayAntiClockwise(arr):
    m, n = 0, len(arr[0]) - 1
    h, v = 1, 0
    hd, vd = "rl", ""
    wayLenRow = len(arr) - 1
    wayLenCol = len(arr[0]) - 1
    s = 0
    while s < (len(arr)* len(arr[0])):
        i = 0
        k = 0
        j = 0
        while i <= wayLenRow and j <= wayLenCol:
            if h == 1:
                if hd == "rl":
                    while k <= wayLenCol:
                        print(arr[m][n], end=" ")
                        n -= 1
                        s += 1
                        k += 1
                    m += 1
                    n += 1
                    h = 0
                    vd = "tb"

                else:
                    while n < wayLenCol:
                        print(arr[m][n], end=" ")
                        n += 1
                        s += 1
                        k += 1
                    n -= 1
                    h = 0
                    vd = "bt"

            else:
                if vd == "tb":
                    while m <= wayLenRow+1:
                        print(arr[m][n], end=" ")
                        m += 1
                        s += 1
                        j += 1

                    m -= 1
                    n += 1
                    h = 1
                    hd = 'lr'


            i+=1
            j+=1
        wayLenRow -= 1
        wayLenCol -= 1
        s+=1









arr1 = [[1, 2, 3, 1, 91],
        [4, 5, 6, 1, 92],
        [7, 8, 9, 1, 93]]


arr3 = [[1, 2, 3, 11],
        [4, 5, 6, 12],
        [7, 8, 9, 13]]

arr4 = [[1, 2, 3],
        [4, 5, 6],
        [7, 8, 9]]

# printArrayClockwise(arr1)
printArrayAntiClockwise(arr4)






