'''

Given a string s, find the length of the longest substring without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
•	s consists of English letters, digits, symbols and spaces.

'''

def hasCurrValueInList(charList, char):
    for i in range(len(charList)):
        if charList[i] == char:
            return True
    return False


def longestSubStr(string: str):
    i, j = 0, 0
    maxSubStrLen = 0
    subStrList = []
    while i < len(string):
        if hasCurrValueInList(subStrList, string[i]) == False:
            subStrList.append(string[i])

        else:
            if len(subStrList) > maxSubStrLen:
                maxSubStrLen = len(subStrList)
                subStrList = []
                subStrList.append(string[i])
        i += 1
    return maxSubStrLen


print(longestSubStr("abcabcbb"))
print(longestSubStr("pwwkew"))
print(longestSubStr("bbbbb"))
print(longestSubStr("qweasknfwei"))
print(longestSubStr("sadfawe"))

# print(longestSubStr("abcabcbb"))