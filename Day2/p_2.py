'''

Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum.
The function should find all triplets in the array that sum up to the target sum and return a two-dimensional
array of all these triplets. The numbers in each triplet should be ordered in ascending order, and the triplets
themselves should be ordered in ascending order with respect to the numbers they hold. If no three numbers sum up
to the target sum, the function should return an empty array

for eg
arr = [1, 3, 6, 7, 2, 9, 5], target = 10
res = [[1, 3, 6], [1, 2, 7], [2, 3, 5]]

'''
def arraySort(arr):
    for i in range(len(arr)):
        for j in range(len(arr)):
            if arr[j] > arr[i]:
                temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
    return arr

def findTriplets(arr, target):
    # sort the array
    arr = arraySort(arr)
    resList = []
    print(arr)
    i = 0

    while i < len(arr)-2:
            j =  i+1
            k = len(arr)-1
        # if arr[i] + arr[j] + arr[k] != target and i!=j and j != k and i != k:
            while j < len(arr) :
                if arr[i] + arr[j] + arr[k] == target and  k > j:
                    resList.append([arr[i], arr[j], arr[k]])
                    j += 1
                    k -= 1

                elif arr[i] + arr[j] + arr[k] > target and  k > j:
                    k -= 1

                else:
                    j += 1
            i+=1
    return resList


arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
# arr = [1, 3, 6, 7, 2, 9, 5]
target = 10
print(findTriplets(arr, target))

