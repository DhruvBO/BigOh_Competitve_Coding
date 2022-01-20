'''
ii) Write a method Boolean isKingSafe(int[][]chessBoard)
Returns true if king in the given chess board is safe from the given enemies otherwise false;
NOTE: Enemies are- Horse, Camel, Queen, Elephant only
Do not consider the colour case of the chess board for traversal of camel and all.


'''



def isElephantWayClear(posDict, greaterKey, smallerKey, obstacle):
    if obstacle == "colObstacle":
        for k, v in posDict.items():
            if  posDict[k][0] < posDict[greaterKey][0] and posDict[k][0] > posDict[smallerKey][0] and \
                    k != greaterKey and k != smallerKey and posDict[k][1] == posDict[greaterKey][1]:
                return False

    elif obstacle == "rowObstacle":
        for k, v in posDict.items():
            if posDict[k][1] < posDict[greaterKey][1] and posDict[k][1] > posDict[smallerKey][1] and k != greaterKey and k != smallerKey \
                    and posDict[k][0] == posDict[greaterKey][0] :
                return False

    return True


def isSafeFromElephant(posDict, attacker): # attacker 'E' or 'Q'
    if (posDict['K'][0] == posDict[attacker][0] or posDict['K'][1] == posDict[attacker][1]):
        if posDict['K'][1] == posDict[attacker][1]:

            if posDict['K'][0] > posDict[attacker][0]:
                if isElephantWayClear(posDict, 'K', attacker, "colObstacle") == True:
                    print("killed here 1")
                    return False

            elif posDict['K'][0] < posDict[attacker][0]:
                if isElephantWayClear(posDict, attacker, 'K', "colObstacle") == True:
                    print("killed here 2")
                    return False

        elif  posDict['K'][1] < posDict[attacker][1]:
            if isElephantWayClear(posDict, attacker, 'K', "rowObstacle") == True:
                print("killed here 3")
                return False

        elif posDict['K'][1] > posDict[attacker][1]:
            if isElephantWayClear(posDict, 'K', attacker, "rowObstacle") == True:
                print("killed here 4")
                return False

    return True


def isCamelWayClear(posDict, attacker): # attacker 'C' or 'Q'
    for k, v in posDict.items():
       # check if it lies in same diagonal # and k!='K' and k != attacker
        if abs(posDict[k][0] - posDict['K'][0]) == abs(posDict[k][1] - posDict['K'][1]) and k!='K' and k != attacker :

            if posDict['K'][0] > posDict[k][0] and posDict['K'][1] > posDict[k][1]:
                if posDict[k][0] < posDict['K'][0] and posDict[k][1] < posDict['K'][1] \
                   and posDict[k][0] > posDict[attacker][0] and posDict[k][1] > posDict[attacker][1]:
                    return False

            elif posDict['K'][0] < posDict[k][0] and posDict['K'][1] > posDict[k][1]:
                if posDict[k][0] > posDict['K'][0] and posDict[k][1] < posDict['K'][1] \
                   and posDict[k][0] < posDict[attacker][0] and posDict[k][1] > posDict[attacker][1]:
                    return False

            elif posDict['K'][0] > posDict[k][0] and posDict['K'][1] < posDict[k][1]:
                if posDict[k][0] < posDict['K'][0] and posDict[k][1] > posDict['K'][1] \
                    and posDict[k][0] > posDict[attacker][0] and posDict[k][1] < posDict[attacker][1]:
                    return False

            elif posDict['K'][0] < posDict[k][0] and posDict['K'][1] < posDict[k][1]:
                if posDict[k][0] > posDict['K'][0] and posDict[k][1] > posDict['K'][1] \
                   and posDict[k][0] < posDict[attacker][0] and posDict[k][1] < posDict[attacker][1]:
                    return False

    return True


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
    if isSafeFromElephant(posDict, 'E') == False:
        print("Killed here 5, by Elephant")
        return False


    # Horese can jump so there shouldn't be any obstacle
    # check safety from horse
    # threat : (R +- 2 and c +- 1 || R +- 1 and c +- 2 )
    if (posDict['H'][0] + 2 == posDict['K'][0] and posDict['H'][1] + 1 == posDict['K'][1]) or \
            (posDict['H'][0] + 2 == posDict['K'][0] and posDict['H'][1] - 1 == posDict['K'][1]) or \
            (posDict['H'][0] - 2 == posDict['K'][0] and posDict['H'][1] + 1 == posDict['K'][1]) or \
            (posDict['H'][0] - 2 == posDict['K'][0] and posDict['H'][1] - 1 == posDict['K'][1]) or \
            (posDict['H'][0] + 1 == posDict['K'][0] and posDict['H'][1] + 2 == posDict['K'][1]) or \
            (posDict['H'][0] + 1 == posDict['K'][0] and posDict['H'][1] - 2 == posDict['K'][1]) or \
            (posDict['H'][0] - 1 == posDict['K'][0] and posDict['H'][1] + 2 == posDict['K'][1]) or \
            (posDict['H'][0] - 1 == posDict['K'][0] and posDict['H'][1] - 2 == posDict['K'][1]):
        return False


    #check safety from camel
    # Threat: abs diff between their rows no and cols no is  equal

    if abs(posDict['K'][0] - posDict['C'][0]) == abs(posDict['K'][1] - posDict['C'][1]):
        if isCamelWayClear(posDict, 'C') == True:
            print("by C")
            return False

    # check safety from Queen
    if abs(posDict['K'][0] - posDict['Q'][0]) == abs(posDict['K'][1] - posDict['Q'][1]):
        # check for diagonal threats, using camel's fun as it has it's property too
        if isCamelWayClear(posDict, 'Q') == True:
            print("By Queen")
            return False

    # check for horizontal and vertical threats, elephant's property
    if isSafeFromElephant(posDict, 'Q') == False:
        print("By Queen E's Way")
        return False


    return True





board = [['', '' , '', '', '' , '', '', ''],
         ['', 'E' , '', '', '', '', 'C', ''],
         ['', '' , '', '', '' , '', '',''],
         ['', '' , '', '', '', '', '', ''],
         ['', '' , '', 'H','', '', '', ''],
         ['', '', '', '', 'K', '', '', ''],
         ['', '' , '', '', '', '', '', ''],
         ['', '' , '', '', '', '', '' , 'Q'],]

print(isKingSafe(board))