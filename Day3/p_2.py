'''
ii) Write a method Boolean isKingSafe(int[][]chessBoard)
Returns true if king in the given chess board is safe from the given enemies otherwise false;
NOTE: Enemies are- Horse, Camel, Queen, Elephant only
Do not consider the colour case of the chess board for traversal of camel and all.


'''



def isKingSafe(chessBoard):

    # storing pos in dictionary
    posDict = {}


    # get pos of all
    for i in range(len(chessBoard[0])):
        for j in range(len(chessBoard[0])):
            if chessBoard[i][j] != '':
                posDict[chessBoard[i][j]] = [i, j]

    print(posDict)

    # check safety from elephant and queen (have elephant's property too)
    # threat when in same row or in same column
    if posDict['K'][0] == posDict['E'][0] or posDict['K'][1] == posDict['E'][1] or \
        posDict['K'][0] == posDict['Q'][0] or posDict['K'][1] == posDict['Q'][1]:
        return False


    # check safety from horse
    # threat : (R +- 2 and c +- 1 || R +- 1 and c +- 2 )

    if  (posDict['H'][0] + 2 == posDict['K'][0] and  posDict['H'][1] + 1 == posDict['K'][1])  or \
        (posDict['H'][0] + 2 == posDict['K'][0] and  posDict['H'][1] - 1 == posDict['K'][1]) or \
        (posDict['H'][0] - 2 == posDict['K'][0] and posDict['H'][1] + 1 == posDict['K'][1])  or \
        (posDict['H'][0] - 2 == posDict['K'][0] and  posDict['H'][1] - 1 == posDict['K'][1])or \
        (posDict['H'][0] + 1 == posDict['K'][0] and posDict['H'][1] + 2 == posDict['K'][1]) or \
        (posDict['H'][0] + 1 == posDict['K'][0] and posDict['H'][1] - 2 == posDict['K'][1]) or \
        (posDict['H'][0] - 1 == posDict['K'][0] and posDict['H'][1] + 2 == posDict['K'][1]) or \
        (posDict['H'][0] - 1 == posDict['K'][0] and posDict['H'][1] - 2 == posDict['K'][1]) :
        return False


    #check safety from camel and queen (have camel's property too)
    # Threat: abs diff between their rows no and cols no is  equal
    if (posDict['K'][0] + posDict['K'][1]) == (posDict['C'][0] + posDict['C'][1]) or \
       (posDict['K'][0] + posDict['K'][1]) == (posDict['Q'][0] + posDict['Q'][1])    :
        return False

    return True



board = [['', '', '', '', '', '', '', ''],
        ['', '', '', '', '', '', '', ''],
        ['', '', '', 'H', 'Q', '', '', ''],
        ['', '', '', '', '', '', '', ''],
        ['', '', '', '', '', '', '', ''],
        ['', 'C', '', '', 'K', '', '', ''],
        ['', '', '', '', '', '', '', ''],
        ['', '', 'E', '', '', '', '', ''],]

print(isKingSafe(board))