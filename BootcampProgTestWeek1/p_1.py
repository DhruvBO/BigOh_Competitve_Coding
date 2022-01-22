'''

You are given an array of integers nums, there is a sliding window of size k which is moving from the
very left of the array to the very right. You can only see the k numbers in the window. Each time the
sliding window moves right by one position.

Return the max sliding window.






'''

def slidingWindowMaxSum(arr, k):
    maxSum = 0
    for i in range(len(arr)-k+1):
        subSum = 0

        if i+k < len(arr):
            for j in range(k):
              subSum += arr[i+j]

        else:
            for j in range(k):
                subSum += arr[i + j]

        if subSum > maxSum:
            maxSum = subSum

    return maxSum


arr1 = [1, 2, 3, 4, 5, 6, 7, 8, 9]
arr2 = [2, 5, 7, 3, 9, 5, 4]
k = 5

print(slidingWindowMaxSum(arr1, k))

