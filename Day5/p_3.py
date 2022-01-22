'''
. Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
• Integers in each row are sorted from left to right.
• The first integer of each row is greater than the last integer of the previous row.
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
• m == matrix.length
• n == matrix[i].length
• 1 <= m, n <= 100
• -104 <= matrix[i][j], target <= 104

'''

def isValuePresent(arr, target):
    i =0
    j = len(arr[0]) - 1
    counter = 0
    while i < len(arr):
        if target == arr[i][j]:
            return True

        elif target < arr[i][j]:
            j-=1

        else:
            i+=1

    return False


m1 = [[1,  2,  5,  7],
      [10, 11, 16, 20],
      [23, 30, 34, 60]]

target = 16

print(isValuePresent(m1, target))


