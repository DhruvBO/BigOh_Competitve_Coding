
'''
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays

'''


def sortArr(arr):
    for i in range(len(arr)):
        for j in range(len(arr)):
            if arr[j] > arr[i]:
                temp   = arr[j]
                arr[j] = arr[i]
                arr[i] = temp

    return arr


def findMedian(num1, num2, m, n):
    # form a single arr
    median = 0
    for i in range(len(num2)):
        num1.append(num2[i])

    num1 = sortArr(num1)
    print(num1)
    midVal = len(num1) // 2

    if len(num1)%2 == 0:
        median =  (num1[midVal] + num2[midVal]) / 2
    else:
        median = num1[midVal]

    return median


arr1 = [2, 5, 8, 9]
arr2 = [1, 3, 4, 7, 8]

m = len(arr1) # size arr1
n = len(arr2) # size arr2

print(findMedian(arr1, arr2, m, n))

