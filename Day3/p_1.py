'''
i) Write a method Boolean isValidSudoku(int[][]Sudoku)
Returns true if the given Sudoku is correctly arranged otherwise false

Determine if a 9 x 9 Sudoku board is valid. Only the filled cells
need to be validated according to the following rules:
1. Each row must contain the digits 1-9 without repetition.
2. Each column must contain the digits 1-9 without repetition.
3. Each of the nine 3 x 3 sub-boxes of the grid must contain the
digits 1-9 without repetition.

Example :
Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true

Input: board =
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false

'''
def resetNumRepeatCounterDict(dict):
    for k, v in dict.items():
        dict[k] = 0
    return dict

def isValidSuduko(Suduko):
    numRepeatCounterDict = {
                "0": 0,
                "1": 0,
                "2": 0,
                "3": 0,
                "4": 0,
                "5": 0,
                "6": 0,
                "7": 0,
                "8": 0,
                "9": 0,
                ".": 0
            }
    # Each row must contain the digits 1-9 without repetition.
    i , j = 0, 0
    while j < len(Suduko[0]):
        if numRepeatCounterDict[Suduko[i][j]] > 1 and Suduko[i][j] != ".":
            numRepeatCounterDict = resetNumRepeatCounterDict(numRepeatCounterDict)
            i = 0
            return False

        else:
            numRepeatCounterDict[Suduko[i][j]] += 1
            i += 1

        if i == len(Suduko[0]):
            numRepeatCounterDict = resetNumRepeatCounterDict(numRepeatCounterDict)
            i = 0

        j += 1

    # Each column must contain the digits 1-9 without repetition.
    i, j = 0, 0
    while i < len(Suduko[0]):
        if numRepeatCounterDict[Suduko[i][j]] > 1 and Suduko[i][j] != ".":
            # numRepeatCounterDict = resetNumRepeatCounterDict(numRepeatCounterDict)
            print("i:", i, ", j:", j, "Suduko[i][j]: ", Suduko[i][j] )
            j = 0
            return False

        else:
            numRepeatCounterDict[Suduko[i][j]] += 1
            j += 1

        if j == len(Suduko):
            numRepeatCounterDict = resetNumRepeatCounterDict(numRepeatCounterDict)
            j = 0
        i += 1

    # 3. Each of the nine 3 x 3 sub-boxes of the grid must contain
    # the digits 1-9 without repetition.
    # for i in range(0, len(Suduko[0]), 3):
    #     for j in range(len(Suduko[0])):
    #         if numRepeatCounterDict[Suduko[i][j]] > 1 and Suduko[i][j] != ".":
    #             return False
    #
    #         else:
    #             numRepeatCounterDict[Suduko[i][j]] += 1
    #
    #         print(1, j)
    counterItem = 0
    i, j, k = 0, 0, 0
    addToI, addToJ, resetAddToI = 0, 0, 0
    sizeSubBlock = 3
    while k < 9:
        if k > 0:
            addToI += 3

        if k % sizeSubBlock == 0 and k != 0:
            addToI = 0
            resetAddToI += 3
            addToJ += 3
        # addToI = resetAddToI
        for i in range(sizeSubBlock):
            for j in range(sizeSubBlock):
                numRepeatCounterDict[Suduko[i + addToI][j + addToJ]] += 1
                print("current item: ", "Suduko[",i+addToI,"][",j+addToJ,"]", Suduko[i+addToI][j+addToJ])
                if numRepeatCounterDict[Suduko[i + addToI][j + addToJ]] > 1 and Suduko[i + addToI][j + addToJ] != ".":
                    return False
        # addToI += 3

        print(numRepeatCounterDict)
        numRepeatCounterDict = resetNumRepeatCounterDict(numRepeatCounterDict)
        print(numRepeatCounterDict)
        k += 1
    return True
#
board1 = [["5","3",".",".","7",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]]
#
board2 =[["8","3",".",".","7",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]]


print(isValidSuduko(board1))

















