'''

i)Write a program to remove duplicate values from an array 
and returns an array of unique values. int[] removeDuplicates(int[]values) 

'''

def removeDuplicates(arr):
    uniqueArr = []
    uniqueArr.append(arr[0])
    duplicateElement = False
    for i in range(1, len(arr)):
        if len(uniqueArr) != 0:
            for j in range(len(uniqueArr)):
                if arr[i] == uniqueArr[j]:
                    duplicateElement = True

            if duplicateElement == False:
                uniqueArr.append(arr[i])
            else:
                duplicateElement = False


    return uniqueArr

arr = [1, 2, 2, 1, 5, 6, 7, 10, 2]
print(removeDuplicates(arr))