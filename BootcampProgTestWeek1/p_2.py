'''

Find all interleavings of given strings that can be formed from all the characters of the first
and second string where the order of characters is preserved.


'''

# Git hub Link : https://github.com/DhruvBO/BigOh_Competitve_Coding

def interleaving(str1, str2):
    firstStr = str1
    secondStr = str2
    interLeavingArr = []
    for k in range(2):
        if  k > 0:
            firstStr = str2
            secondStr = str1

        # pattern 1
        interLeavingArr.append((firstStr + secondStr))

        # pattern 2
        subStr = ""
        i, j = 0, 0
        while i < len(firstStr):
            subStr += firstStr[i]
            if j < len(secondStr):
                subStr += secondStr[j]
                j+=1
            i+=1
        interLeavingArr.append(subStr)

        # pattern 3
        subStr = ""
        i, j = 0, 0
        while i < len(firstStr):
            subStr += firstStr[i]

            while j < len(secondStr):
                subStr += secondStr[j]
                j+=1
            i+= 1

        interLeavingArr.append(subStr)


    return interLeavingArr


str1 = "pq"
str2 = "rs"
print(interleaving(str1, str2))